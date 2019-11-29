//for of loop only for arrays
var brands = ['kingfisher', 'bisleri', 'aqua', 'kinley']
console.log('for of loop')
for(var element of brands){
    console.log('Brand = ',element);
}
console.log('=============');

//for in loop
console.log('For in loop')
for(var index in brands){
    console.log('Brand =', brands[index])
}
console.log('brands =',brands[index]);
console.log('-------------------');

//for in loop for objects
console.log('For in loop for object')
var person ={
    name : 'Soundarya',
    age : 32,
    color : 'white'
}
for(var key in person){
    console.log('value =',person[key])
}
console.log('===============================');


console.log('forEach method of arrays')
var movies = ['sholay', 'mayabazar', 'jurassic park', 'titanic']
movies.forEach(function(value,index){
    console.log('movies =', value)
    console.log('movie index =',index)
    
})







console.log('------------------------')
for(var i in numbers){
    console.log('For in loop', numbers[i])
}


// console.log('======')
//numbers['hundred'] = 100;
//for(var i=0;i<numbers.length;i++){
  //  console.log('For loop',numbers[i])
//}




console.log('for each for items')
var items = [
    {
        item : 'bangles',
        id : 1,
        price : 100
    },
    {
        item : 'eyeliner',
        id : 2,
        price : 250

    },
    {
        item : 'watch',
        id : 3,
        price : 5000
    },
    {
        item : 'bike',
        id : 4,
        price : 100000
    }
]
items.forEach(function(item,index){
console.log('item =',item);
console.log('Index of item =',index);
})


console.log('does not consider')
var numbers = [10, 20, 30, 40]
for(var i=0;i<numbers.length;i++)
console.log('does not=',numbers);


console.log('=====');
numbers.forEach(function(value){
    console.log('for each',value)
})


console.log('=============');
numbers['hundred']= 100;
for(var i=0;i<numbers.length;i++){
console.log('for loop=',numbers[i]);
}

console.log('====')
for(var i in numbers){
    console.log('for in loop',numbers[i])
}



var name;
var name= 'plwn';
var name = 'shru';

//console.log(name1)
let name1;
//let name1 = 'saaho'
name1 = 'Valmki'
console.log(name1)


//const name2;
const name2 = 'Dream Girl',
//name2 = 'kabir singh'

for(var i=0; i<5; i++){
    console.log('Inside loop',i)

}
console.log('Outside loop',i)

