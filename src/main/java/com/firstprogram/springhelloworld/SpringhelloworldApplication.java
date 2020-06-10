package com.firstprogram.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value="/controller1")
@SpringBootApplication
public class SpringhelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringhelloworldApplication.class, args);
	}

//	@GetMapping(value="/check/{value1}/{value2}")
//	public Integer getData(@PathVariable Integer value1,
//						   @PathVariable Integer value2){
//		return value1+value2;
//	}
}
