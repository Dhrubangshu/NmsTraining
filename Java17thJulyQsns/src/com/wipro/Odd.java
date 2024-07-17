package com.wipro;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input upper limit: ");
	        int n = sc.nextInt();
	        
	        System.out.print("Odd numbers between 1 to " + n + ":\n");
	        for (int i = 1; i <= n; i += 2) {
	            if (i != 1) {
	                System.out.print(", ");
	            }
	            System.out.print(i);
	        }
	        
	        sc.close();

	}

}
