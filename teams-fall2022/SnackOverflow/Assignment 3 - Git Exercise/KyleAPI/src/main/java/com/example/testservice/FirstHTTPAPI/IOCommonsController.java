/* Name: Kyle Tam
 * Team: Snack Overflow
 * Professor Yu Sun
 * Date: 10/6/2022
 */

/* Can be run with the URL http://localhost:8080/customMessage
   This will print the default message "Hello World" 
   alongside the number of characters in the message through a byte array.
   The message can be changed to something else by adjusting the URL to
   http://localhost:8080/customMessage?content=[TEXT_HERE], like 
   http://localhost:8080/customMessage?content=Kyle
*/

package com.example.testservice.FirstHTTPAPI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.io.input.TeeInputStream;
import org.apache.commons.io.output.TeeOutputStream;

@SpringBootApplication
@RestController

public class IOCommonsController 
{
	private static final String template = "Hello World.";
	private static final String error = "Something went wrong.";

	public static void main(String[] args) 
	{
		SpringApplication.run(IOCommonsController.class, args);
	}
	
	@GetMapping("/customMessage")
	public CustomMessage customMessage(@RequestParam(value = "content", defaultValue = "Hello World") String content) 
	{
		try 
		{
			return new CustomMessage(String.format(usingTeeInputStream(content)));
		} 
		catch (IOException e) 
		{
			return new CustomMessage(String.format(error, content));
		}
	}
	
	public String usingTeeInputStream(String content) throws IOException 
	{
		TeeInputStream teeInputStream = null;
		TeeOutputStream teeOutputStream = null;
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream(content.getBytes("US-ASCII"));
		ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
		ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
		teeOutputStream = new TeeOutputStream(outputStream1, outputStream2);
		teeInputStream = new TeeInputStream(inputStream, teeOutputStream, true);
		teeInputStream.read(new byte[template.length()]);
		teeInputStream.close();
		return outputStream1.toString() + " |  Size of byte array: " + outputStream1.size();
	}
}
