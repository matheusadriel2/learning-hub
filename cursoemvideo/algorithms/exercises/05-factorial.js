function factorial(v) {
    let r = 1;
    for(i = 1; i <= v; i++) {
        r = r * i;
    }
    return r;
}

let n = 5;
let f = factorial(n);
console.log(`The factorial of ${n} is ${f}.`)