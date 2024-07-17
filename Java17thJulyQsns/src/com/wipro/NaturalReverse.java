package com.wipro;

import java.util.Scanner;

public class NaturalReverse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input N: ");
	        int n = sc.nextInt();
	        
	        System.out.print("Natural numbers from " + n + " to 1 in reverse: ");
	        for (int i = n; i >= 1; i--) {
	            if (i != n) {
	                System.out.print(", ");
	            }
	            System.out.print(i);
	        }
	        
	        sc.close();

	}

}
