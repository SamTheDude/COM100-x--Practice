//Using strict javascript.
"use strict";

var table = new Array(5);

for (let x = 0; x < table.length; x++) {
    table[x] = new Array(5);
    for (let y = 0; y < table[x].length; y++) {
        table[x][y] = Math.round(Math.random());
    }
}

document.writeln(table);