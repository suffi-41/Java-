let number=[3,4,67,8,9,4,0];
let name="sufiyan";
for(let i=0; i<number.length; i++){
    console.log(number[i]);
}


number.forEach((element)=>{
    console.log(element*element);
})

number.forEach((num)=>{
    console.log(num+num);
})

console.log(number.toString());
console.log(Array.from(name));

console.log('using for in loop!');
for(let item in number){
    console.log(number[item]);
}

console.log('using for of loop!');
for(let nu of number){
    console.log(nu);
}
