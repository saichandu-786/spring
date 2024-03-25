package com.chandu.springex;

import org.springframework.stereotype.Component;

@Component
public class Javacourseservices implements CourseServices {

	@Override
	public void courseinfo() {
		System.out.println("welcome to java full stack ");
		System.out.println("core java adv java spring boot microservices");
		
	}

}
