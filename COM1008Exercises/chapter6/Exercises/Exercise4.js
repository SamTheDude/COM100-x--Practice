//Using strict javascript.
"use strict";

document.write("<table>");

for (let index = 1; index < 11; index++) {
    document.write("<tr>");
    for (let Jndex = 1; Jndex < 4; Jndex++) {
        var num = Math.pow(index, Jndex);
        document.write("<td>" + num + "</td>");
    }
    document.write("</tr>");
}
document.write("</table>")