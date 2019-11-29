const person = {
    name: 'Shrusti',
    age: 22,
    color: 'white',
    address: {
        city: 'glb',
        state: 'karnataka',
        pincode: 585103
    },
    hobbies: ['coding', 'painting', 'sleeping']
}
console.log('Javascript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person object after parse', javaScriptPersonObject)

localStorage.setItem('email','billgates@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear();