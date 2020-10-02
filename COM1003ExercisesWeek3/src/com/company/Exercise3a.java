package com.company;
/*
Program written to convert from a note's name to it's tonic solfa syllable.
Written by Samuel Kent
Written on Thursday, 17th October 2019
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3a {
    //Set up two arrays to act as a dictionary.
    private static final char[] NOTES = new char[]{'C', 'D', 'E', 'F', 'G', 'A', 'B'};
    private static final String[] TONIC_SOLFA_SYLLABLES = new String[]{"Doh", "Ray", "Me", "Fah", "Soh", "La", "Ti"};

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //function for reading user input.
    private static String getUserInput(String outputMessage){
        //function wide input string to be returned
        String input = "";

        //Loop until the reading of the user's input doesn't fail.
        boolean inputGotten = false;
        while (!inputGotten) {
            //Outputs the message input to the function
            System.out.print(outputMessage);

            //Set up buffered reader in a try catch statement for getting the user's input from the console.
            try{
                //Gets the user's input.
                input = bufferedReader.readLine();
                inputGotten = true;
                bufferedReader.close();
            } catch (Exception e) {
                //Outputs message if the read function fails.
                System.out.println("Couldn't read input. Try again...");
            }
        }
        //Returns the input value.
        return input;
    }


    public static void main(String[] args) {
        //Get user input of which note to convert to.
        String noteName = getUserInput("Enter the name of a note to get it's tonic solfa syllable: ");

        //String for the final tonic solfa syllable.
        String tonicSolfaSyllable = "";
        for (int i = 0; i < NOTES.length; i++) {
            if(noteName.toUpperCase().toCharArray()[0] == NOTES[i]){
                tonicSolfaSyllable = TONIC_SOLFA_SYLLABLES[i];
            }
        }

        //Returns the correct message.
        if(tonicSolfaSyllable.equals("")){
            System.out.println("That is not a valid note name.");
        }else{
            System.out.println("The note " + noteName + "'s tonic solfa syllable is " + tonicSolfaSyllable + ".");
        }
    }
}
