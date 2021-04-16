package com.techpro.javapractice;

/* Program to get and store in ArrayList Prime numbers between 2 and given number,
*and multiply prime numbers with 2 and store in another arraylist,
*and searching evenNumber arraylist to find the given number*/

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EvenNumbersArrayList {
//    Creating evenNumberArrayList to store Even numbers
    static List<Integer> evenNumberArrayList = new ArrayList<>();
//    Creating multipleWithTwo array to store Multiple of evenNumber array
    static List<Integer> multipleWithTwo = new ArrayList<>();
    static boolean flag = false;


    public static void main (String[] args) {
        System.out.println("Enter Number to get even numbers :");
        Scanner input = new Scanner(System.in);
        int numberToGetEvenNumbers = input.nextInt();
        saveEvenNumbers(numberToGetEvenNumbers);
        printEvenNumbers();
        System.out.println("Enter the number to search in Array");
        int searchElement = input.nextInt();
        try {
            int searchResult = printEvenNumber(searchElement);
            System.out.println(searchResult);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    /* Method to search the given element in evenNumbersArray
    *And returns the element if found else return zero(0) */

    private static int printEvenNumber(int searchElement) {
//        Comparing each element in the array with given element

        for (int i = 0; i < evenNumberArrayList.size(); i++ ) {
            if(evenNumberArrayList.get(i) == searchElement){
                flag = true;
                System.out.println("Element found ");
            }
        }
        if (!flag) {
            throw new NoSuchElementException("No Such Element Found");
        }else {
            return searchElement;
        }
    }

//    Method to multiply each element in evenNumberArray with number 2 and stores in another array called multipleWithTwo

    public static List<Integer> printEvenNumbers() {
        for(int i = 0 ; i < evenNumberArrayList.size(); i++) {
            multipleWithTwo.add(evenNumberArrayList.get(i) * 2);
        }
        System.out.println("Array after multiply with 2 is:" + multipleWithTwo);
        return multipleWithTwo;
    }

//    Method to save the even numbers with in 2 and given number(n)

    public static List<Integer> saveEvenNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                evenNumberArrayList.add(i);
        }
        System.out.println("Even number between 2 and given number :" + evenNumberArrayList);
        return evenNumberArrayList;
    }
}
