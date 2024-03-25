package com.chandu.springex.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Traveller traveller=context.getBean("traveller",Traveller.class);
        traveller.startjourney();
        
    }
}
