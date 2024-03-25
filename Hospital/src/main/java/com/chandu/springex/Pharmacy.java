package com.chandu.springex;

public class Pharmacy {
	private String name;
	private String location;
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void pharminfo()
	{
		System.out.println("pharmacy name.."+name);
		System.out.println("pharmacy location.."+location);
	}

}
