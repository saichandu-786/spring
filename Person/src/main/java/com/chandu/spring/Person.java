package com.chandu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	private Homeloan homeloan;
	@Autowired
	private Realestate realestate;
//	@Autowired
//	public Person(Homeloan homeloan, Realestate realestate) {
//		super();
//		this.homeloan = homeloan;
//		this.realestate = realestate;
//	}
	
	

//	   public Homeloan getHomeloan() {
//		return homeloan;
//	}
//
//
//@Autowired
//	public void setHomeloan(Homeloan homeloan) {
//		this.homeloan = homeloan;
//	}
//
//
//	public Realestate getRealestate() {
//		return realestate;
//	}
//
//
//@Autowired
//	public void setRealestate(Realestate realestate) {
//		this.realestate = realestate;
//	}
//


	public void perinfo()
	   {
		   homeloan.loaninfo();
		   realestate.realinfo();
	   }

}
