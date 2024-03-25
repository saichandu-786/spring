package com.chandu.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("geetha");
		person.setEmail("geetha@seetha.com");
		return person;	
	}
	@Bean
	public Person person2()
	{
		Person person=new Person();
		person.setName("nagamani");
		person.setEmail("nagamani@bushhh.com");
		return person;	
	}
	@Bean
	public Person person3()
	{
		Person person=new Person();
		person.setName("jaya");
		person.setEmail("jaya@pandhi.com");
		return person;	
	}

}
