// ways of declaring variables in typescript

let myName : string = 'suhel';
console.log('Name is =', myName, typeof myName);

let age : number;
console.log(age , typeof age);

let mobilenumber = 5454545454;
console.log(mobilenumber, typeof mobilenumber);

let address;
address = 'kittur';
console.log(address, typeof address)

let calage =  function() : void
{
    console.log("age is 23");
}

calage();

class Person{
    constructor(public name : string, public age : number){

    }
}
let person1 = new Person("suhel",23);
console.log(person1);


class student extends Person
{
    constructor(name : string, age : number, public rollno : number){
        super(name , age);

    }
}
 let student1 = new student('suhel',21,222);
 console.log(student1);



