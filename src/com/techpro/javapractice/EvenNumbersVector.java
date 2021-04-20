package com.techpro.javapractice;

import java.util.*;

public class EvenNumbersVector {
//        Creating evenNumbeerVector to store Even numbers
    static List<Integer> evenNumberVector = new Vector<>();
//        Creating multipleWithTwo vector to store Multiple of evenNumber vector
    static List<Integer> multipleWithTwo = new Vector<>();
    static boolean flag = false;

    public static void main(String[] args) {
        System.out.println("Enter Number to get even numbers :");
        Scanner input = new Scanner(System.in);
        int numberToGetEvenNumbers = input.nextInt();
        saveEvenNumbers(numberToGetEvenNumbers);
        printEvenNumbers();
        System.out.println("Enter the number to search in Vector");
        int searchElement = input.nextInt();
        try {
            int searchResult = printEvenNumber(searchElement);
            System.out.println(searchResult);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println(e);
        }
    }

//     Method to search the given element in evenNumberVector
//     *And returns the element if found else return zero(0)

    private static int printEvenNumber(int searchElement) {
//        Comparing each element in the vector with given element

        for (int i = 0; i < evenNumberVector.size(); i++) {
            if (evenNumberVector.get(i) == searchElement) {
                flag = true;
                System.out.println("Element found ");
            }
        }
        if (!flag) {
            throw new NoSuchElementException("No Such Element Found");
        } else {
            return searchElement;
        }
    }

//    Method to multiply each element in evenNumberVector with number 2 and stores in another vector called multipleWithTwo

    public static List<Integer> printEvenNumbers() {
        for (int i = 0; i < evenNumberVector.size(); i++) {
            multipleWithTwo.add(evenNumberVector.get(i) * 2);
        }
        System.out.println("Vector after multiply with 2 is:" + multipleWithTwo);
        return multipleWithTwo;
    }

//    Method to save the even numbers with in 2 and given number(n)

    public static List<Integer> saveEvenNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                evenNumberVector.add(i);
        }
        System.out.println("Even number between 2 and given number :" + evenNumberVector);
        return evenNumberVector;
    }
}
