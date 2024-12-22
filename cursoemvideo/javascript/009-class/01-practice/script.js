function count() {
    let start = document.querySelector("input#start")
    let end = document.querySelector("input#end")
    let step = document.querySelector("input#step")
    let res = document.querySelector("div#res")

    if (start.value.length == 0 || end.value.length == 0 || step.value.length == 0) {
        res.innerHTML = `Empty fields!`
    } else {
        res.innerHTML = 'Counting: <br>'
        let st = Number(start.value)
        let en = Number(end.value)
        let sp = Number(step.value)
        if (sp <= 0) {
            window.alert('Invalid step. Starting with 1...')
            sp = 1
        }
        if (st < en) {
            for(let i = st; i <= en; i += sp) {
                res.innerHTML += ` ${i} \u{1F449}`
            }
        } else {
            for(let i = st; i >= en; i -= sp) {
                res.innerHTML += ` ${i} \u{1F449}`
            }
        }
        res.innerHTML += `\u{1F3C1}`
    }
}
