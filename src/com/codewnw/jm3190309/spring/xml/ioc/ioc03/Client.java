package com.codewnw.jm3190309.spring.xml.ioc.ioc03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codewnw/jm3190309/spring/xml/ioc/ioc03/spring-cfg.xml");
		Car car = context.getBean("myCar", Car.class);
		car.driveTheCar();
	}

}
