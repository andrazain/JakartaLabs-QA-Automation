package com.javaprogram;

import java.util.Scanner;

public class Operation {

	Scanner input = new Scanner(System.in);
	
	public void addition (int x, int y) {
		try {
			System.out.println("");
			System.out.println("input number 1 : " );
			x = input.nextInt();
			System.out.println("input number 2 : " );
			y = input.nextInt();
			
			int total = x + y;
			System.out.println("");
			System.out.println(x + " + " + y + " = " + total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("The input must be a number!");
		}
	}
	
	
	public void subtraction (int x, int y) {
		try {
			System.out.println("");
			System.out.println("input number 1 : " );
			x = input.nextInt();
			System.out.println("input number 2 : " );
			y = input.nextInt();
			
			int total = x - y;
			System.out.println("");
			System.out.println(x + " - " + y + " = " + total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("The input must be a number!");
		}
	}
	
	
	public void multiplication (int x, int y) {
		try {
			System.out.println("");
			System.out.println("input number 1 : " );
			x = input.nextInt();
			System.out.println("input number 2 : " );
			y = input.nextInt();
			
			int total = x * y;
			System.out.println("");
			System.out.println(x + " * " + y + " = " + total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("The input must be a number!");
		}
	}
	
	
	public void division (float x, float y) {
		try {
			System.out.println("");
			System.out.println("input number 1 : " );
			x = input.nextInt();
			System.out.println("input number 2 : " );
			y = input.nextInt();
			
			float total = x / y;
			System.out.println("");
			System.out.println(x + " / " + y + " = " + total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("The input must be a number!");
		}
	}
	
	
	
}
