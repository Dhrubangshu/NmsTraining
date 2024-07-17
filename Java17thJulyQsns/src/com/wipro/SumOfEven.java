package com.wipro;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input upper limit of even numbers: ");
	        int n = sc.nextInt();
	        
	        int sum = 0;
	        
	       
	        for (int i = 2; i <= n; i += 2) {
	            sum += i;
	        }
	        
	        System.out.println("Sum of even numbers between 1 to " + n + ": " + sum);
	        
	        sc.close();

	}

}
