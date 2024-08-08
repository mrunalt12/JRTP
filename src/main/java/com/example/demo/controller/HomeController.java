package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/show")
	public String show() {
		String abs="pre approved command";
		return "this is my method show";
	}

	@GetMapping("/get")
	public String get() {
		string str="1234";
		return "this is my method get";

	}
	@GetMapping("/find")
	public String find() {
		String str="this is my method find";
		
		return str;

	}
	@GetMapping("/display")
	public String display() {
		String str="this is my method display";
		
		return str;

	}

}
