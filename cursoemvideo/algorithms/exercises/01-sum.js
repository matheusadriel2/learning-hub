function sum(values) {
    console.log(`Received the value ${values.a}.`);
    console.log(`Received the value ${values.b}.`);
    console.log(`The sum between ${values.a} and ${values.b} is ${values.a + values.b}`);
}

let numbers = {a: 5, b: 10};
sum(numbers)