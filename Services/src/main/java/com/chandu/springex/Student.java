package com.chandu.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private EmailServices emailServices;
	@Autowired
	private CourseServices courseServices;
	

	public void details()
	{
		emailServices.message();
		courseServices.courseinfo();
	}
		
	}


