// Functions or Methods In Java script
//1) Named Functions

function add(num1,num2)
{
    console.log('sum=', num1+num2);

}
add(10,20);

//2)Function Expression or Anonymous (store function in variable)
var sub = function (num1,num2)
{
    var subvalue = num1 - num2;
    return subvalue;

}
 var value = sub(90,80);
 console.log('value = ' , value);
 
 // 3)Fat Arrow Function
 var div = (num1,num2)=>
 {
     console.log('value=', num1/num2);
 }

 div(10,2);

 greeting('Chandan');
 function greeting(msg){
     console.log('Hello', msg);
 }

 greet('Dinga');
 var greet = function(msg){
     console.log('Hi', msg);
 }

 greets('Dingi');
 var greets = (msg)=>{
     console.log('Hi', msg);
 }