class Student{
    constructor(name, father_name, mother_name){
        this.name=name;
        this.father_name=father_name;
        this.mother_name=mother_name;
        this.diaplay=function(){
            console.log(this.name,this.father_name, this.mother_name);
        }
    
    }

    display_data(){
        console.log('My name is' +this.name+'My father name is'+this.father_name+'and My Mother name is'+this.mother_name)
    
    }

    static add(a,b){
        return a+b;
    }

    static display_details(name , father_name, mother_name){
        console.log(name, father_name, mother_name);
    }

}

let sufiyan= new Student('sufiyan', 'mohd shabbar', 'shabnam khatun');
sufiyan.diaplay();
sufiyan.display_data();
Student.display_details('sufiyan'.toUpperCase(), 'mohd shabber'.toUpperCase(), 'shabnam khatun'.toUpperCase());
console.log(Student.add(4,5));



