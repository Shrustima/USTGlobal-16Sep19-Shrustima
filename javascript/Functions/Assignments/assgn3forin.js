//assignment number 1

var person = new Object();
person.firstName = "shrusti";
person.lastName = "sheri";
person.age = 22;
console.log('New person is', person);


var hotel = new Object();
hotel.name = "Saptagiri";
hotel.area = "Sangmeshwar";
console.log('Our  new hotel is',hotel);


var building = new Object();
building.name = "JaiShiva";
building.area = "Brahmpur";
console.log('our building is', building);

var cosmetics = new Object();
cosmetics.name = "foundation";
cosmetics.price = 500;
console.log('The cosmetic is', cosmetics);


//assignment number 3

//using for loop
var text="";
for (i=0; i<5; i++){
    text += "The Number is" + i + "<br>";
}



//for in loop
console.log('For in loop for object')
var employee ={
    name : 'Shrusti',
    id : 123,
}
for(var key in employee){
    console.log('value =',employee[key])
}



console.log('For in loop for object')
var hotel ={
    name : 'Venkatgiri',
    area : 'jewargi colony',
}
for(var key in hotel){
    console.log('value =',hotel[key])
}


console.log('For in loop for object')
var cosmetic ={
    name : 'kajal',
    price : 320,
    color : 'blue'
}
for(var key in cosmetic){
    console.log('value =',cosmetic[key])
}


console.log('For in loop for object')
var brands ={
    name : 'vodka',
    quantity : '90ml',
}
for(var key in brands){
    console.log('value =',brands[key])
}

console.log('For in loop for object')
var movie ={
    name : 'dil dhadakne do',
    song : 'phele bar',
}
for(var key in movie){
    console.log('value =',movie[key])
}

//fir in loop for arrays
console.log('For in loop for arrays')
var brands = ['kingfisher','vodka', 'breezer', 'blacknwhite'];
for(var index in brands){
    console.log('Brand =', brands[index])
}
console.log('-------------------');

console.log('For in loop')
var books = ['classmate', 'vidya'];
for(var index in books){
    console.log('Books =', books[index])
}
console.log('-------------------');


console.log('For in loop')
var malls = ['orion', 'GTWorld', 'ETA'];
for(var index in malls){
    console.log('Brand =', malls[index])
}
console.log('-------------------');


console.log('For in loop')
var mobiles = ['Nokia', 'Samsung', 'Honor'];
for(var index in mobiles){
    console.log('Brand =', mobiles[index])
}
console.log('-------------------');


console.log('For in loop')
var shapes = ['circle', 'triangle', 'square'];
for(var index in shapes){
    console.log('Brand =', shapes[index])
}
console.log('-------------------');





