package com.codewnw.jm3190309.spring.scope.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
		
		Car car = (Car) context.getBean("car");
		
		car.driveTheCar();
		((AnnotationConfigApplicationContext)context).close();
	}
}
