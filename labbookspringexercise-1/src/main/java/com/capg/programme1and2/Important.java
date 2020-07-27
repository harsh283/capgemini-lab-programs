package com.capg.programme1and2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Important 
{
    public static void main( String[] args )
    {
       //ApplicationContext context = 
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Employee emp=(Employee)context.getBean("employee");
    	System.out.println(emp);
    }
}
