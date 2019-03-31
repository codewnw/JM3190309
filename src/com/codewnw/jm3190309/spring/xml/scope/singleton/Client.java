package com.codewnw.jm3190309.spring.xml.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codewnw/jm3190309/spring/xml/scope/singleton/spring-cfg.xml");
		Car car = context.getBean("myCar", Car.class);
		Car car2 = context.getBean("myCar", Car.class);
		car.driveTheCar();
		
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
	}

}
