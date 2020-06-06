package com.firstprogram.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/controller1")
@SpringBootApplication
public class SpringhelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhelloworldApplication.class, args);
	}

	@GetMapping(value="/check")
	public String getData(){
		return "Hello Spring";
	}
}
