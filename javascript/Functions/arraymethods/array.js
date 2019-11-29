const hobbies = ['Sleeping', 'Cricket', 'Eating', 'Coding', 'Roaming']
console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not', isArrayOrNot);

//searches whether the element is present or no
const hasCricket = hobbies.includes('Cricket')
console.log('Using includes method',hasCricket)
//adds at last index
hobbies.push('Guitar', 'Volley ball')
console.log('After push method',hobbies)
//removes last element
hobbies.pop()
console.log('After pop method',hobbies)


//adds at first index
hobbies.unshift('Numismatics', 'Singing')
console.log('After unshift method',hobbies)
//removes first element
hobbies.shift()
console.log('After Shift method', hobbies)



const hobbies1 = ['Slpmg', 'crckt', 'etng', 'cdng', 'rmng']
hobbies1.splice(1,2, 'PUBG', 'LUDO')
console.log('Aftr Splice methd',hobbies1)
const aftrSlice = hobbies1.slice(2,4)
console.log('Aftr slice mthd', hobbies1)
console.log('Aftr slice mthd', aftrSlice)

const indexOfCoding = hobbies1.indexOf('Cdng',1)
console.log('Index of Coding', indexOfCoding)
const string = hobbies1.join('_')
console.log('Aftr Join mthd',string)

//map method
const numbers = [100,200,300,400]
const nums1 = numbers.map(function(value,index){
    let newValue = value + 50
    return newValue
})
console.log('Aftr Map methd', nums1)



//same fnctn but using fat arrow fnctn(one line code)
const nums2 = numbers.map(value=>value + 50)
console.log('Aftr map arrow function', nums2)



//filter method
const filterNum = numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('Aftr filter method',filterNum)


//using fat arroe functn
const filterNumArrow = numbers.filter(value=>value>200)
console.log('Aftr filter arrow mthd', filterNumArrow)


const item = [{
    name : 'earrings',
    id : 1,
    price : 15000
},
{
name : 'kajal',
    id :2,
    price : 500
},
{
    name : 'Trimmer',
id : 3,
price : 1000
},
{
    name : 'Beardo',
    id : 4,
    price : 200
}
]
const updateditem = item.map(function(item,index){
    item.price = item.price + 300
    return item
})
console.log(updateditem)
//fat arrow mthd
//item.map((value) => {
    //value.price = value.price + 300
//return value
//})

const filteredItems = item.filter((item)=>item.price>1000)
console.log(filteredItems)












