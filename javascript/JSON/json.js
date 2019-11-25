// const person = {
//                 name: 'Suhel',
//                 age : 100,
//                 color: 'white',
//                 address :{
//                             city: 'bijapur',
//                             state: 'Karnataka',
//                             pincode: 591115
//                 },
//                 hobbies : ['coding','bird watching','Singing']
       

// }

// console.log('javascript person object',person)
// const jsonObject = JSON.stringify(person)
// console.log('json person object',jsonObject)

// const jsonoObject = JSON.parse(jsonObject)
// console.log('javascript person object',jsonoObject)

localStorage.setItem('email','smlangoti@gmail.com')
const emailID = localStorage.getItem('email');
console.log('Email ID',emailID);
localStorage.clear();
