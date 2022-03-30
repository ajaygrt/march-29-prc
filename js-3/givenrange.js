
function check (a,b,c){
    if(b>=a && b<=c)
    {
        console.log("within given range");
    }
    else
    {
        console.log ("not in given range");
    }
}
console.log(check(30,20,50));
console.log(check(30,40,50));
console.log(check(60,99,500));