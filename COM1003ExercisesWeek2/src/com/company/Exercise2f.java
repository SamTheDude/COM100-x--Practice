package com.company;
/*
Program to replace all instances of the 4th character in a string with asterisks.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

import com.company.sheffield.EasyReader;

public class Exercise2f {
    //Defined as a constant for easy replacement.
    private static final char REPLACE_CHAR = '*';

    public static void main (String [] args) {
        //Defined an instance of EasyReader for later.
        EasyReader consoleInput = new EasyReader();

        //Gets the string to be used.
        System.out.print("Input string: ");
        String userInput = consoleInput.readString();

        //Collect the position of the string at the forth position.
        char removeChar = userInput.charAt(3);

        //Replace all the instances of the char with an asterisk.
        String outputString = userInput.replace(removeChar, REPLACE_CHAR);

        //Output the result in a friendly manner.
        System.out.println("The result is: " + outputString);
    }
}
