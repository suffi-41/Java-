// using switch method in java script
const prompt=require("prompt-sync")();

let name=prompt("Enter the name: ");

switch(name){
    case  "sufiyan":
        console.log("I am "+name);
        break;

    case 'farhan':
        console.log("He is my friend ,his name is "+name);
        break;
    case 'junaid':
        console.log("He is my friend His name is "+name);
        break;
    default:
        console.log("this name is not valid , please enter the valid name !");
}

if(name==="sufiyan" ){
    console.log(" I am s"+name);
}

else if(name==="farhan" ){
    console.log(name);
}

else{
    console.log(name);
}