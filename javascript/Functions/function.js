//Named Functions
function add(num1,num2){
    console.log('Sum =',num1+num2);

}
add(10,20)

function add(num1,num2,num3){
    console.log('Sum Value=',num1+num2+num3);
}
add(12,23,32)


//Function Expression (Anonymous)
var sub = function(num1,num2){
    var subValue = num1 - num2;
    return subValue;
}
var value = sub(90,89)
console.log('Value=',value);   

//Fat Arrow Functions
//type1

var d1 = (num1,num2)=>{
    console.log('Value=', num1/num2);
}
d1(10,5);

//self invoke function
console.log('Hello');

(function(num1,num2){
    console.log('Value=',num1+num2);
})(10,20);

//type3
var d2=num1=>{
    console.log('Value=',num1);
}
d2(12);

//Single line code type3
var d3 = num1=>console.log(num1);
d3(45);

//type4
var add1=(num1,num2)=>num1+num2;
add1(80,01);


//type5
var value=add(10,20);


//function calling before declaration


greeting('Shrusti');
function greeting(msg){
    console.log('Hellllo ',msg);
}


greets('Dingi');
var greets = (msg)=>{
    console.log('Hii',msg);
} 


greet('Dinga');
var greet = function(msg){
    console.log('Hie',msg);
}




//variable hoisting
console.log(hoist);
var hoist = 10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA;
}
hoisting();


function hoisting(){
    var hoistingA;
    Console.log(hoistingA);
    hoistingA=10;
}