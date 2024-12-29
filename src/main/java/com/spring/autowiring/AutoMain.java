package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.autowire.Student;

public class AutoMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.spring.autowire");
		 Student student = context.getBean("student",Student.class);
		 student.showCourses("f").forEach(System.out::println);
		 System.out.println();
		 student.showCourses("b").forEach(System.out::println);
		 System.out.println();
		 student.showCourses("d").forEach(System.out::println);
		 System.out.println();
	}
}
