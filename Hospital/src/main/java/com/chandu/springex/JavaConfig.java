package com.chandu.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(32, "chandu");
		return doctor;
		
	}
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy=new Pharmacy("Sri Sai", "ameerpet");
		return pharmacy;
		
	}
	@Bean
	public Patient patient()
	{
		Patient patient=new Patient("geetha", 24, doctor(), pharmacy());
		return patient;
		
	}

}
