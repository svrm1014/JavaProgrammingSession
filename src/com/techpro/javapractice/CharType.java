package com.techpro.javapractice;
/*program to print if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character" */

public class CharType {
    public static void main (String args[]) {
//        Initializing a character
        char randomchar = '8';
//        condition if the character ASCII number between 48-57 then prints Message as Digit
        if (randomchar <= 57 && randomchar >= 48) {
            System.out.println("The give character is a Digit");
        }
//        Condition to check if the character ASCII number between a-z or A-Z then prints Message as Aplhabet
        else if ((randomchar >= 'a' && randomchar <= 'z') || (randomchar >= 'A' && randomchar <= 'Z')) {
            System.out.println("The given Character is Alphabet");
        }else
//        If the given character is not alphabet or digit then prints Message as Special Character
        {
            System.out.println("The given Character is Special character ");
        }
    }
}
