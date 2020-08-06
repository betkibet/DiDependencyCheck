package com.clc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/clc/resources/byName.xml");
		Car car = (Car) context.getBean("c");
		car.printCarDetails();

	}

}
