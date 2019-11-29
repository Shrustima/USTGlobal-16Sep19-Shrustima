function sum(input){
    

    var total = 0;
    for(var i=0;i<input.length;i++)
    {
        if(isNaN(input[i])){
            continue;
        }
        total += Number(input[i]);
    }
    return total;
}
console.log(sum([10,20,30,40]));




var fibonacciSeries = function(n)
{
    if (n==1)
    {
        return[0, 1];
    }
    else{
        var s = fibonacciSeries(n-1);
        s.push(s[s.length - 1]+ s[s.length - 2]);
        return s;
    }
};
console.log(fibonacciSeries(8));







