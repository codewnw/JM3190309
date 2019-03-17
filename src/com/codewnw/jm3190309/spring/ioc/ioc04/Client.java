package com.codewnw.jm3190309.spring.ioc.ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
		Car car = (Car)context.getBean("myCar");
		car.driveTheCar();
	}
}
