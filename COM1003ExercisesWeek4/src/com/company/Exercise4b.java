package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4b {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Get an odd number from the user.
        String userInput = getUserInput("Enter an odd number: ");
        int height = Integer.parseInt(userInput);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

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
}
