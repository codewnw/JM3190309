package com.codewnw.jm3190309.spring.di.di04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car =(Car)context.getBean("car");
		car.driveTheCar();
	}
}
