package com.wipro;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number : ");
	        int number = sc.nextInt();
	        
	     
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long factorial = 1;
	            for (int i = 1; i <= number; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial of " + number + " = " + factorial);
	        }
	        
	        sc.close();

	}

}
