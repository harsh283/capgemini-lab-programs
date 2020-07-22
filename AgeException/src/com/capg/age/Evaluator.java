package com.capg.age;

import java.util.Scanner;

public class Evaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		int n;
		try {
			n=scanner.nextInt();
			if(n>15)
			{
				throw new AgeEvaluatorException("Evaluated");
			}
		} catch (AgeEvaluatorException e) {
			// TODO: handle exception
		System.out.println(e);
		}

	}

}
