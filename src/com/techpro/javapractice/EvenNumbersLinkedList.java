package com.techpro.javapractice;

import java.util.*;

public class EvenNumbersLinkedList {
           //    Creating evenNumberArrayList to store Even numbers
        static List<Integer> evenNumberLinkedList = new LinkedList<>();
        //    Creating multipleWithTwo array to store Multiple of evenNumber array
        static List<Integer> multipleWithTwo = new LinkedList<>();
        static boolean flag = false;


        public static void main (String[] args) {
            System.out.println("Enter Number to get even numbers :");
            Scanner input = new Scanner(System.in);
            int numberToGetEvenNumbers = input.nextInt();
            saveEvenNumbers(numberToGetEvenNumbers);
            printEvenNumbers();
            System.out.println("Enter the number to search in LinkedList");
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

            for (int i = 0; i < evenNumberLinkedList.size(); i++ ) {
                if(evenNumberLinkedList.get(i) == searchElement){
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
            for(int i = 0 ; i < evenNumberLinkedList.size(); i++) {
                multipleWithTwo.add(evenNumberLinkedList.get(i) * 2);
            }
            System.out.println("Array after multiply with 2 is:" + multipleWithTwo);
            return multipleWithTwo;
        }

//    Method to save the even numbers with in 2 and given number(n)

        public static List<Integer> saveEvenNumbers(int n) {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0)
                    evenNumberLinkedList.add(i);
            }
            System.out.println("Even number between 2 and given number :" + evenNumberLinkedList);
            return evenNumberLinkedList;
        }
}

