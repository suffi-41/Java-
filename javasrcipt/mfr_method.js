let arr=[4,4,6,7,8,9,9,4,3,5,6,77,4,5,5433,33,];

console.log(arr);

console.log('using map mathed!')
let a=arr.map((value)=>{
    return value*value;
})

let ab=arr.map(function(value){
    return value +value;
})
console.log(a);

console.log('using filter method!')
let b=arr.filter((value)=>{
    return value>20;
})
console.log(arr.filter(function(value){
    return value>50;
}))
console.log(b);

console.log('using reduce method!')
let c=arr.reduce((value,num)=>{
    return value+num;
})
let ca=arr.reduce(functon=(x,y)=>{
    return  x+y;
})

console.log(c);