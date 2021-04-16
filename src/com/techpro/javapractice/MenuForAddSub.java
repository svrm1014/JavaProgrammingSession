package com.techpro.javapractice;

/* Program that displays a menu with options 1. Add 2. Sub Based on the options
chosen, read 2 numbers and perform the relevant operation*/

import java.util.Scanner;

public class MenuForAddSub {
    public static void main (String args[]) {
        int firstNum,secondNum,Addition,Subtraction,choice;
        do {
            System.out.println("Please Select Menu Option:\n 1. Addition\n 2. Subtraction");
            Scanner input = new Scanner(System.in);
            int menuOption = input.nextInt();
            if (menuOption <= 2){
                System.out.println("Enter Two numbers ");
                firstNum = input.nextInt();
                secondNum = input.nextInt();
            }else {
                System.out.println("Invalid MenuOption");
                break;
            }
            switch (menuOption) {
                case 1:
                    System.out.println("Addition of Given Numbers:" + (firstNum + secondNum));
                    break;
                case 2:
                    System.out.println("Subtraction of Given Numbers:" + (firstNum - secondNum));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do you want to continue? Enter 1.Yes 2.No :");
            choice = input.nextInt();
            }while ( choice == 1);


    }
}
