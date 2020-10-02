package com.company;
/*
A program to calculate the volume of a sphere
Written by SDN 
7 August 2015
*/
//Adapted to run in the current intellij
//environment Friday, 11th October 2019

import com.company.sheffield.*;

public class Exercise2a {
    public static void main (String [] args) {

        EasyReader keyboard = new EasyReader();
        int radius = keyboard.readInt("What is the radius of your sphere? ");

        System.out.print("The volume of a sphere with the radius "+radius+" is ");
        System.out.println( 4.0/3.0 * Math.PI * Math.pow(radius, 3));

    }
}