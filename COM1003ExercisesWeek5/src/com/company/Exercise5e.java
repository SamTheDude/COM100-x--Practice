package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise5e {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Enter the first array: ");
        int[][] array1 = getArrayOfIntegerArrays();

        System.out.println("Enter the second array: ");
        int[][] array2 = getArrayOfIntegerArrays();

        if(array1.length == array2.length && array1[0].length == array2[0].length){
            int[][] result = new int[array1.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                System.out.println();
                for (int j = 0; j < array1[0].length; j++) {
                    result[i][j] = array1[i][j] + array2[i][j];
                    System.out.print(result[i][j] + " ");
                }
            }
        }


    }

    //Gets an array of ints from the user.
    private static int[][] getArrayOfIntegerArrays(){
        //Get dimensions of the array
        int rows = getIntegerInput("Enter the number of rows in the matrix: ");
        int columns = getIntegerInput("Enter the number of columns in the matrix: ");

        int[][] returnArray = new int[rows][columns];

        for (int i = 0; i < returnArray.length; i++) {
            for (int j = 0; j < returnArray[i].length; j++) {
                returnArray[i][j] = getIntegerInput("Input value for row " + i + " column " + j + ": ");
            }
        }

        return returnArray;
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
