let inp = document.querySelector("input#num");
let tab = document.querySelector("select#restable");
let resD = document.querySelector("div#res")
let numList = [];

function addNum() {
    let n = Number(inp.value);
    resD.innerHTML = ""
    let exists = false;
    for (i = 0; i < numList.length; i++) {
        if (numList[i] === n) {
            exists = true;
            break;
        }
    }
    if (!exists && n >= 1 && n <= 100) {
        numList.push(n)

        if (numList.length == 1) {
            tab.innerHTML = ""
        }

        let tabNum = document.createElement('option')
        for (let pos in numList) {
            tabNum.text = `Value ${numList[pos]} added.`
        }
        tab.appendChild(tabNum)
    } else if (exists) {
        window.alert("Repeated values! 🤦‍♂️")
    } else {
        window.alert("Invalid values! 🤦‍♂️")
    }

    console.log(numList)
}

function analyse() {
    resD.innerHTML = ""
    if (numList.length > 0) {
        numList.sort()
        let res1 = document.createElement('div')
        res1.innerHTML = `We have ${numList.length} numbers.`
        resD.appendChild(res1)
        let bigger = numList[0];
        for (pos in numList) {
            if (numList[pos] > bigger) {
                bigger = numList[pos]
            }
        }
        let res2 = document.createElement('div')
        res2.innerHTML = `The greatest value is ${bigger}.`
        resD.appendChild(res2)
        let minor = numList[0];
        for (pos in numList) {
            if (numList[pos] < minor) {
                minor = numList[pos]
            }
        }
        let res3 = document.createElement('div')
        res3.innerHTML = `The lowest value is ${minor}.`
        resD.appendChild(res3)
        let sum = 0
        for (pos in numList) {
            sum += numList[pos]
        }
        let res4 = document.createElement('div')
        res4.innerHTML = `The sum of all values is ${sum}.`
        resD.appendChild(res4)
        let media = sum / numList.length
        let res5 = document.createElement('div')
        res5.innerHTML = `The media of the values is ${media.toFixed(1)}`
        resD.appendChild(res5)
        
    
        console.log(numList)
    } else {
        window.alert("Invalid values! 🤦‍♂️")
    }
}