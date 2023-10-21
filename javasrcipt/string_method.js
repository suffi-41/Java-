const prompt=require("prompt-sync")();

let name=prompt("Enter your name:");
//console.timeLog(name.length);
console.log(name.toUpperCase());
console.log(name.toLowerCase());
console.log(name.lastIndexOf('S'));
console.log(name.indexOf('s'));
console.log(name.trim("       sufiyan     "));
console.log(name.repeat("Aman khan"));
console.log(name.charAt(4));
console.log(name.endsWith('yan'));
console.log(name.startsWith('a'));
console.log(name.match('sufiyan'));
console.log(name.substring(2,6))
console.log(name.slice(2,6));
console.log(name.split(''));
console.log(name.trimEnd())
console.log(name.trimStart())
console.log("sufiy\"yan")
console.log("sufi\/yan");


console.log(" my name ia ${name}");
