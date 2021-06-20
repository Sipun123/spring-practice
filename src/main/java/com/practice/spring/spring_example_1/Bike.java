package com.practice.spring.spring_example_1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Bhaag raha hai ...........");
	}

}
