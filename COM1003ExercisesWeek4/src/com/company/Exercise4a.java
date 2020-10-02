package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4a {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Get the user's choice of card.
        String cardSuit = getUserInput("Input the name of a suit you are interested in: ");

        //Set the enum's value and makes sure the input value is put to lower case.
        CardSuits suit = CardSuits.valueOf(cardSuit.toLowerCase());

        //variable for the card's colour
        String cardColour = "";

        //Switch statement to work out if the card is red or black.
        switch (suit){
            case spades: case clubs:
                cardColour = "black";
                break;
            default:
                cardColour = "red";
                break;
        }

        //Output a message in a friendly manner.
        System.out.println("The colour of the " + suit.name() + " suit is " + cardColour + ".");
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
