function fac(n) {
    let aux = 1
    for (i = n; i > 1; i--) {
        aux *= i
    }
    return aux
}

console.log(fac(5))
