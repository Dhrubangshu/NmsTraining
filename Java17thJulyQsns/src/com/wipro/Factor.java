package com.wipro;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = sc.nextInt();
        
        System.out.print("Factors of " + num + ": ");
        
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i != 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }
        
        System.out.println();
        
        sc.close();
	}

}
