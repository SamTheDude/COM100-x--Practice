package com.company;
/*
Program written to find the precise term based off a temperature reading.
Written by Samuel Kent
Written on Thursday, 17th October 2019
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3b {
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
        //Gets the temperature.
        String userInput = getUserInput("Input temperature: ");
        //Convert to integer value.
        int Temperature = Integer.parseInt(userInput);

        //Finds the correct verb and stores it.
        String verb = "";

        if(Temperature >= 101 && Temperature <= 120){
            verb = "Dripping";
        }else if(Temperature >= 91 && Temperature <= 100){
            verb = "Sweating";
        }else if(Temperature >= 81 && Temperature <= 90){
            verb = "Perspiring";
        }else if(Temperature >= 71 && Temperature <= 80){
            verb = "Glowing";
        }else if(Temperature >= 40 && Temperature <= 70){
            verb = "Gleaming";
        }

        //Outputs the result in a friendly manner.
        System.out.println("The tonic solfa syllable for the note " + userInput + " is " + verb + ".");
    }
}
