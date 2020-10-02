//Using strict javascript.
"use strict";

//Get the three variables
var startingSum = parseFloat(prompt("Enter initial sum of money"));
var finalSum = parseFloat(prompt("Enter desired sum of money"));
var anualInterestRate = parseFloat(prompt("Enter anual interest rate as a percentage"));

var years = 0;
var yearsFound = false;
var runningTotal = parseFloat(startingSum);
var interestMultiplier = 1 + (anualInterestRate/100);


while (runningTotal < finalSum) {
    years ++;
    runningTotal = runningTotal * interestMultiplier;
}

document.write("For the sum of £" + startingSum + " the number of years to reach £" + finalSum + " at the interest rate of " + anualInterestRate + "% is " + years + " year(s).");

