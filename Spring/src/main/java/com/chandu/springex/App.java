package com.chandu.springex;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        System.out.println("*******************");
        
       Greetingimpl greetingimpl= context.getBean("greet",Greetingimpl.class);
       greetingimpl.greet();
        
        
    }
}
