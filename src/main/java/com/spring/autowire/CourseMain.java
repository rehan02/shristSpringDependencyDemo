package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.autowiring.ShapeFactory;

public class CourseMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.spring.autowiring");

		ShapeFactory shapeFactory=context.getBean("shapeFactory",ShapeFactory.class);
		shapeFactory.printArea("r",10,20);
	}	
}
