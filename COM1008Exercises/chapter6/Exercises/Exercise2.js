//Using strict javascript.
"use strict";

//Get the inputs for the values of largest and smallest.
var largest = prompt("Enter the first numerical value: ");
var smallest = prompt("Enter the second numerical value: ");

//Change them over if larger is smaller than smallest.
if(largest<smallest){
    var temp = largest;
    largest = smallest;
    smallest = temp;
}

//Output the results.
document.write("<p>The larger of the two values is " + largest + ".</p>");
document.write("<p>Thus the smaller is " + smallest + ".</p>");