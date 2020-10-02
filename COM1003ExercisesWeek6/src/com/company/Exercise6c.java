package com.company;

import com.company.sheffield.EasyGraphics;

public class Exercise6c {
    //Constants for the height and width of the window.
    private static final int WINDOW_WIDTH = 700;
    private static final int WINDOW_HEIGHT = 700;
    //Relatively scaled max circle size.
    private static final int MAX_CIRCLE_SIZE = ((WINDOW_HEIGHT + WINDOW_WIDTH)/5);

    public static void main(String[] args) {
        EasyGraphics circleWindow = new EasyGraphics(WINDOW_WIDTH, WINDOW_HEIGHT);

        //repeat the circle drawing 50 times.
        for (int i = 0; i < 50; i++) {
            //randomise diameter.
            int diameter = randInt(MAX_CIRCLE_SIZE);
            //Randomise coordinates and correct to centre of circle.
            int circlex = randInt(WINDOW_WIDTH) - diameter/2;
            int circley = randInt(WINDOW_HEIGHT) - diameter/2;
            //randomise colour
            circleWindow.setColor(randInt(255), randInt(255), randInt(255));

            //draw the circle.
            circleWindow.fillEllipse(circlex, circley, diameter, diameter);
        }
    }

    //returns a random int from 0 to the bound argument.
    private static int randInt(int bound){
        return (int)Math.round(Math.random()*bound);
    }
}
