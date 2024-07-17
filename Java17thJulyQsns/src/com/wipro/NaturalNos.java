package com.wipro;

import java.util.Scanner;

public class NaturalNos {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input upper limit: ");
	        int n = sc.nextInt();
	        
	        System.out.print("Natural numbers from 1 to " + n + ": ");
	        for (int i = 1; i <= n; i++) {
	            if (i != 1) {
	                System.out.print(", ");
	            }
	            System.out.print(i);
	        }
	        
	        sc.close();
	    }

	}


