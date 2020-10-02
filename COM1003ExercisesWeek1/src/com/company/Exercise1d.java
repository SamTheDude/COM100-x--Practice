package com.company;

/*
Fixed version of the sample provided in Exercise 1d. Used the
option of casting to an int and losing precision as I couldn't
change the variable z to a double and I presumed it would have
been facetious to just delete the variable and replace it with x.
Written by: Samuel Kent
Written on: Tuesday, 3rd October 2019
 */

public class Exercise1d {
    public static void main ( String [] args ) {
        //Creates an integer z with the integer value of the equation.
        int z = (int)(5/3.0);
        //Prints the integer z.
        System.out.println(z);
    }
}
