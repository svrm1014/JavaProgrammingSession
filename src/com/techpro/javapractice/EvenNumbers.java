package com.techpro.javapractice;

/* Program to print even numbers between 23 and 57 ,each on new line */

public class EvenNumbers {
    public static void main(String args[]) {
//        loop to print even number between 23-27
        for (int i = 23; i <= 57; i++) {
//            Condition to check number,if the remainder equals to zero then prints the number
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
