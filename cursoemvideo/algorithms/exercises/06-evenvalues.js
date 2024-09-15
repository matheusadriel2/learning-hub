let values = [1, 2, 3, 4, 5, 6, 7];
let totEvn = 0;

for (i = 1; i <= values.length; i++) {
    if (values[i] % 2 == 0) {
        totEvn++
        console.log(`Even number in position ${i}`)
    }
}

console.log(`The total of even numbers was ${totEvn}`)