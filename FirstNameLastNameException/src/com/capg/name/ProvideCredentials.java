package com.capg.name;

import java.util.Scanner;

public class ProvideCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
String firstName="";
String lastName="";
Controller con=new Controller();
try {
	String name=con.controls(firstName, lastName);
}
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
