package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise5b {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int[] userInputs = new int[10];
        int runningTotal = 0;

        for (int i = 0; i < 10; i++) {
            userInputs[i] = getIntegerInput("Enter an integer value: ");
            runningTotal += userInputs[i];
        }

        for (int i = 0; i < userInputs.length; i++) {
            System.out.println(i + " : " + userInputs[i]);
        }

        double averageValue = (double)runningTotal/10.0;
        System.out.println("The average is " + averageValue + ".");
    }

    //Get integer values from the user
    private static int getIntegerInput(String outputMessage){
        String stringInput = getUserInput(outputMessage);
        try{
            return Integer.parseInt(stringInput);
        }catch(Exception e){
            return -1;
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
            } catch (Exception e) {
                //Outputs message if the read function fails.
                System.out.println("Couldn't read input. Try again...");
            }
        }
        //Returns the input value.
        return input;
    }
}
