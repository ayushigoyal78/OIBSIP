let y = 20;
console.log(y)
const c = 112;
c = 22;
console.log(c)
var mynumber = 28;
var mynumber1 = '28';
console.log(28=='28');
var mynumber = 28;
var mynumber1 = '28';
console.log(28==='28');
console.log(mynumber != mynumber1);
console.log(mynumber!== mynumber1);
const list = [11,12,44,9,4];
const maximum = Math.max(...list);
console.log(maximum);
var number2 = 20;
if(number2%2 == 0){
console.log("number is even");
}else{
    console.log("number is odd");
}

var year = 2019;
if(year %4 == 0){
    if(year%100 != 0){
        if(year%400 != 0){
        console.log("this is a leap year");
    }
    else{
        console.log("this is not a leap year");
    }
    console.log("this is a leap year");
}else{
    console.log("this is not a leap year");
}
console.log("this is aleap year");
}else{
    console.log("this is not a leap year")
}
var str = 'abcba';
var temp = str.split("").reverse('').join('');
if(temp == str){
    console.log("palindrome");
}else{
    console.log("not a palindrome");
}

function verbing(str){
    if(str.length<3) {
        return str;

    }else if (str.slice(-3) === 'ing'){
        return str + 'ly';
    }else{
        return str +'ing';
    }
}
console.log(verbing('read'));
console.log(verbing('reading'));
console.log(verbing('go'));
var n = 2;
function square(num){
    return num*num;
    
}
function cube(num){
return num*num*num;
}

var square1 = square(n);
console.log(square1);
var cube1 = cube(n);
console.log(cube1);


const radius = [3,4,6,7,12];
function circumference(r){
    return(3.14*2*r);

}
function area(r){
    return(3.14*r*r*r);

}
function diameter(r){
    return(2*r);

}
const a = radius.map(circumference);
const b= radius.map(area);
const c = radius.map(diameter);
console.log(a);
console.log(b);
console.log(c);
const lists = [1,2,3,4];
function binary(num4){
    return num4.toString(2);
}
const bi = list.map(binary);
console.log(bi);
