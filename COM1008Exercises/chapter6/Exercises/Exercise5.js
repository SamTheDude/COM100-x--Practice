//Using strict javascript.
"use strict";

//Get all the user inputs.
var initialSum = prompt("Input the initial ammount of money: ");
var desiredSum = prompt("Input the desired ammount of money: ");
var interestRate = prompt("Input the anual interst rate in percentage form");

//Calculate the number of years needed.
var interestMultiplier = 1 + interestRate/100;
var years = 0;
var runningTotal = initialSum;
var yearFound = false;
while (!yearFound) {
    if(runningTotal >= desiredSum){
        yearFound = true;
    }else{
        years++;
        runningTotal = runningTotal * interestMultiplier;
    }
}

document.write("That would take " + years + " year(s) to procure " + desiredSum +  " from " + initialSum + " at the interest rate of " + interestRate  + "% per anum.");