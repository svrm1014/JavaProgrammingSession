package com.techpro.javapractice;
/*Program to accept gender ("Male" or "Female") and age (1-120) from command
line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
8.3% Gender ==> Male Age ==>61-120
*/
public class InterestRate {
    public static void main (String args[]) {
        try {
//        Converting second String argument(age) to int
        int stringTointAge = Integer.parseInt(args[1]);
//        check if the condition is female and age between 1-58 prints the Message
            if ((args[0].equals("Female")) && (stringTointAge <= 58 && stringTointAge >= 1)) {
                System.out.println("Interest == 8.2% ");
            }
//        check if the condition is female and age between 59-120 prints the Message
            else if ((args[0].equals("Female")) && (stringTointAge <= 120 && stringTointAge >= 59)) {
                System.out.println("Interest == 7.6% ");
            }
//        check if the condition is male and age between 1-60 prints the Message
            else if ((args[0].equals("Male")) && (stringTointAge <= 60 && stringTointAge >= 1)) {
                System.out.println("Interest == 9.2% ");
            }
//        check if the condition is male and age between 61-120 prints the Message
            else if ((args[0].equals("Male")) && (stringTointAge <= 120 && stringTointAge >= 61)) {
                System.out.println("Interest == 8.3%");
            } else {
                System.out.println("Invalid Input");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
