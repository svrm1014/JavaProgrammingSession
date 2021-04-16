package com.techpro.javapractice;

// Program to find if the given number is palindrome or not

public class PalindromeNumber {
    public static void main (String args[]) {
//        Initializing numerToCheck and reverseofGivenNumber, declaring variable called remainder
        int palindromeNumToCheck = 1221, reverseOfGivenNumber = 0, remainder;
//        Storing given number to another variable
        int givenNumber = palindromeNumToCheck;
//        loop to run until the number is zero
//        To get the reverse of given number into reverseOfGivenNumber
        while (givenNumber != 0) {
            remainder = givenNumber % 10;
            reverseOfGivenNumber = reverseOfGivenNumber * 10 + remainder;
            givenNumber = givenNumber / 10;
        }
//        if the given number and reverse of given number are same then prints given number is palindrome
//        else prints not a palindrome
        if (palindromeNumToCheck == reverseOfGivenNumber){
            System.out.println(palindromeNumToCheck + " is a Palindrome");
        }else
            System.out.println(palindromeNumToCheck + " is not a Palindrome");
    }

}
