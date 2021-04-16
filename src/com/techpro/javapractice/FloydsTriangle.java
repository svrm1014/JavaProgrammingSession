package com.techpro.javapractice;

// Program to print * in Floyds format (using for and while loop) *



public class FloydsTriangle {
    public static void main (String args[]) {
//          if input is not provided prints the message
        if (args.length <= 0){
            System.out.println("Please enter an Integer number");
            return;
        }
//        Assigning input to an integer variable
        int noOfRows = Integer.parseInt(args[0]);

//        loop for noOfRows to print
        for (int row= 1; row <= noOfRows; row++) {
            int stars = 1;
//            loop for no of stars to print
            while (stars <= row) {
                System.out.print("* ");
                stars++;
            }
            System.out.println();
        }
    }
}
