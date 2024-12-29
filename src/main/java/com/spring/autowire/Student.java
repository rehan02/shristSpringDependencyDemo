package com.spring.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	@Qualifier("frontend")
	private CourseDetails courseDetails; //autowiring by type
	
	@Autowired
	private CourseDetails backend; //autowiring by name
	
	private CourseDetails details;  //autowiring by constructors
	public Student(@Qualifier("databases") CourseDetails details) {
		super();
		this.details = details;
	}

	public List<String> showCourses(String choice) {
		if(choice.equals("f"))
			return courseDetails.getAllCourses();
		if( choice.equals("b"))
			return backend.getAllCourses();
		if( choice.equals("d"))
			return details.getAllCourses();
		return null;
	}
}