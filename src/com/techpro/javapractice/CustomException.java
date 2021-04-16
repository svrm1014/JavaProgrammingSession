package com.techpro.javapractice;

import java.util.Scanner;

// Program to get CustomException

//Defining Userdefined Exception by extending the parent class Exception

public class CustomException extends Exception {
//    Created Class constructor to call exception class
    public CustomException(String s) {
        super(s);

    }
}
class UserDefinedExceptionAddition{
    public static void main(String[] args){
//        Throwing customException
        try {
            throw new CustomException("No Input :");
        } catch (CustomException customException) {
            System.out.println("UserDefined Exception");
            System.out.println(customException.getMessage());
        }
    }


}
