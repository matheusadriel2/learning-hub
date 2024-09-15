function evenOrOdd(n) {
    if(n % 2 == 0) {
        return "even"
    } else {
        return "odd"
    }
}

let n1 = 4;
let res = evenOrOdd(n1);
console.log(`The number ${n1} is a ${res} value.`)