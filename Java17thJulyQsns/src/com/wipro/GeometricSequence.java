package com.wipro;

import java.util.Scanner;

public class GeometricSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements (n): ");
	        int n = sc.nextInt();
	        
	      
	        int term = 1;
	        
	        System.out.print("Geometric sequence:");
	        
	    
	        for (int i = 1; i <= n; i++) {
	            System.out.print(" " + term);
	            if (i < n) {
	                System.out.print(",");
	            }
	            term *= 2; 
	        }
	        
	        System.out.println();
	        
	        sc.close();

	}

}
