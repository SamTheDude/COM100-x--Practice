package com.company;

/*
Class written to work out the value of x given that x = (a+b/c*d-a*c/2).
Written by: Samuel Kent
Written on: Tuesday, 3rd October 2019
 */

public class Exercise1e {
    public static void main(String [] args){
        //Defines the values of the integers a, b, c and d.
        int a=4, b=9, c=3, d=2;
        //Performs the requred function and outputs the result to x.
        int x = a+b/c*d-a*c/2;
        //Outputs the value of x such that it can be read logically from the command line.
        System.out.println("The value of x is " + Integer.toString(x));
    }
}

