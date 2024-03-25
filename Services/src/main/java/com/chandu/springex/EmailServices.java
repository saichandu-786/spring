package com.chandu.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailServices implements MessageServices {

	@Override
	public void message() {
		System.out.println("this is your email id ");
		System.out.println("check it once");
		
	}

}
