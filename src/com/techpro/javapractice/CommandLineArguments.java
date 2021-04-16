package com.techpro.javapractice;
// program to check if the program has received command line arguments or not
public class CommandLineArguments {
    public static void main(String args[]) {
//        Storing length of input in a variable (n)
        int n = args.length;
//        if the input contain data then prints the input by comma separator
        if(n > 0) {
//            if true print the arguments/input  one by one with comma separator until last but one
            for (int i=0;i< n-1;i++) {
                System.out.print(args[i] + ",");
            }
//            printing last index data
          System.out.print(args[n-1]);
        }else
//            if there is no input then prints No Values message
            System.out.println("No Values");
    }
}
