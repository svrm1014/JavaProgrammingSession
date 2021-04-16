package com.techpro.javapractice;

// Program to check if a given number is prime or not

public class PrimeNumberChecker {
    public static void main (String args[]) {
        try {
//        converting input to a integer variable
            int numberToCheckPrime = Integer.parseInt(args[0]);

//        Initializing boolean variable to false
            boolean flag = false;

//        If the given number is zero or one

            if (numberToCheckPrime == 0 || numberToCheckPrime == 1) {
                System.out.println(numberToCheckPrime + " is neither prime nor composite");
                return;
            }


//        loop to check prime number
            for (int i = 2; i <= numberToCheckPrime / 2; i++) {
//            If the remainder is zero then it is a non prime number
                if (numberToCheckPrime % i == 0) {
//               Number is not prime so Setting flag to true
                    flag = true;
//                Even enter oncce, it is not a prime ,using break coming out of loop
                    break;
                }
            }
//        if the flag does not change then it is a prime number
            if (flag == false) {
                System.out.println(numberToCheckPrime + " is Prime Number");
            }
//        if flag override then it is not a prime
            else
                System.out.println(numberToCheckPrime + "The given Number is not a Prime");
        }catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        }

    }
}
