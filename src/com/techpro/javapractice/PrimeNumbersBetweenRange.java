package com.techpro.javapractice;

// Program to print prime numbers between 10 and 99.

public class PrimeNumbersBetweenRange {
    public static void main (String args[]) {
//        loop to get prime numbers between 10-99
        System.out.println("Prime Numbers between 10 to 99:");
        for (int i = 10; i <= 99; i++) {
//            Setting boolean variable to false to check prime
            boolean flag = false;
//            for each number between 10-99 checks the prime number condition
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
//                    if it is not prime set flag to true
                    flag = true;
                    break;
                }
            }
//            if the variable/number in i prime then prints the number
            if (!flag){
                System.out.println(i);
            }
        }
    }
}
