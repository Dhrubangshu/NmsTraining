package com.wipro;

import java.util.Scanner;

public class LuckyNumber {
	
    public static boolean isLuckyNumber(int number) {
        String numStr = String.valueOf(number);
        int sumOfSquares = 0;

     
        for (int i = 1; i < numStr.length(); i += 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sumOfSquares += digit * digit;
        }

       
        return sumOfSquares % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number");
        } else {
            System.out.println(number + " is not a lucky number");
        }

        sc.close();
    }
}
