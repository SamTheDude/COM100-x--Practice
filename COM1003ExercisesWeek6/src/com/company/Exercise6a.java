package com.company;

import com.company.sheffield.EasyGraphics;

public class Exercise6a {
    private static final int BOX_WIDTH = 50;

    public static void main(String[] args) {
        //Instantiate the Easy graphics class to draw the picture.
        EasyGraphics graphicsWindow = new EasyGraphics(11*BOX_WIDTH,20*BOX_WIDTH);

        //Draws the person and jitters the colour before each shape.
        //Draw feet
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*3, BOX_WIDTH*2, BOX_WIDTH*2, BOX_WIDTH);
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*6, BOX_WIDTH*2, BOX_WIDTH*2, BOX_WIDTH);
        //Draw Legs
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*3, BOX_WIDTH*3, BOX_WIDTH*2, BOX_WIDTH*4);
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*6, BOX_WIDTH*3, BOX_WIDTH*2, BOX_WIDTH*4);
        //Draw Body
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*3, BOX_WIDTH*7, BOX_WIDTH*5, BOX_WIDTH*6);
        //Draw Hands
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*2, BOX_WIDTH*8, BOX_WIDTH, BOX_WIDTH);
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*8, BOX_WIDTH*8, BOX_WIDTH, BOX_WIDTH);
        //Draw Arms
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*2, BOX_WIDTH*9, BOX_WIDTH, BOX_WIDTH*4);
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*8, BOX_WIDTH*9, BOX_WIDTH, BOX_WIDTH*4);
        //Draw Neck
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*5, BOX_WIDTH*13, BOX_WIDTH, BOX_WIDTH);
        //Draw Head
        jitterColour(graphicsWindow);
        graphicsWindow.drawRectangle(BOX_WIDTH*4, BOX_WIDTH*14, BOX_WIDTH*3, BOX_WIDTH*3);
    }

    private static EasyGraphics jitterColour(EasyGraphics graphicsWindow){
        graphicsWindow.setColor((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        return graphicsWindow;
    }
}
