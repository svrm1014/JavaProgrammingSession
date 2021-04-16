package com.techpro.javapractice;

// Program on ArrayList which will be able to store only numbers like int,float,double,etc.

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStoreDiffdatatypes {
    public static void main(String[] args) {
//        creating ArrayList
        List<Object> al = new ArrayList<Object>();
//        adding data to arraylist
        al.add(123);
        al.add(11);
        al.add(78.48900F);
        al.add(3.32938F);
        al.add(123.1235678D);
        al.add("String");
//        Printing arraylist
        System.out.println(al);
    }
}
