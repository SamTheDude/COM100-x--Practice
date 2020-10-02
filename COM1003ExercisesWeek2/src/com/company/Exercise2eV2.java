package com.company;
/*
Program to separate the area code and the telephone number from each other.
Version 2 uses a slightly more optimised algorithm.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */

import javax.swing.*;

public class Exercise2eV2 {
    public static void main (String [] args) {
        //Gets the full number
        String phoneNumber = JOptionPane.showInputDialog("What is your phone Number?");

        //Create Strings.
        StringBuilder areaCode = new StringBuilder();
        StringBuilder number = new StringBuilder();

        //Split the string on the first space into the two above variables.
        boolean spaceFound = false;
        for (char substring:phoneNumber.toCharArray()
             ) {
            if(spaceFound){
                number.append(substring);
            }else{
                if(substring == ' '){
                    spaceFound = true;
                }else{
                    areaCode.append(substring);
                }
            }
        }

        //Outputs the area code and number in a friendly format.
        String concatenatedMessage = "The area code is: " + areaCode + System.getProperty("line.separator") + "The telephone number is: " + number;
        JOptionPane.showMessageDialog(null, concatenatedMessage);
    }
}
