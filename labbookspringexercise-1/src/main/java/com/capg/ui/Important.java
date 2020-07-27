package com.capg.ui;

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
    	System.out.println(emp.getEmployeeId());
    	emp.getEmployeeName();
    	emp.getSalary();
    	System.out.println(emp.getBusiessUnit());
    	emp.getSalary();
    	emp.getSbuDetails();
    }
}
