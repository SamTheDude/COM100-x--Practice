package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5d {

    private static final String BEE_NEWS_FILE_PATH = "src/resources/beenews.txt";

    public static void main(String[] args) {
        String fileDump = readFile(BEE_NEWS_FILE_PATH);
        fileDump = fileDump.replace(".", "");

        String[] words = fileDump.split(" ");
        Arrays.sort(words);

        String currentWord = "";

        for (String word:words
             ) {
            if(!word.equals(currentWord)){
                currentWord = word;
                System.out.println(word);
            }
        }
    }

    private static int compare(String string1, String string2){
        return string1.compareTo(string2);
    }

    //Reads a file's contents as one string.
    private static String readFile(String fileLocation){
        StringBuilder outputText = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            String currentLine = br.readLine();

            while (currentLine != null){
                outputText.append(currentLine);
                currentLine = br.readLine();
            }

        }catch (Exception e){
            System.out.println("Could not read file, path may be incorrect or file missing.");
        }
        return outputText.toString();
    }
}
