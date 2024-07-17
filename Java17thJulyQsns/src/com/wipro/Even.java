package com.wipro;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input upper range: ");
	        int n = sc.nextInt();
	        
	        System.out.print("Even numbers between 1 to " + n + ":\n");
	        for (int i = 2; i <= n; i += 2) {
	            if (i != 2) {
	                System.out.print(", ");
	            }
	            System.out.print(i);
	        }
	        
	        sc.close();

	}

}
