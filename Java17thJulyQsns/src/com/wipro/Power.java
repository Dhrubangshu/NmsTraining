package com.wipro;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input base: ");
	        int base = sc.nextInt();
	        
	        System.out.print("Input exponent: ");
	        int exponent = sc.nextInt();
	        
	       
	        long power = 1;
	        
	        
	        for (int i = 1; i <= exponent; i++) {
	            power *= base;
	        }
	        
	        System.out.println(base + " ^ " + exponent + " = " + power);
	        
	        sc.close();
	}

}
