package com.techpro.javapractice;

// Program to add all the values in a given number and print. Ex: 1234->10

public class SumOfDigitsOfNumber {
    public static void main (String args[]) {
//        initialization of sumOfDigits variable to store sum, declaration of lastDigit variable
        int sumOfDigits = 0,lastDigit;
//        defining the number in integer variable to get sum
        int number = 890;
        int givenNumber = number;
//        runs till last digit and store the sum of digits in sumOfDigits variable;
        while (number != 0 ) {
            lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            number = number /10;

        }
        System.out.println("Sum of Digits of given number is : " + givenNumber + "->" + sumOfDigits);

    }
}
