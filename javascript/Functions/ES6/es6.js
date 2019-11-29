// const message= new Promise(function(resolve,reject){
//     if(30>20){
//         resolve('Success')
//     }else{
//         reject('Failed')
//     }
// })
// message.then(function(msg){
//     console.log('Success Message',msg)
// }).catch(function(error){
//     console.log('Failure Message',error)
// })



const employees = new Promise(function(resolve,reject){
    if(30>20){([{
        name: 'BillGates',
        age: 67
    },
{
    name: 'Mark Zuckerberg',
    age: 45
}]) 
}else {
    reject('Failed')
}

})
employees.then(function(data){
    console.log('Employees Data',data)
}).catch(function(error){
    console.log('Failed Message',error)
})
console.log(employees)




//closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10
        return count
    }
    return innerFunction
}
    let innerFunc = outerFunction(20)
    let counter = innerFunc()
    console.log('Counter Value',counter)
