package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
        //normal for loop.
        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 Euro at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************************************");

        //More advanced for loop this is me just exploring possibilities.
        for (int i = 0; i < 7; i++) {
            System.out.println("10.000 Euro at " + (i +2) + "% interest = "
                    + String.format("%.2f", calculateInterest(10000.0, (i +2))));
        }

        System.out.println("******************************************************");

        //reverse for loop
        for (int i = 8; i >=2; i--) {
            System.out.println("10.000 Euro at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************************************");

        //Prime numbers exercise.

        int counter = 0;
        for (int i = 100; i < 200; i++) {

            if (isPrime(i)) {
                counter++;
                System.out.println("Number " + i + "is a prime number.");
                if (counter==3) {
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    //Algorithm for prime numbers.
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <=n/2 ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
