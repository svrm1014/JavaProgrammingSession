package com.techpro.javapractice;
/*Program to print the color name, based on color code. If color code is not valid
*then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,
*W->White*/
public class ColorCode {
    public static void main (String args[]) {
//        Initializing COlor code
        char colorCode = 'z';
//        Switch Statement to get Color for given colorcode
        switch (colorCode) {
            case 'R':
                System.out.println("R -> Red");
                break;
            case 'B':
                System.out.println("B -> Blue");
                break;
            case 'G':
                System.out.println("G -> Green");
                break;
            case 'O':
                System.out.println("O -> Orange");
                break;
            case 'Y':
                System.out.println("Y -> Yellow");
                break;
            case 'W':
                System.out.println("W -> White");
                break;
//                If the colorcode is not valid prints the default message
            default:
                System.out.println("Invalid Code");
        }
    }
}
