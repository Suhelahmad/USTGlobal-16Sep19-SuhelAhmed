var br = ['Nke','Puma','Adidas','HRX','Reebok'];
console.log('For of Loop')
for( var element of br)
{
    console.log(element ,'Brand');
}
console.log('============================');

console.log('For in Loop')
for( var element in br)
{
    console.log('Brand',br[element]);
}
console.log('============================');

var person = {

                name : 'Suhel',
                age:  33,
                color: 'white',

}
    for(var key in person)
    {
        console.log('value =' , person[key]);
    }

    console.log('============================');

    console.log('for Each method of array' )
    var movies = ['sholay','mayabazar','park','titanic','dil'];
    movies.forEach(function(value,index){
        console.log('movies=',value);
        console.log('movies index = ' , index);
    })

    var items = [
                    {
        
                        itme: 'bangle',
                        id: 1,
                        price : 100
                     },

                     {
        
                        itme: 'eyeliner',
                        id: 2,
                        price : 500
                     },

                     {
        
                        itme: 'shoes',
                        id: 3,
                        price : 300
                     },

                     {
        
                        itme: 'bag',
                        id: 4,
                        price : 100
                     },

                     {
        
                        itme: 'watch',
                        id: 5,
                        price : 5000
                     },

                     {
        
                        itme: 'bike',
                        id: 6,
                        price : 1000000

                     }]

                items.forEach(function(item,index)
                {
                        console.log('itme = ', items);
                })
                    



//var keyword

var name;
var name = 'suhel';
name = 'abc';

//let keyword

let name1;
let name1='sahho';
name1 = 'valmiki';

//const keyword

const name2 = 'dream girl';  // '
name2 = 'kabir';

for(var i=0;i<5;i++)
{
     console.log('inside for loop' , i)
}
   console.log('outside for loop',i)

   for(let i=0;i<5;i++)
{
     console.log('inside for loop' , i)
}
   console.log('outside for loop',i)


   
