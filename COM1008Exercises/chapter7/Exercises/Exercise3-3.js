//Using strict javascript.
"use strict";

var randomArray = new Array(10);

for (let index = 0; index < randomArray.length; index++) {
    randomArray[index] = Math.random() * 10;
    var roundedNumber = Math.round(randomArray[index] * 10) / 10;
    var itterations = Math.floor(roundedNumber);

    document.write("<p>" + roundedNumber + "\n\n\n\n" + itterations + ": ");

    for (let index = 0; index < itterations; index++) {
        document.write("*");
    }

    document.writeln("</p>")
}