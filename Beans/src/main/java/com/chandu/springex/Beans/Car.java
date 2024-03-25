package com.chandu.springex.Beans;

public class Car implements Vehicle {
	private String fueltype;
	private int maxspeed;
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	@Override
	public void move() {
		System.out.println("you are selected car vehicle");
		System.out.println("fueltype is...."+fueltype);
		System.out.println("maxspeed is..."+maxspeed);
		
	}
	

}
