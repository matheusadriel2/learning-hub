function fibonacci(numbers) {
    let c = numbers.a + numbers.b;
    console.log(numbers.a, numbers.b, c)
    numbers.a = numbers.b + c;
    numbers.b = c + numbers.a;
}
/* 
To access the object's properties, we use dot "." and get access to the reference values
The numbers parameter obtains reference from the "values" object, which has properties "a" and "b" that contain values "0" and "1" respectively
*/

let values = {a: 0, b: 1};
// Values were encapsulated in an object to pass parameters by reference

for (i = 1; i <= 10; i++) {
    fibonacci(values);
}