package com.wipro;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input num: ");
	        int num = sc.nextInt();
	        
	        
	        int count = 0;
	        
	       
	        int absNum = Math.abs(num);
	        
	  
	        while (absNum > 0) {
	            absNum /= 10;
	            count++;
	        }
	        
	        System.out.println("Number of digits: " + count);
	        
	        sc.close();

	}

}
