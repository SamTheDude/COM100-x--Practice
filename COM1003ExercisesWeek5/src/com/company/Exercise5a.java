package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise5a {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        double[] randomArray = new double[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
            System.out.println(i + " : " + randomArray[i]);
        }

        System.out.println();

        boolean programEnd = false;

        while(!programEnd) {
            int arayIndex = getIntegerInput("Enter an array index: ");

            if (-1 < arayIndex && arayIndex < 10) {
                System.out.println("The value at index " + arayIndex + " is " + randomArray[arayIndex]);
            }else{
                programEnd = true;
            }
        }
    }

    //Get an integer from the user between 0-9
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
