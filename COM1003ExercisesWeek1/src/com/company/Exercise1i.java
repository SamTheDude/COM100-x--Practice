package com.company;

/*
Program to verify which equation is the correct equation out of the list provided.
Written by: Samuel Kent
Written on: Tuesday, 3rd October 2019
 */

public class Exercise1i {
    public static void main(String [] args){
        //Define loan parameters.
        double principalSum = 10000;
        double months = 8;
        double interestRate = 0.07;

        //Create an array for holding different answers.
        double[] equationResults = new double[4];

        //Try all the provided equations.
        equationResults[0] = principalSum*interestRate/1200*Math.pow(1+interestRate/1200,months)/Math.pow((1+interestRate/1200),months)-1;
        equationResults[1] = (interestRate/1200*Math.pow(1+interestRate/1200,months)/Math.pow(1+interestRate/1200,months)-1)*principalSum;
        equationResults[2] = principalSum*interestRate/1200*Math.pow(1+interestRate/1200,months)/(Math.pow(1+interestRate/1200,months)-1);
        equationResults[3] = principalSum*(interestRate/1200*Math.pow(1+interestRate/1200,months))/Math.pow(1+interestRate/1200,months)-1;

        //Correct equation.
        double correctEquationResult = ((interestRate/1200)*(Math.pow((1+(interestRate/1200)),months))/(Math.pow((1 + (interestRate/1200)),months) - 1)) * principalSum;
        //For debugging purposes.
        //System.out.println(correctEquationResult);

        //Test each equation's result against the correct result
        for (int i = 0; i < 4; i++) {
            //For debugging purposes.
            //System.out.println(equationResults[i]);
            if(Math.round(equationResults[i]) == Math.round(correctEquationResult)){
                System.out.println("Equation at index " + i + " is correct returning " + equationResults[i] + " as expected.");
            }
        }
    }
}
