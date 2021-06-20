package com.practice.spring.spring_example_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		// Vehicle obj = (Vehicle) context.getBean("car");
		// obj.drive();

		//Tyre t = (Tyre) context.getBean("tyre");
		//System.out.println(t);
		Car c= (Car)context.getBean("car");
		c.drive();
	}
}
