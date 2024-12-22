function searchMinor(arr) {
    let minor = arr[0];
    let minorIndex = 0;
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < minor) {
            minor = arr[i];
            minorIndex = i;
        }
    }
    return minorIndex;
}

function orderBySelection(arr) {
    let newArr = [];
    let length = arr.length;
    for (let i = 0; i < length; i++) {
        let minor = searchMinor(arr);
        newArr.push(arr.splice(minor, 1)[0]);
    }
    return newArr;
}

console.log(orderBySelection([5, 3, 6, 2, 10]));




