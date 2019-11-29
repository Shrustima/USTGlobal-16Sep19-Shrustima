console.log('Window object',window);
console.log('This keyword',this);
console.log(this == window)

//window.alert('Welcome to my home')
//alert('Welcome UST Global and Test Yantra')

//let confrmdlt = confirm('Are you sure you want to delete');
//console.log('Confirm Delete',confrmdlt);

//let userName= prompt('What is your name', 'Shrusti')
//console.log('User Name',userName)

const person = {
    firstName : 'Alia',
    age : 24,
    lastName : 'Bhat',
    getName : function(){
        console.log('This keyword',this)
        return this.firstName + ' '+this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName)