package com.company;

/*
Class to calculate the approximate value of the radius and
circumference of a circle given it's radius.
Written by: Samuel Kent
Written on: Tuesday, 3rd October 2019
 */

public class Exercise1f {
    public static void main(String [] args){
        //Define radius of circle.
        double radius = 5.0;

        //Calculate all of the values.
        double PI = 22.0/7.0;
        double circumference = 2 * PI * radius;
        double area = PI * (radius * radius);

        //Output all found values.
        System.out.println("The radius is " + radius);
        System.out.println("The circumference is " + circumference);
        System.out.println("The area is " + area);
    }
}
