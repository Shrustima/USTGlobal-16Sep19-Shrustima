function first(){
    setTimeout( function(){
    console.log('First Function Executed')
},0)
}
console.log('Executed');

function second(){
    console.log('second Function Executed')
}

first()
second()

// callback function 
function first(callback){
    setTimeout( function() {
    console.log('First Function Executed')
    callback();
},0)
}
// console.log('Executed');

function second(){
    console.log('second Function Executed')
}

first(second)









