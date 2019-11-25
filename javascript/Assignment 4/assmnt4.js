
console.log('==Array 1=====');
const phones = ['Motorola', 'iPhone', 'Nokia', 'Lenovo']
phones.forEach(function(value,index) {
    console.log('Phones =', value)
});
console.log(typeof phones)
var isArrayOrNot = Array.isArray(phones);
console.log('phones Array or not ', isArrayOrNot);

const hasMotorola = phones.includes('Motorola');
console.log('Using includes method ', hasMotorola);

phones.push('Oppo','Vivo');//add element at last position of array
console.log('After push method ', phones);

phones.pop();//reove element from last 
console.log('Array after pop ethod', phones)

phones.unshift('vivo','LG');//add element from first position
console.log(' Array After unshift',phones);

phones.shift();//remove element from first position
console.log('Array After shift', phones)

const phones1 = ['LG', 'alcatel', 'BenQ', 'AT&T']
phones1.splice(1,2,'iphone')//add and remove element in between the array
console.log('After Splice Method ', phones1)

var afterSlice = phones1.slice(2,3)//remove Element in between the array
console.log('After Slice method', phones1)
console.log('After slice method', afterSlice)

const indexOfNokia = phones.indexOf('Nokia',1)//return index of the element
console.log('Index of Nokia =', indexOfNokia)

var joinOf = phones.join('-')//add separator and return array 
console.log('After join phones =', joinOf)

const numbers = [50,100,150,200,250];
const nums1 = numbers.map(function(value,Index)
{
    let newValue = value + 50;
    return newValue;
})

console.log('after map method',nums1);
const nums2 = numbers.map(value => value+500);
console.log('after map arrow function',nums2);
console.log("============================++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++============")

 const numberr = [200,500,300];
const filternum = numberr.filter(function(value)
{
    if(value > 200)
    {
        return true
    }
    else
    {
        return false;
    }
})
console.log('after filter method = ', filternum);

*/
console.log('===Array 2===')

const city = ['Bangalore', 'Delhi', 'Pune', 'Mumbai']
city.forEach(function (Value,index) {
    console.log("City = ", Value);
});
console.log(typeof city)
var isArrayOrNot = Array.isArray(city);
console.log('city Array or not ', isArrayOrNot);

const hasDelhi = city.includes('Delhi');
console.log('Using includes method ', hasDelhi);

phones.push('Tiruvantpuram','Chennai');//add element at last position of array
console.log('After push method ', city);

phones.pop();//reove element from last 
console.log('Array after pop ethod', city)

phones.unshift('Mumbai','Kota');//add element from first position
console.log(' Array After unshift', city);

phones.shift();//remove element from first position
console.log('Array After shift', city)

const city1 = ['Baroda', 'Bhubaneshwar', 'LA', 'Durban']
city1.splice(1,2,'Kota')//add and remove element in between the array
console.log('After Splice Method ', city1)

var afterSlice = city1.slice(2,3)//remove Element in between the array
console.log('After Slice method', city1)
console.log('After slice method', afterSlice)

const indexOfBangalore = city.indexOf('Bangalore',1)//return index of the element
console.log('Index of Bangalore =', indexOfBangalore)

var joinOf = city1.join('-')//add separator and return array 
console.log('After join city =', joinOf)

console.log('===Array 3===')

const country = ['India', 'Pakistan', 'Japan', 'China', 'USA']
country.forEach(function (Value, index){
   console.log('Country = ', Value); 
});
console.log(typeof country)
var isArrayOrNot = Array.isArray(country);
console.log('country Array or not ', isArrayOrNot);

const hasIndia = country.includes('India');
console.log('Using includes method ', hasIndia);

phones.push('Canada','Aus');//add element at last position of array
console.log('After push method ', country);

phones.pop();//reove element from last 
console.log('Array after pop ethod', country)

phones.unshift('Bhutan','Bangladesh');//add element from first position
console.log(' Array After unshift', country);

phones.shift();//remove element from first position
console.log('Array After shift', country)

const country1 = ['Afghanistan', 'Algeria', 'LA', 'Saigon']
country1.splice(1,2,'Srilanka')//add and remove element in between the array
console.log('After Splice Method ', country1)

var afterSlice = country1.slice(2,3)//remove Element in between the array
console.log('After Slice method', country1)
console.log('After slice method', afterSlice)

const indexOfChina = country.indexOf('China',1)//return index of the element
console.log('Index of China =', indexOfChina)

var joinOf = country1.join('-')//add separator and return array 
console.log('After join country =', joinOf)

console.log('===Array 4===')
const books = ['To Kill a Mockingbird', 'The Great Gatsby', 'One Hundred Years of Solitude', 'Beloved']
books.forEach(function (value, index){
 console.log("Books = ", value);  
});
console.log(typeof books)
var isArrayOrNot = Array.isArray(books);
console.log('books Array or not ', isArrayOrNot);

const hasBeloved = books.includes('Beloved');
console.log('Using includes method ', hasBeloved);

phones.push('The Novel','Book');//add element at last position of array
console.log('After push method ', books);

phones.pop();//reove element from last 
console.log('Array after pop ethod', books)

phones.unshift('Journalist','Forever');//add element from first position
console.log(' Array After unshift', books);

phones.shift();//remove element from first position
console.log('Array After shift', books)

const books1 = ['Emma', 'Wuthering Heights', 'Middlemarch', 'Adventure']
books1.splice(1,2,'Ulysses')//add and remove element in between the array
console.log('After Splice Method ', books1)

var afterSlice = books1.slice(2,3)//remove Element in between the array
console.log('After Slice method', books1)
console.log('After slice method', afterSlice)

const indexOfBeloved = books.indexOf('Beloved',1)//return index of the element
console.log('Index of Beloved =', indexOfBeloved)

var joinOf = books.join('-')//add separator and return array 
console.log('After join country =', joinOf)

console.log('===Array 5===')
const id = ['001', '002', '003', '004'];
id.forEach(function (value, index){
    console.log("id = ", value);  
   });
   console.log(typeof id)
   var isArrayOrNot = Array.isArray(id);
   console.log('id Array or not ', isArrayOrNot);
   
   const has002 = id.includes('002');
   console.log('Using includes method ', has002);
   
   phones.push(005,006);//add element at last position of array
   console.log('After push method ', id);
   
   phones.pop();//reove element from last 
   console.log('Array after pop ethod', id)
   
   phones.unshift(007,);//add element from first position
   console.log(' Array After unshift', id);
   
   phones.shift();//remove element from first position
   console.log('Array After shift', id)
   
   const id1 = [111, 222, 333, 444]
   id1.splice(1,2, 555)//add and remove element in between the array
   console.log('After Splice Method ', id1)
   
   var afterSlice = id1.slice(2,3)//remove Element in between the array
   console.log('After Slice method', id1)
   console.log('After slice method', afterSlice)
   
   const indexOf001 = id.indexOf(001,1)//return index of the element
   console.log('index of 002 =', indexOf001)
   
   var joinOf = id.join('-')//add separator and return array 
   console.log('After join country =', joinOf)
   
   console.log('===Array 6===')

const Car = ['BMW', 'Audi', 'Hummer', 'Jeep']
Car.forEach(function (value, index){
    console.log("Car = ", value);  
   });
   console.log(typeof Car)
   var isArrayOrNot = Array.isArray(Car);
   console.log('id Array or not ', isArrayOrNot);
   
   const hasBMW = Car.includes('BMW');
   console.log('Using includes method ', hasBMW);
   
   Car.push('Bently', 'BBW');//add element at last position of array
   console.log('After push method ', Car);
   
   Car.pop();//reove element from last 
   console.log('Array after pop ethod', Car)
   
   Car.unshift('Hialayan', 'HM');//add element from first position
   console.log(' Array After unshift', Car);
   
   Car.shift();//remove element from first position
   console.log('Array After shift', Car)
   
   const Car1 = ['Datsun', 'ROEwE', 'LAGONDA', 'LADA']
   Car1.splice(1,2, 'Spyker')//add and remove element in between the array
   console.log('After Splice Method ', Car1)
   
   var afterSlice = Car1.slice(2,3)//remove Element in between the array
   console.log('After Slice method', Car1)
   console.log('After slice method', afterSlice)
   
   const indexOfJeep = Car.indexOf('Jeep',1)//return index of the element
   console.log('index of Jeep =', indexOfJeep)
   
   var joinOf = Car.join('-')//add separator and return array 
   console.log('After join country =', joinOf)


console.log('=================================')
console.log('String Function')

//str.lenth method
var str = 'Kirtivardhan';
console.log('Length of String =', str.length);

//indexOf Method
var str1 = 'Hello! How Are You?'
var pos = str1.indexOf('Are', 1)
console.log('Index of substring', pos)

//upperCase Method
var str2 = 'vardhan'
var str3 = str2.toUpperCase();
console.log('After Upper Case Method', str3)

//lowerCase method
var str4 = 'KIRTIVARDHAN'
var str5 = str4.toLowerCase();
console.log('After Lower Case Method', str5)

//concat method
var str6 = 'Hello'
var str7 = 'World'
var str8 = str6.concat(' ', str7)
console.log('After Concat Method =', str8)

//charAt method
var str9 = 'Kirtivardhan'
var str10 = str9.charAt(3);
console.log('After charAt method =', str10)

//replace method
var String1 = 'Please visit USTGlobal'
var String2 = String1.replace('Visit', 'Check')
console.log('After replace method =', String2)

//substr method
var Str = 'Banana, Apple, Kiwi'
var Str1 = Str.substr(5);
console.log('After Substr method =', Str1)

//substr method
var Str = 'Banana, Apple, Kiwi'
var Str1 = Str.substr(5, 7);
console.log('After Substr method =', Str1)

//search method
var Str3 = 'Please Find Me'
var Str4 = Str3.search('Find');
console.log('After Search method =', Str4)

//Split method
var Str5 = 'How are you doing today?'
var Str6 = Str5.split('')
console.log('After Split Method =', Str6)


//includes method
var Str7 = 'Hello world, welcome to the universe.'
var Str8 = Str7.includes('world')
console.log('After includes Method =', Str8)

console.log('====== 2nd Example==== ')

//str.lenth method
var str = 'Rajvardhan';
console.log('Length of String =', str.length);

//indexOf Method
var str1 = 'Are you fine?'
var pos = str1.indexOf('Are', 1)
console.log('Index of substring', pos)

//upperCase Method
var str2 = 'ust Global'
var str3 = str2.toUpperCase();
console.log('After Upper Case Method', str3)

//lowerCase method
var str4 = 'Bangalore'
var str5 = str4.toLowerCase();
console.log('After Lower Case Method', str5)

//concat method
var str6 = 'Hello'
var str7 = 'Bangalore'
var str8 = str6.concat(' ', str7)
console.log('After Concat Method =', str8)

//charAt method
var str9 = 'Test Yantra'
var str10 = str9.charAt(3);
console.log('After charAt method =', str10)

//replace method
var String1 = 'Judge me when you are perfect'
var String2 = String1.replace('me', 'us')
console.log('After replace method =', String2)

//substr method
var Str = 'Delhi, Bombay, Pune'
var Str1 = Str.substr(5);
console.log('After Substr method =', Str1)

//substr method
var Str = 'Bangalore, Kochi, Mangalore'
var Str1 = Str.substr(5, 7);
console.log('After Substr method =', Str1)

//search method
var Str3 = 'I will Find You';
var Str4 = Str3.search('Find');
console.log('After Search method =', Str4)

//Split method
var Str5 = 'Tell Me About yourself'
var Str6 = Str5.split('')
console.log('After Split Method =', Str6)


//includes method
var Str7 = 'Hello world, welcome in Bangalore.'
var Str8 = Str7.includes('world')
console.log('After includes Method =', Str8)

console.log('====== 3rd Example==== ')

//str.lenth method
var str = 'India';
console.log('Length of String =', str.length);

//indexOf Method
var str1 = 'India is a great Country'
var pos = str1.indexOf('Country', 1)
console.log('Index of substring', pos)

//upperCase Method
var str2 = 'isro'
var str3 = str2.toUpperCase();
console.log('After Upper Case Method', str3)

//lowerCase method
var str4 = 'RESEArch'
var str5 = str4.toLowerCase();
console.log('After Lower Case Method', str5)

//concat method
var str6 = 'Chandrayan'
var str7 = '2'
var str8 = str6.concat(' ', str7)
console.log('After Concat Method =', str8)

//charAt method
var str9 = 'BTM is in Bangalore'
var str10 = str9.charAt(5);
console.log('After charAt method =', str10)

//replace method
var String1 = 'invidia geforce is good'
var String2 = String1.replace('is', 'was')
console.log('After replace method =', String2)

//substr method
var Str = 'Lenovo, HP, Dell'
var Str1 = Str.substr(6);
console.log('After Substr method =', Str1)

//substr method
var Str = 'iPhone, Mptorola, oppo'
var Str1 = Str.substr(5, 7);
console.log('After Substr method =', Str1)

//search method
var Str3 = 'you will get success'
var Str4 = Str3.search('get');
console.log('After Search method =', Str4)

//Split method
var Str5 = 'Achyutam Keshavam krinsha Damodra'
var Str6 = Str5.split('')
console.log('After Split Method =', Str6)


//includes method
var Str7 = 'This song is really nice'
var Str8 = Str7.includes('world')
console.log('After includes Method =', Str8)

console.log('====== 4th Example==== ')

//str.lenth method
var str = 'Array';
console.log('Length of String =', str.length);

//indexOf Method
var str1 = 'Finish your assignment on time'
var pos = str1.indexOf('your', 1)
console.log('Index of substring', pos)

//upperCase Method
var str2 = 'String'
var str3 = str2.toUpperCase();
console.log('After Upper Case Method', str3)

//lowerCase method
var str4 = 'ASSignent'
var str5 = str4.toLowerCase();
console.log('After Lower Case Method', str5)

//concat method
var str6 = 'String'
var str7 = 'Assignment'
var str8 = str6.concat(' ', str7)
console.log('After Concat Method =', str8)

//charAt method
var str9 = 'String Function'
var str10 = str9.charAt(3);
console.log('After charAt method =', str10)

//replace method
var String1 = 'Please find the Attachment'
var String2 = String1.replace('the', '')
console.log('After replace method =', String2)

//substr method
var Str = 'String, Array, Method'
var Str1 = Str.substr(5);
console.log('After Substr method =', Str1)

//substr method
var Str = 'instagram, facebook, watsapp'
var Str1 = Str.substr(5, 7);
console.log('After Substr method =', Str1)

//search method
var Str3 = 'Social Sites is Time taken'
var Str4 = Str3.search('is');
console.log('After Search method =', Str4)

//Split method
var Str5 = 'Name'
var Str6 = Str5.split('')
console.log('After Split Method =', Str6)


//includes method
var Str7 = 'Why should i hire you?'
var Str8 = Str7.includes('?')
console.log('After includes Method =', Str8)