package com.capg.programme3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Important {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("spring2");
Sbu business=(Sbu)context.getBean("sbu");
System.out.println(business);
	}

}
