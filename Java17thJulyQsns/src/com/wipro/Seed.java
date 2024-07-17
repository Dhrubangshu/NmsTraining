package com.wipro;

import java.util.Scanner;

public class Seed {


    public static int productOfDigits(int number) {
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
    public static boolean isSeed(int X, int Y) {
        int product = X * productOfDigits(X);
        return product == Y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the first number (X): ");
        int X = sc.nextInt();
        
        System.out.print("Enter the second number (Y): ");
        int Y = sc.nextInt();

       
        if (isSeed(X, Y)) {
            System.out.println(X + " is a seed of " + Y);
        } else {
            System.out.println(X + " is not a seed of " + Y);
        }

        sc.close();

	}

}
