package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Exercise4e {

    //Set up buffered reader externally as it may used more than once.
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Read in file's contents.
        String unencryptedText = readFile("src/resources/testtext.txt");

        //test
        System.out.println(caesarShift('a', 2));

        //Get shift value.
        int shiftValue = Integer.parseInt(getUserInput("Enter shift value: "));

        //Stores a string builder for the final encrypted text.
        StringBuilder encryptedText = new StringBuilder();

        //Loop through all the elements in the string and shift them by the user defined amount.
        for (int i = 0; i < unencryptedText.length(); i++) {
            if(isLetter(Character.toString(unencryptedText.charAt(i)))){
                encryptedText.append(caesarShift(unencryptedText.charAt(i), shiftValue));
            }else{
                encryptedText.append(unencryptedText.charAt(i));
            }
        }

        //Outputs the encrypted text.
        System.out.println(encryptedText.toString());
    }

    //Checks if a string is a letter.
    private static boolean isLetter(String character){
        boolean isLetter;
        try{
            Alphabet letter = Alphabet.valueOf(character.toUpperCase());
            isLetter = true;
        }catch(Exception e){
            isLetter = false;
        }
        return isLetter;
    }

    //Function to Caesar shift a character by a certain number of places.
    private static char caesarShift(char inputCharacter, int shiftValue){
        //Converts the character to an enum.
        Alphabet character = Alphabet.valueOf(Character.toString(inputCharacter).toUpperCase());

        //Gets the index of the character using the enum.
        int index = character.getIndex();

        //Gets the shifted index.
        int shiftedIndex = (index + shiftValue) % 26;

        //Gets the char from the shifted index.
        char shiftedCharacter = (char)(((int)'a') + shiftedIndex);

        //Returns final value.
        return shiftedCharacter;
    }

    //Reads a file's contents as one string.
    private static String readFile(String fileLocation){
        StringBuilder outputText = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            String currentLine = br.readLine();

            while (currentLine != null){
                outputText.append(currentLine);
                outputText.append("/n");
                currentLine = br.readLine();
            }

        }catch (Exception e){
            System.out.println("Could not read file, path may be incorrect or file missing.");
        }
        return outputText.toString();
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
