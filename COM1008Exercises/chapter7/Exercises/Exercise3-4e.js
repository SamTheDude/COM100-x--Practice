//Using strict javascript.
"use strict";

var table = new Array(5);

for (let x = 0; x < table.length; x++) {
    table[x] = new Array(5);
    for (let y = 0; y < table[x].length; y++) {
        table[x][y] = Math.round(Math.random());
    }
}

var threeInARow = false;

for (let x = 0; x < table.length; x++) {
    for (let y = 0; y < table[x].length; y++) {
        try {
            var horizontal = table[x][y] == 1 && table[x+1][y] == 1 && table[x+2][y] == 1;
            var vertical = table[x][y] == 1 && table[x][y+1] == 1 && table[x][y+2] == 1;
            if(horizontal || vertical){
                threeInARow = true;
            }
        } catch (error) {
            
        }
    }
}

document.write(threeInARow + "<br>")

document.writeln(table);