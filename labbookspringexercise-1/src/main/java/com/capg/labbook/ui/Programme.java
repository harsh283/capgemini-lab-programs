package com.capg.labbook.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.configuration.ConfigurationClas;
import com.capg.dao.EmployeeDao;
import com.capg.model.Employee;



public class Programme {
	@Autowired
	private static EmployeeDao dao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	

    	
    	try (OutputStream output = new FileOutputStream("App.properties")) {
    		Scanner scanner=new Scanner(System.in);
        	System.out.println("Enter the Employee id");
        	Properties prop = new Properties();
        	prop.setProperty("employee.empId", String.valueOf(scanner.nextInt()));
        	
        	
        	System.out.println("Enter the name of employee");
        	prop.setProperty("employee.empName", scanner.next());
        
        	System.out.println("Enter the designation");
        
        	prop.setProperty("employee.designation", scanner.next());
        
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClas.class);
    	
    	System.out.println(dao.empCollection());
	}

}
