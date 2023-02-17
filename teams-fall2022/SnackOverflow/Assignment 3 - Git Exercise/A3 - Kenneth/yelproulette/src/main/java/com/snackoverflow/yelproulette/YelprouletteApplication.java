
package com.snackoverflow.yelproulette;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.joda.time.*;
import java.util.Random;

@SpringBootApplication
@RestController
@CrossOrigin
public class YelprouletteApplication {

	String[] restaurantData = {"Taco Bell", "Wendy's", "Chipotle", "McDonalds", "Raising Canes"};
	Instant prevTime = Instant.now();
	boolean onRefreshPage = false;
	long durationInSeconds = 0;

	public static void main(String[] args) {
		SpringApplication.run(YelprouletteApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/randomRestaurant")
	public String randomRestaurant() {
		Random r = new Random();
		return "You landed on " + restaurantData[r.nextInt(restaurantData.length)] + "!";
	}

	@GetMapping("lastRefresh")
	public String lastRefresh() {
		if(onRefreshPage) {
			Duration duration = new Duration(prevTime, Instant.now());
			durationInSeconds = duration.getMillis();
			prevTime = Instant.now();
			return "This page was refreshed " + (double)durationInSeconds/1000 + " seconds ago";
		}
		else {
			onRefreshPage = true;
			return "Testing joda time Instant and Duration classes";
		}

	}

}

