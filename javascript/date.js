var todaydate = new Date();
console.log('Todays Date',todaydate);

console.log('Day' , todaydate.getDay());
console.log('Year' , todaydate.getFullYear());
console.log('Month' , todaydate.getMonth());
console.log('Date' , todaydate.getDate());

var constmilli = new Date(0);
console.log('date', constmilli);
var conststring = new Date('Nov 10');
console.log('date string constructor',conststring);
var constYear = new Date(2017,10);
console.log('date year constructor', constYear);
