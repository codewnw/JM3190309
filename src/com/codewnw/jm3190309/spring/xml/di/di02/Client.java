package com.codewnw.jm3190309.spring.xml.di.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codewnw/jm3190309/spring/xml/di/di02/spring-cfg.xml");
		Car car =(Car)context.getBean("car");
		car.driveTheCar();
	}
}
