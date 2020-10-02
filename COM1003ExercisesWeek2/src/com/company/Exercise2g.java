package com.company;
/*
Program to find location of start of lowercase alphabet in unicode and also to find
out if the difference between the values for 9 and 0 in unicode is 9.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

public class Exercise2g {
    public static void main (String [] args) {
        //Find id of lowercase 'a' char as that's the start of the unicode lowercase alphabet.
        int startLowercase = (int)'a';

        //Find the values of the unicode for 9 and 0.
        int zeroUnicode = (int)'0';
        int nineUnicode = (int)'9';

        //Check if the values for 9 and 0 are 9 apart.
        boolean areNineAppart = false;
        if((nineUnicode - zeroUnicode) == 9){
            areNineAppart = true;
        }

        //Output conclusions
        System.out.println("The starting place for the lowercase alphabet in unicode is " + startLowercase);

        if(areNineAppart){
            System.out.println("The value for 0 in unicode is 9 less than the value for 9.");
        }else{
            System.out.println("The value for 0 in unicode is not 9 less than the value for 9.");
        }
    }
}
