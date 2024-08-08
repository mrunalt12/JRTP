package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/show")
	public String show() {
		
		return "this is my method find";
	}
	@GetMapping("/find")
	public String find() {
		
		return "this is my method find";
	}

}
