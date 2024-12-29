package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.contr.Showroom;
import com.spring.contr.Vehicle;
import com.spring.setter.Address;
import com.spring.setter.Employee;
import com.spring.setter.StudentDetails;

public class DependencyMain {

	public static void main(String[] args) {
		// Create the IoC container
		
	ApplicationContext context=new AnnotationConfigApplicationContext("com.spring");
		Employee employee = context.getBean("employee",Employee.class);
		
		StudentDetails details= context.getBean(StudentDetails.class);
		details.showCourses("database").forEach(System.out::println);
		
		System.out.println();
		Vehicle vehicle=context.getBean(Vehicle.class);
		vehicle.showInsurance();
		
		System.out.println();
		Showroom showroom=context.getBean("showroom",Showroom.class);
		showroom.showBrands().forEach(System.out::println);
	//java	
//	Employee employee=new Employee();
//	employee.setEmpId(1);
//	employee.setEmpName("Jo");
//	//create address object
//	Address address=new Address();
//	address.setCity("Chennai");
//	address.setState("TN");
	//set address to employee
//	employee.setAddress(address);
	//call the method
	//employee.printDetails();
}
	
}
