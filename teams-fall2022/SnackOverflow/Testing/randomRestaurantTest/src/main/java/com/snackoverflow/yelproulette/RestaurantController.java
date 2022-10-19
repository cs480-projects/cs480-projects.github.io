
package com.snackoverflow.yelproulette;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.joda.time.*;

import java.util.List;
import java.util.Random;

@SpringBootApplication
@RestController
@CrossOrigin
@RequestMapping("/api")
public class RestaurantController {

	String[] restaurantData = {"Taco Bell", "Wendy's", "Chipotle", "McDonalds", "Raising Canes"};
	Instant prevTime = Instant.now();
	boolean onRefreshPage = false;
	long durationInSeconds = 0;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantController.class, args);
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

	@GetMapping("/randomRestaurant")
	public String randomRestaurant(String restaurant){	//argument used to remove randomness
		return "You landed on " + restaurant + "!";
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

	/*
	@GetMapping("/restaurant/name")
	public ResponseEntity<List<Restaurant>> findByName(){

	}
	*/

	public String[] getRestaurants(){
		return restaurantData;
	}

}


