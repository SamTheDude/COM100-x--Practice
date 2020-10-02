//Using strict javascript.
"use strict";

var numArray = new Array(10);
var indexArray = new Array();

for (let index = 0; index < numArray.length; index++) {
    numArray[index] = Math.random() * 20;

    if(numArray[index] > 10){
        indexArray.push(index);
    }
}

document.write("<p>");
numArray.forEach(element => {
    document.write(element.toString() + " ");
});
document.write("<p>");
indexArray.forEach(element => {
    document.write("<p>" + element.toString() + "</p>");
});