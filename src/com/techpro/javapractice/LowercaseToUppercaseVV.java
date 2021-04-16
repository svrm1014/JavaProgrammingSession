package com.techpro.javapractice;

/*Program to convert from upper case to lower case and vice versa of an alphabet
and print the old character and new character as shown in example (Ex: a->A, M->m)*/

public class LowercaseToUppercaseVV {
    public static void main (String args[]) {
//        initializing variable with a random alphabet
        char oldCharacter = '=';
//        converting alphabet to its ascii number to do arithmetic operation
        int oldCharacterValue = oldCharacter;
//        condition to check the alphabet ascii number is more or equal to 97
        if (oldCharacterValue >= 97){
//            if true the given alphabet is a lowercase
//            converting lower to upper by subtracting 32 so that we will get Uppercase ascii value of geven alphabet
            int oldCharacterNewValue = oldCharacterValue - 32;
            char newCharacter = (char)oldCharacterNewValue;
//            Printing Lowercase to Uppercase Ex: a--> A
            System.out.println(oldCharacter + "-->" + newCharacter);
        }else {
//            if the ascii value of given alphabet less than 97 it is a Uppercase alphabet
//            converting Upper to Lower by Adding 32 so that we'll get Lowercase of given alphabet ascii value
            int oldCharacterNewValue = oldCharacterValue + 32 ;
            char newCharacter = (char)oldCharacterNewValue;
//            printing Upper to Lower Ex: A --> a
            System.out.println( oldCharacter + "-->" + newCharacter);
        }

    }
}
