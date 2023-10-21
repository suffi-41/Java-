let x=5
let y=4
let sum=x+y

const prompt=require("prompt-sync")();
let name=prompt('Enter your name:')
console.log(name);

const _={name:'sufiyan', 
         roll:41, 
         enrollment_no:'A221070' ,
         list:[2,3,4,56,,78,9,0,8,0,8],
         string:['sufiyan', 'farhan', 'junaid', 'kulsoom']
        }

console.log(_)
console.log(_.string, _.list, _['string'], _['name'])
    let i=0;
for(let item in _)
    console.log(_[item])
    console.log('name')
    i++

// switch statment 

console.log("switch statment!")
const s='papa'
switch (s) {
    case 'papa':
        console.log(s)
        break

    case 'momuy':
        console.log(s)

    case 'sufiyan':
        console.log(s)
    default:
        console.log("invalid input")
        break;
}


// if else statment 
console.log('if else condition!')

if (s=='papa'){
    console.log(s)
}

else if(s=='mummy'){
    console.log(s)
}

else{
    comsole.log('Invalid value!, please Enter the valid input!')
}


console.log('using loop')


  
