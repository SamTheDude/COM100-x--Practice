package com.company;
/*
Program to read a file and convert the contents from pound stirling to euros and then sum the values.
Written by Samuel Kent.
Written on: Friday, 11th October 2019
 */
import com.company.sheffield.EasyReader;
import com.company.sheffield.EasyWriter;

public class Exercise2c {
    //Conversion constant definition
    private static final float STIRLING_TO_EUROS = (float)1.10;

    public static void main (String [] args) {
        //Arrays to hold amounts later.
        double[] stirling = new double[2];
        double[] euro = new double[2];

        //Set up easy reader and writer with the file location.
        EasyReader inputFile = new EasyReader("src/resources/data.txt");
        EasyWriter outputFile = new EasyWriter("src/resources/out.txt");

        //Read the information in the file.
        stirling[0] = inputFile.readDouble();
        stirling[1] = inputFile.readDouble();

        //Converts the amounts in pound stirling into euro values and sums their values.
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            double euroAmount = stirling[i] * STIRLING_TO_EUROS;
            euro[i] = (double)Math.round(euroAmount * 100)/(float)100;
            sum += euroAmount;
        }
        sum = (double)Math.round(sum * 100)/(float)100;

        //Writes euro values and sum to file.
        for (double euroAmount:euro
             ) {
            outputFile.println(euroAmount);
        }
        outputFile.print(sum);


    }
}
