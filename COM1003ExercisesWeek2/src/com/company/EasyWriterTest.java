package com.company;
/*
This is just to test where the output for the file is located when using
the easy reader and writer and thus how my paths need to be structured.
The result is that the home directory is COM1003ExercisesWeek2 thus
/src/resources is needed.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

import com.company.sheffield.EasyWriter;

public class EasyWriterTest {
    public static void main (String [] args) {
        //Set up instance of easy writer.
        EasyWriter writer = new EasyWriter("test.txt");

        //Writes test to the test file to see where the file is created.
        writer.println("test");
    }
}
