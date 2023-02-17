package com.myfirstspringproject.firstspringvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

@SpringBootApplication
public class FirstSpringVideoApplication {

	private static final String POSTS_API_URL = "https://jsonplaceholder.typicode.com/posts";

	public static void main(String[] args) throws IOException, InterruptedException {
		// SpringApplication.run(FirstSpringVideoApplication.class, args);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.header("accept", "appplication/json")
				.uri(URI.create(POSTS_API_URL))
				.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

}
