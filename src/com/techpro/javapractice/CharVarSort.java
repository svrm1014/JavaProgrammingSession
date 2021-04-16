package com.techpro.javapractice;
//program and display the characters in alphabetical order.
public class CharVarSort {
    public static void main(String args[]) {
//        initializing two char variables
        char firstchar = 's', secondchar = 'A';
//        comparing two characters and printing in alphabetical order
        if (firstchar < secondchar) {
            System.out.println(firstchar + "\n" + secondchar);
        } else
            System.out.println(secondchar + "\n" + firstchar);

    }
}
