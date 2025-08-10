package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/")
	public String home() {
		return "<h1> This is successfully deployed through Manual Tomcat </h1>";
	}
	
	@GetMapping("/jai")
	public String balayya(){
		return "<h1>Jai Balayya !!</h1>";
	}
}
