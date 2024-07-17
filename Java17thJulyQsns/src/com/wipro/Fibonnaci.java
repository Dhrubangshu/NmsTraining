package com.wipro;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input number of terms: ");
	        int terms = sc.nextInt();
	        
	        int a = 0; 
	        int b = 1; 
	        int c;    
	        
	        System.out.print("Fibonacci series: \n");
	        
	        for (int i = 1; i <= terms; i++) {
	            System.out.print(a + ", ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        
	        sc.close();

	}

}
