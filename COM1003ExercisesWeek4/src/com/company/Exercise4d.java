package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise4d {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Get user input for the number to use
        String userInput = getUserInput("Enter a number to try the hailstone sequence of: ");

        //Convert to an int
        int runningNumber = Integer.parseInt(userInput);

        //Output a friendly broadcast message.
        System.out.println("The hailstone sequence for this number is as follows: ");
        System.out.print(userInput);
        //Loop repeatedly until the number is zero.
        while(runningNumber != 1){
            if(runningNumber % 2 == 0){
                runningNumber = runningNumber / 2;
            }else{
                runningNumber = (runningNumber * 3) + 1;
            }
            System.out.print(", " + runningNumber);
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
