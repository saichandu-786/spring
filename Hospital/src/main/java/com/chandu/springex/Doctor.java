package com.chandu.springex;

public class Doctor { 
	private int id;
	private String name;
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void docinfo()
	{
		System.out.println("doctor id.."+id);
		System.out.println("doctor name.."+name);
	}

}
