//Using strict javascript.
"use strict";

var table = new Array(5);

for (let x = 0; x < table.length; x++) {
    table[x] = new Array(5);
    for (let y = 0; y < table[x].length; y++) {
        table[x][y] = Math.round(Math.random());
    }
}

for (let x = 0; x < table.length; x++) {
    var ones = 0;
    for (let y = 0; y < table[x].length; y++) {
        if(table[x][y] == 1){
            ones++;
        }
    }
    for (let y = 0; y < table[x].length; y++) {
        if(table[x][y] == 1){
            table[x][y] = ones;
        }
    }
}

document.writeln(table);