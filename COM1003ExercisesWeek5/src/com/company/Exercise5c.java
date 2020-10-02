package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise5c {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int[] array1 = getIntegerArray(5, 1);
        int[] array2 = getIntegerArray(5, 2);

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1, array2)){
            System.out.println("The two lists have the same contents");
        }

    }

    //Get an array of ints from the user
    private static int[] getIntegerArray(int numberOfItems, int listNumber){
        int[] output = new int[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            output[i] = getIntegerInput("Enter array value " + i + " of list " + listNumber + ": ");
        }

        return output;
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
