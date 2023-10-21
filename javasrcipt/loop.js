console.log('Using for loop')
for(let i=0; i<10; i++){
    console.log(i);
}
const prompt=require("prompt-sync")();
let number=prompt("Enter the number!");
n=Number.parseInt(number);
console.log(n)

let obj={
    sufiyan:41,
    farhan:34,
    junaid:2,
    rehan:2
}


// for in loop
console.log("for in loop using here!");
for(let value in obj){
    
    console.log(obj[value]);
}

// for  of loop
console.log("for of loop  using here!");
for(let letter of "sufiyan"){
    console.log(letter);
}

// while 
console.log("while loop is using here");
let i=0;
while(i<10){
    console.log(i);
    i++;
}


// do while loop

let x=0;
do{
    console.log(x);
    x++;
}while(x<10);

