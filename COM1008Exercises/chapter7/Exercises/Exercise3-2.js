//Using strict javascript.
"use strict";

var randomArray = new Array(10);

for (let index = 0; index < randomArray.length; index++) {
    randomArray[index] = Math.random() * 10;
    document.write("<p>Array index " + index + ": " + Math.floor(randomArray[index]) + ", " + Math.round(randomArray[index]) + ", " + Math.ceil(randomArray[index]) + "</p>");
}