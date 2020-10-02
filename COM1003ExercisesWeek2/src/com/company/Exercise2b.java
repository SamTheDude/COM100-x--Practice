package com.company;
/*
A program to convert miles and yards to kilometers.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

import com.company.sheffield.EasyReader;

public class Exercise2b {
    //Defined conversion constants.
    private static final float YARDS_TO_MILES = (float)1/(float)1760;
    private static final float MILES_TO_KILOMETERS = (float)1.60934;

    public static void main (String [] args) {
        //Get the number of miles and yards.
        System.out.println("Enter a distance in miles and yards");
        EasyReader keyboard = new EasyReader();
        double wholeMiles = keyboard.readDouble("How many miles? :");
        double yards = keyboard.readDouble("How many yards? :");

        //Convert miles and yards to miles then that to kilometers.
        double miles = wholeMiles + (yards * YARDS_TO_MILES);
        double kilometers = miles * MILES_TO_KILOMETERS;

        //Rounds the kilometers value to 2 decimal places.
        double roundedKilometers = (double)Math.round(kilometers * 100)/(float)100;

        //Output answer in a friendly manner.
        System.out.println(wholeMiles + " miles and " + yards + " yards is equivalent to " + roundedKilometers + "km");
    }
}
