package com.wipro;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input upper limit: ");
	        int n = sc.nextInt();
	        
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        
	        System.out.println("Sum of natural numbers 1-" + n + ": " + sum);
	        
	        sc.close();

	}

}
