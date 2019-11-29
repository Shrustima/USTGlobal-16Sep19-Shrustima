var todayDate = new Date();
console.log('Todays Date',todayDate);

console.log('day', todayDate.getDay());
console.log('Year',todayDate.getFullYear());
console.log('Month',todayDate.getMonth());
console.log('Date',todayDate.getDate());

var constMilli = new Date(0);
console.log('Date',constMilli);
var constString = new Date('Nov 10');
console.log('Date String Constructor', constString);
var constYear = new Date(2017, 19);
console.log('Date Year Constructor',constYear);

