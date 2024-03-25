package com.chandu.springex;

public class Greetingimpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("good morning");
		System.out.println("i am chandu");
	}

	public Greetingimpl() {
		System.out.println("object created");
		// TODO Auto-generated constructor stub
	}
	

}
