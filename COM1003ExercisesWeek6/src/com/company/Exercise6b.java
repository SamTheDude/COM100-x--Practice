package com.company;

import com.company.sheffield.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Exercise6b {

    private static final int CHART_HEIGHT = 300;
    private static final int BAR_WIDTH = 30;

    public static void main(String[] args) {
        //Get all the numbers and make a counter array.
        int[] numbers = readNumbers();
        int[] counter = new int[20];

        //count how many of each number there are into the counter array.
        for (int number:numbers
             ) {
            counter[number-1]++;
        }

        //work out the relative heights and the tallest bar.
        double[] heightModifiers = new double[20];
        int tallestBar = 0;
        for (int i = 0; i < counter.length; i++) {
            heightModifiers[i] = ((double)counter[i])/1000;

            if(counter[i] > counter[tallestBar]){
                tallestBar = i;
            }
        }

        //multiply them all so the scale is from 1-0.
        double scaleFactor = 0.95/heightModifiers[tallestBar];
        for (int i = 0; i < heightModifiers.length; i++) {
            heightModifiers[i] = heightModifiers[i] * scaleFactor;
        }

        //Instantiate the easy graphics class.
        EasyGraphics chartWindow = new EasyGraphics(BAR_WIDTH*heightModifiers.length, CHART_HEIGHT);

        //make the chart.
        for (int i = 0; i < heightModifiers.length; i++) {
            //Calculate the pixel height of the bar then draw it.
            int barHeight = (int)Math.round(((double)CHART_HEIGHT)*heightModifiers[i]);
            chartWindow.drawRectangle(i*BAR_WIDTH, 0, BAR_WIDTH, barHeight);
        }
    }

    //reads in all the values from the file and returns them as and integer array.
    private static int[] readNumbers(){
        EasyReader fileReader = new EasyReader("src/resources/onethousandnumbers.txt");

        int[] values = new int[1000];

        for (int i = 0; i < 1000; i++) {
            values[i] = fileReader.readInt();
        }

        return values;
    }
}
