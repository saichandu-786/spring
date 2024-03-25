package com.chandu.springex.Beans;

public class Bus implements Vehicle {
	
	private String bustype;
	private int maxspeed;

	public String getBustype() {
		return bustype;
	}

	public void setBustype(String bustype) {
		this.bustype = bustype;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	@Override
	public void move() {
		System.out.println("you are selected bus vehicle");
		System.out.println("bustype is...."+bustype);
		System.out.println("maxspeed is..."+maxspeed);
		
		
	}

}
