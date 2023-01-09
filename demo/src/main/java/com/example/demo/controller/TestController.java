package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	@GetMapping
	public String testController() {
		
		return "Hello World!";
	}
	
	//localhost:8080/test/testGetMapping
	@GetMapping("testGetMapping")
	public String testControlllerWithPath() {
		return "Hello World! testGetMapping ";
	}
	//localhost:8080/test/123
	@GetMapping("/{id}")
	public String testControllerWithPathVariables(@PathVariable(required = false) int id)
	{
		return "Hello World! ID " + id;
	}
	
	//localhost:8080/test/testRequestParam?id=123
	@GetMapping("/testRequestParam")
	public String testControllerRequestParam(@RequestParam(required = false) int id) {
		return "Hello World! ID " + id; 
	}
	
	
}


