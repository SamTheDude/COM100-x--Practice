package com.company;
/*
Program to find the names and acidity/basicity of an amino acid when given it's code.
Written by Samuel Kent
Written on Thursday, 17th October 2019
 */

import javax.swing.*;

public class Exercise3c {
    //Defines dictionary of all of the known amino acids.
    private static final char[] AMINO_ACID_CODE = new char[]{'A','E','G','H','K','F'};
    private static final String[] AMINO_ACID_NAME = new String[]{"Alanine", "Glutamic Acid", "Glycine", "Histidine", "Lysine", "Phenylalanine"};
    private static final String[] AMINO_ACID_PH = new String[]{"Neutral", "Acidic", "Neutral", "Basic", "Basic", "Neutral"};

    //Reads user input using a JOptionPane input.
    private static String readUserInput(String userMessage){
        return JOptionPane.showInputDialog(userMessage);
    }

    public static void main(String[] args) {
        //Use the readUserInput function to get the amino acid code.
        String userInput = readUserInput("Enter an amino acid's code: ");

        //Defines the name and PH of the acid as unknown so if the lookup fails it will display them as unknown.
        String aminoAcidName = "UNKNOWN";
        String aminoAcidPH = "UNKNOWN";

        //Only runs if the input is of length 1.
        if(userInput.length() == 1) {
            //Iterates through the code array till it finds the index of
            //the code and the sets the pH and name from that index.
            for (int i = 0; i < AMINO_ACID_CODE.length; i++) {
                if (AMINO_ACID_CODE[i] == userInput.toUpperCase().charAt(0)) {
                    aminoAcidName = AMINO_ACID_NAME[i];
                    aminoAcidPH = AMINO_ACID_PH[i];
                }
            }
        }
        //Concatenates the output message.
        String outputMessage = "The amino acid is " + aminoAcidName + "." + System.lineSeparator() + "The acidity or basicity is " + aminoAcidPH + ".";
        //Outputs the message as a JOptionPane window.
        JOptionPane.showMessageDialog(null, outputMessage);
    }
}
