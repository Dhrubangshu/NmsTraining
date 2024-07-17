package com.wipro;

import java.util.Scanner;

public class Division {


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10; 
        }
        return sum;
    }

    public static boolean isDivisible(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isDivisible(number)) {
            System.out.println(number + " is divisible by the sum of its digits");
        } else {
            System.out.println(number + " is not divisible by the sum of its digits");
        }

        sc.close();
    }
}
