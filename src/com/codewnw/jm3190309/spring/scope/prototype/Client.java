package com.codewnw.jm3190309.spring.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
		Car car = (Car) context.getBean("car");
		Car car2 =  context.getBean("car", Car.class);
		Car car3 =  context.getBean("car", Car.class);
		
		Car yourCar = car;
		
		car.driveTheCar();
		
		System.out.println(car.hashCode());
		System.out.println(yourCar.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
	}
}
