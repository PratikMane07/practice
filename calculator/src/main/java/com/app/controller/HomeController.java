package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/add/{num1}/{num2}")
	public int addition(@PathVariable int num1, @PathVariable int num2)
	{
	         int result = num1 + num2;	
	         return result;
	}
	
	@GetMapping("/sub/{num1}/{num2}")
	public int subtractionByIshwar(@PathVariable int num1, @PathVariable int num2)
	
	{
		
		int result = num1-num2;
		
		
		
		return result;
		
	}
	
	
	
}
