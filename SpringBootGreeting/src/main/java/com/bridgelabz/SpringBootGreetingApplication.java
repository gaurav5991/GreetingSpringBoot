package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGreetingApplication.class, args);
		System.out.println("Spring Boot Greeting running..");
	}

}
