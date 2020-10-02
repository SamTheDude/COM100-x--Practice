//Using strict javascript.
"use strict";

//Get user input.
var userInput = prompt("Enter a tempurature in farenheight");

//Calculate temp in celcius and store it.
var tempInCelcius = (parseFloat(userInput)-32)*5/9;

//Output answer as well as original celcius value.
document.write("<p>Farenheight value entered is " + userInput + ".</p>");
document.write("<p>In degrees Celcius that is " + tempInCelcius.toFixed(4) + ".</p>");
