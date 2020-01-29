package com.example.bancolombia.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class DemoController {

	@GetMapping(value = "hello")
	public String index() {
		return "Hello World";
	}

}

