package com.techpro.javapractice;

// Program to print first 5 values which are divisible by 2, 3, and 5

public class FiveValuesDivisibleBy {
    public static void main(String args[]) {
//        initializing counter variable to limit the number of value to be printed
        int counter = 0;
        System.out.println("Values Divisable by 2,3, and 5:");
//        loop to get values
            for (int i = 2; i <= 300; i++) {
//                condition if the int i is divisible by 2,3, and 5 then enter in to the loop
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//                    if divisible then increasing the counter value
                    counter++;
//                    printing divisible value
                    System.out.println(i);
                }
//                return if 5 values printed
                while (counter >= 5){
                    return;
            }
        }
    }
}
