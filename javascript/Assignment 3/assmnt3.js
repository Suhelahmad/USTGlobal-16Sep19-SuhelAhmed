
console.log('For loop')

var br = ['Nke','Puma','Adidas','HRX','Reebok']
console.log('For Loop 1')
for( var i=0; i<br.length;i++)
{
    console.log('Brand = ', br[i]);
}

var br = ['Suhel','ahmad','mdrafik','langoti']
console.log('For Loop 2')
for( var i=0; i<br.length;i++)
{
    console.log('Brand = ', br[i]);
}

var br = ['a','b','c','d','e']
console.log('For Loop 3')
for( var i=0; i<br.length;i++)
{
    console.log('Brand = ', br[i]);
}


var br = ['name','age','color','lastname']
console.log('For Loop 4')
for( var i=0; i<br.length;i++)
{
    console.log('Brand = ', br[i]);
}


var br = ['Nke','Puma','Adidas','HRX','Reebok']
console.log('For Loop 5')
for( var i=0; i<br.length;i++)
{
    console.log('Brand = ', br[i]);
}


var ar = ['class','object','abstract','poly'];
console.log('for loop 6')
for(var i=0; i<ar.length;i++)
{

    console.log('names = ' , ar[i]); 
}
console.log('====================================');

// 2) for of loop

var ab = ['suhel','wasim','naveed','rizwan'];
console.log('for of loop 1');
for(var element of ab)
{
    console.log('frnds =', element)
}

var village = ['kittur','bgm','dwd','bglr'];
console.log('for of loop 2');
for(var element of village)
{
    console.log('village =', element)
}

var clg = ['aiism','kud','anjuman','vtu'];
console.log('for of loop 3');
for(var ele of clg)
{
    console.log('college =', ele)
}
console.log('===========================================================');

// 3) for in loop

console.log('for in loop 1');
var phones = ['nokia','moto','apple','mi','samsung'];
for(var phn in phones)
{
    console.log('phones = ', phones[phn]);
}

console.log('for in loop 2');
var country = ['india','china','japan','africa','usa'];
for(var cntry in country)
{
    console.log('country = ', country[cntry]);
}

console.log('for in loop 2');
var books = ['notebook','rough book','classmate','lotus','legend'];
for(var bk in books)
{
    console.log('books= ', books[bk]);
}

console.log('for in loop 4');
var fruits = ['apple','banana','orange','pineapple'];
for(var fr in fruits)
{
    console.log('fruits = ', fruits[fr]);
}

console.log('=======================================')

// for in loop using object

console.log('for in loop using object 1');

var person = {

    name : 'Suhel',
    age:  33,
    color: 'white',
    number: 8748956824,

}
for(var key in person)
{
console.log('values =' , person[key]);
}

console.log('for in loop using object 2');

var city = {

            city1: 'bgm',
            city2: 'dwd',
            city3: 'kittur',
            city4: 'alnavar',
}
    for(var cty in city)
    {
        console.log('names = ', city[cty]);
    }

    console.log('for in loop using object 3');

    var  movies = {

                    movies1: 'tere naam',
                    movies2: 'sholay',
                    movies3: 'dilwale',
                    movies4: 'sath sath',

    }
    for(var mv in movies)
    {
        console.log('movies = ', movies[mv]);
    }

    console.log('===================================');

    // 4) foreach loop
    
    console.log('forEach method of array' )
    var movies = ['sholay','mayabazar','park','titanic','dil'];
    movies.forEach(function(value,index)
    {
        console.log('movies=', value);
        
    })

    console.log('forEach method 2')
    var namee = ['suhel','wasim','naveed','rizwan','fayum'];
    namee.forEach(function(value,index)
    {
        console.log('names = ', value);
    })