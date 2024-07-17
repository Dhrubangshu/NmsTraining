package com.wipro;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input number: ");
	        int number = sc.nextInt();
	        
	        int originalNumber = number;
	        int reversedNumber = 0;
	        
	        
	        while (number != 0) {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;
	        }
	        
	        System.out.println("Reverse of " + originalNumber + " = " + reversedNumber);
	        
	        sc.close();

	}

}
