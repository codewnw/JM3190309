package com.codewnw.jm3190309.spring.scope;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		Car yourCar = car;
		Car everyOnesCar = yourCar;
		car.driveTheCar();
		System.out.println(car.hashCode());
		System.out.println(yourCar.hashCode());
		System.out.println(everyOnesCar.hashCode());
		System.out.println(car2.hashCode());
	}
}
