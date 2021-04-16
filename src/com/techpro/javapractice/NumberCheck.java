package com.techpro.javapractice;

//program to check if a given number is Positive, Negative, or Zero.

import java.util.Scanner;


public class NumberCheck {
    public static void main(String args[]){
//        Taking input from user
            System.out.println("Please enter the number to check Positive/Negative/Zero ");
            Scanner in = new Scanner(System.in);
//        Storing input in variable n
            int n = in.nextInt();
//        passing variable n to numberChecker Method to check the number
            numberChecker(n);
        }

//numberChecker method to check the given number (n) is positive/Negative/Zero
    public static void numberChecker(int n) {

/* if the given number is equal to zero prints zero,
if the number is less than zero then prints as Negative
if the number is greater than zero prints as positive number */

        if (n == 0) {
            System.out.println("The Given number is Zero");
        } else if (n < 0) {
            System.out.println("The given number is Negative ");
        } else if (n > 0) {
            System.out.println("The given number is Positive");
        } else
            System.out.println("The given number is invalid ");
    }

}
