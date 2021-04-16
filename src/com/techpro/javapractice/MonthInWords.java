package com.techpro.javapractice;

// Program to print month in words, based on input month in numbers ex: input:12 outpot: December

import java.awt.print.PrinterException;

public class MonthInWords {
    public static void main(String args[]) {
        try {
//        converting input/Month(String) to integer
            int monthNum = Integer.parseInt(args[0]);
//        using switch statement Getting the Month in words
            switch (monthNum) {
//            if the Month number is 1 prints January
                case 1:
                    System.out.println("January");
//            if true exits from the loop
                    break;
//            if the Month number is 2 prints February
                case 2:
                    System.out.println("February");
                    break;
//            if the Month number is 3 prints March
                case 3:
                    System.out.println("March");
                    break;
//            if the Month number is 4 prints April
                case 4:
                    System.out.println("April");
                    break;
//            if the Month number is 5 prints May
                case 5:
                    System.out.println("May");
                    break;
//            if the Month number is 6 prints June
                case 6:
                    System.out.println("June");
                    break;
//            if the Month number is 7 prints July
                case 7:
                    System.out.println("July");
                    break;
//            if the Month number is 8 prints August
                case 8:
                    System.out.println("August");
                    break;
//            if the Month number is 9 prints September
                case 9:
                    System.out.println("September");
                    break;
//            if the Month number is 10 prints October
                case 10:
                    System.out.println("October");
                    break;
//            if the Month number is 11 prints November
                case 11:
                    System.out.println("November");
                    break;
//            if the Month number is 12 prints December
                case 12:
                    System.out.println("December");
                    break;
//            If the input is not between 1-12 prints invalid input
                default:
                    throw new PrinterException("Invalid Month");
            }
        }catch (PrinterException printerException) {
            System.out.println(printerException);
        }
    }
}
