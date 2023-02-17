package com.example.springtest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/movies")
	public String getMovies(@RequestParam(name="movies", required=false) String movies, Model model) {
		model.addAttribute("movies", movies);
		return parseMovies.getMovies();
	}

	@GetMapping("/predicate")
	public String getICE(@RequestParam(name="predicate", required=false) String predicate, Model model) {
		model.addAttribute("predicate", predicate);
		return PredicateEx.getICE();
	}
	
	//Duc Thanh Nguyen
	 @GetMapping("/hi")
	 public String hi(@RequestParam(value = "name", defaultValue = "a good day!!!") String name) {
	 	return String.format("Haveeeeee %s!", name);
	 }
	
	//Noe Rivera
	@GetMapping("/aboutus")
	public String aboutus(@RequestParam(value = "name", defaultValue = "get to know our team!") String name) 
	{
		return String.format("Welcome future SunBreaker, %s!", name);
	}
	
	//Tyler Kloss
	@GetMapping("/howdy")
	public String howdy(@RequestParam(value = "name", defaultValue = "Partner") String name) {
		return String.format("Howdy %s!", name);
	}
}
