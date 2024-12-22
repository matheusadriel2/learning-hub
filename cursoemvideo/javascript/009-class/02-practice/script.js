function multiply() {
    let innum = document.querySelector("input#number")
    let seltab = document.querySelector("select#xtable")

    if (innum.value.length == 0) {
        window.alert('Empty field!')
    } else {
        n = Number(innum.value)
        seltab.innerHTML = ''
        for(i = 1; i <= 10; i++) {
            let item = document.createElement('option')
            item.text = `${n} x ${i} = ${n*i}`
            seltab.appendChild(item)
        }
    }
}

