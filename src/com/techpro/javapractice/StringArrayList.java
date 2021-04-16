package com.techpro.javapractice;

// ArrayList Program which will be able to store only Strings.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("This");
        al.add("is");
        al.add("ArrayList");
        al.add("Example");
        al.add("to");
        al.add("Store");
        al.add("Strings");
        printAll(al);
    }

    private static void printAll(List<String> al) {
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*for (int i= 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }*/
    }
}
