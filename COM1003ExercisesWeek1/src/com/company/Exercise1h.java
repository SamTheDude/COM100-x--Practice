package com.company;

/*
Class to compute the value for the square of the hypotenuse of a triangle.
Written by: Samuel Kent
Written on: Tuesday, 3rd October 2019
 */


public class Exercise1h {
    public static void main(String [] args){
        //Define side lengths.
        int a = 3, b = 4;

        //Calculate hypotenuse length
        int hypotenuse = (a * a) + (b * b);

        //Output hypotenuse and side length in a sentence.
        System.out.println("The square of the hypotenuse for a right angled triangle with side lengths " + a + " and " + b + " is " + hypotenuse + ".");
    }
}
