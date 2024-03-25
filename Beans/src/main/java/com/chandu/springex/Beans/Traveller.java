package com.chandu.springex.Beans;

public class Traveller {
	
	private String name;
	private long phone;
	private String email;
	Vehicle vehicle;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void startjourney()
	{
		System.out.println("Hey.."+name+"Welcome to chandu travels");
		System.out.println("check your mobile no.."+phone+"email.."+email);
		vehicle.move();
	}

}
