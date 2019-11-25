const hobbies = ['sleeping', 'reading','cricket','eating'];

console.log(typeof hobbies);

const isArrayOrNot =  Array.isArray(hobbies);
console.log('hobbies are array = ' , isArrayOrNot)


const isPresentOrNot =  hobbies.includes('cricket')
console.log('cricket is present or not = ' , isPresentOrNot)


const PushElement =  hobbies.push('suhel','wahid','aijaz');
console.log('after pushed method = ' , PushElement);


const PopMethod =  hobbies.pop();
console.log('after poped method = ' , hobbies)

const unshiftMethod =  hobbies.unshift('suhel');
console.log('after unshift method = ' , hobbies)

const shiftMethod =  hobbies.shift();
console.log('after shift method = ' , hobbies)

const hobbies1 = ['sleeping','cricket','eating','coding','roaming'];
hobbies1.splice(1,0,'bird watching','pubg');
console.log('after splice method',hobbies1);

const afterslice = hobbies1.slice(2,4);
console.log('after slice method',hobbies1);
console.log('after slice method',afterslice);

const indexOfcoding = hobbies1.indexOf('coding',1);
console.log('Index of coding is =',indexOfcoding);

const stringhobbies = hobbies1.join(',')
console.log('converted in string =',stringhobbies);

const numbers = [100,200,300,400,500];
const numbers1 = [];
for(let i=0; i<numbers.length;i++)
{
    let num = numbers[i] + 50;
    numbers1.push(num);
}


const nums1 = numbers.map(function(value,Index)
{
    let newValue = value + 50;
    return newValue;
})

console.log('after map method',nums1);
const nums2 = numbers.map(value => value+500);
console.log('after map arrow function',nums2);


 const filternum = numbers.filter(function(value,Index)
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

const filterarrow = numbers.filter(value => value > 200);
console.log('after filter method using arrow function = ', filterarrow);