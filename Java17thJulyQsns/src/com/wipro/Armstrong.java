package com.wipro;

import java.util.Scanner;

public class Armstrong {

	
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int numDigits = countDigits(number);
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}
