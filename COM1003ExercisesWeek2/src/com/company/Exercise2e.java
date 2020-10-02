package com.company;
/*
Program to separate the area code and the telephone number from each other.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

import javax.swing.JOptionPane;

public class Exercise2e {
    public static void main (String [] args) {
        //Gets the full number
        String phoneNumber = JOptionPane.showInputDialog("What is your phone Number?");

        //Finds the index of the first space.
        boolean spaceFound = false;
        int stringIndex = 0;
        while (!spaceFound){
            if(phoneNumber.charAt(stringIndex) == ' '){
                spaceFound = true;
            }else{
                stringIndex ++;
            }
        }

        //Using the index creates number and area code variables.
        String areaCode = phoneNumber.substring(0, stringIndex);
        String number = phoneNumber.substring(stringIndex + 1, phoneNumber.length());

        //Outputs the area code and number in a friendly format.
        String concatenatedMessage = "The area code is: " + areaCode + System.getProperty("line.separator") + "The telephone number is: " + number;
        JOptionPane.showMessageDialog(null, concatenatedMessage);
    }
}
