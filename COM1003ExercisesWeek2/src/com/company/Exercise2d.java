package com.company;
/*
Program to use the JOptionPane lib to ask the user for their given and family name and return their full name.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */
import javax.swing.JOptionPane;

public class Exercise2d {
    public static void main (String [] args) {
        //Get given and family name.
        String givenName = JOptionPane.showInputDialog("What is your given name?");
        String familyName = JOptionPane.showInputDialog("What is your family name?");

        //Concatenate the names.
        String fullName = givenName + " " + familyName;

        //Output user's full name.
        //System.out.println(fullName);
        JOptionPane.showMessageDialog(null, "Hello, your name is " + fullName);
    }
}
