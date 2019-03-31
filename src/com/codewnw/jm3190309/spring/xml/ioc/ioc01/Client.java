package com.codewnw.jm3190309.spring.xml.ioc.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
//		Car car = new Car();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codewnw/jm3190309/spring/xml/ioc/ioc01/spring-cfg.xml");
		Car car = context.getBean("myCar", Car.class);
		car.driveTheCar();
	}

}
