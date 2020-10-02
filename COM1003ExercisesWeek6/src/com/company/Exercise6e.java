package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise6e {
    public static void main(String[] args) {
        double[][] locations = new double[4][2];

        for (int i = 0; i < locations.length; i++) {
            locations[i] = getLocationCoordinates(i+1);
        }

        //works out the total distance the salesman travels.
        //
        for (int i = 0; i < locations.length - 1; i++) {

        }
    }

    private static double[] getLocationCoordinates(int locationName){
        double[] coordinates = new double[2];

        //Output number of the location to make it clear what the user should enter.
        System.out.println("Input the coordinates for location number " + locationName + " below.");

        //Get the coordinates into the correct positions in the array.
        coordinates[0] = getUserInput("Enter x coordinate: ");
        coordinates[1] = getUserInput("Enter y coordinate: ");

        return coordinates;
    }

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //function for reading double input.
    private static double getUserInput(String outputMessage){
        //function wide input string to be returned
        double input = 0;

        //Loop until the reading of the user's input doesn't fail.
        boolean inputGotten = false;
        while (!inputGotten) {
            //Outputs the message input to the function
            System.out.print(outputMessage);

            //Set up buffered reader in a try catch statement for getting the user's input from the console.
            try{
                //Gets the user's input.
                input = Double.valueOf(bufferedReader.readLine());
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
