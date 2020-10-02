package com.company;
/*
Program written to advise on when to wear suncream.
Written by Samuel Kent
Written on Thursday, 17th October 2019
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3d {
    //Set up buffered reader externally as it is used more than once.
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
            try {
                //Gets the user's input.
                input = bufferedReader.readLine();
                inputGotten = true;
            } catch (Exception e) {
                //Outputs message if the read function fails.
                System.out.println("Couldn't read input. Try again...");
                //Output below is for debugging purposes.
                //System.out.println(e);
            }
        }
        //Returns the input value.
        return input;
    }

    public static void main(String[] args) {
        //Records the user's input when asked if it's sunny.
        String userInput = getUserInput("Is it sunny outside? (Y/N): ");

        //Checks if the user input is yes.
        if(userInput.toUpperCase().equals("Y")){
            //records the user response when asked which month it is.
            int month = Integer.parseInt(getUserInput("Which month is it? (1-12): "));

            //Checks which range the month is in and responds accordingly.
            //Assumes that the month is bounded between 1-12 already.
            if(month > 4 && month < 10){
                System.out.println("Remember to use sunscreen");
            }else{
                System.out.println("You don't need sunscreen unless you burn very easily");
            }
        }
    }
}
