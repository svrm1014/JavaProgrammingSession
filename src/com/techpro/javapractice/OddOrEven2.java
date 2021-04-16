package com.techpro.javapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

//Program to check the given number is odd or even
public class OddOrEven2 {
    public static void main(String args[]) {
        try {
            System.out.println("Please enter the number to check Odd or Even:");
//        Reading input(number) from the console
            Scanner in = new Scanner(System.in);
//        Storing the number in variable n
            int n = in.nextInt();
//        passing the given number to the OddOrEven method to check ood/even
            oddOrEvenChecker(n);
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException);
        }


    }
// Method to check the given number odd or even
    private static void oddOrEvenChecker(int n) {
//      if the number is Even, the number should divisible by 2
        if ( n%2 == 0 || n == 0) {
            System.out.println("The given number is Even");
        }
//      prints the message  if the number is Odd
        else if ( n==1 || n%2 !=0 ) {
            System.out.println("The given number is Odd");
        }

    }

}
