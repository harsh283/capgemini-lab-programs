package com.capg.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.capg.model.Employee;

public class EmployeeDao {

	ArrayList<Employee> empList=new ArrayList();
@Autowired
Employee emp;
public ArrayList<Employee> empCollection()
{
	System.out.println(empList.add(emp));
	return empList;
	
}
}
