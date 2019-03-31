package com.codewnw.jm3190309.spring.xml.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codewnw/jm3190309/spring/xml/scope/prototype/spring-cfg.xml");
		Car car = context.getBean("myCar", Car.class);
		Car car2 = context.getBean("myCar", Car.class);
		Car car3 = context.getBean("myCar", Car.class);
		car.driveTheCar();
		
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
	}

}
