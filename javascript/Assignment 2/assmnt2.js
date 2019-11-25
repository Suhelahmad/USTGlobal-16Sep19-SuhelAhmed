// Functions or Methods In Java script

// Named function is
function factorial(num)
{
    if(num==0)
    {
        return 1;
    }
        return num*factorial(num-1);
}
console.log('Factorial of a 1st function is = ',factorial(5))

// Function Expression  Function 
var factorial = function(num)
{
    if(num==0)
    {
        return 1;
    }
        return num*factorial(num-1);
    
}
console.log('Factorial of 2nd function is =',factorial(6));

// self Invoked Function
(function(num)
{
    if(num==0)
    {
        return 1;
    }
        return  console.log('Factorial of 3rd function is=',num*factorial(num-1));
        
})(7)

// Fat function 
var fact= (x) => {
    
    if(x==0)
    {
        return 1;
    }
        return x*factorial(x-1);

}
console.log('Factorial 4th function is=',fact(8));
console.log('======================================================================')

//Named function

function fibonacci(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
}
fibonacci(7);

console.log('======================================================================')

// Function Expression 
var fibonacci = function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 

}
fibonacci(4);

// Self invoked function
(function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
        
})(6)
console.log('======================================================================')

// Fat function 
var fact= (x) => {
    
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<x;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
}
fact(4)

console.log('============================================================')

// Named Function 
function circum(num)
{
var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(10);


// Function Expression 

var circum = function(num)
{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);

}
circum(10);

//Self Invoked Function
(function(num)
    {
        var pi=3.14;
        console.log('Circumfrence number is ',2*pi*num);
    }
)(5)

// Fat Function 
var circum=(num)=>
{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(5);

console.log('--------------------------------------------------------')

function sum(arr)
{
    
    var sum = 0;

for(var i = 0; i < arr.length; i++)
{
  sum += arr[i]
}
return sum;
}
console.log(sum([10,20,30,40]));

console.log('----------------------------------------------------------------------');

//Named function
function test_prime(n)
{

  if (n===1)
  {
    return false;
  }
  else if(n === 2)
  {
    return true;
  }
  else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        return console.log('is Not Prime Number');
      }
    }
    return console.log('is Prime number');  
  }
}

console.log(test_prime(7));

// function expression 
var prime = function test_prime(n)
{

  if (n===1)
  {
    return false;
  }
  else if(n === 2)
  {
    return true;
  }
  else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        return console.log('is Not Prime Number');
      }
    }
    return console.log( 'is Prime number');  
  }
}

console.log(test_prime(15));

// self invoked function

(function test_prime(n)
{

  if (n===1)
  {
    return false;
  }
  else if(n === 2)
  {
    return true;
  }
  else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        return console.log('is Not Prime Number');
      }
    }
    return console.log('is Prime number');  
  }
}

)
console.log(test_prime(7));

//fat funcction

var test_prime=(n)=>
{

  if (n===1)
  {
    return false;
  }
  else if(n === 2)
  {
    return true;
  }
  else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        return console.log('is Not Prime Number');
      }
    }
    return console.log('is Prime number');  
  }
}

console.log(test_prime(50));





