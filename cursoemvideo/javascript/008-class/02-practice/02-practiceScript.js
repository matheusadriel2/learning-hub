function verify() {
    const date = new Date();
    const year = date.getFullYear();
    const fYear = document.getElementById('txty')
    const res = document.getElementById('res')

    if (fYear.value.length == 0 || fYear.value > year) {
        window.alert('Invalid.')
    } else {
        var fsex = document.getElementsByName('radsex')
        var age = year - Number(fYear.value)
        var genre = ""
        var img = document.createElement('img')
        img.setAttribute('id', 'photo')
        img.style.width = "250px"
        img.style.height = "250px"
        img.style.borderRadius = "125px"

        if (fsex[0].checked) {
            genre = "Man"
            if (age >=0 && age < 10) {
                img.setAttribute('src', './assets/baby-man.jpg')
            } else if (age < 21) {
                img.setAttribute('src', './assets/young-man.jpg')
            } else if (age < 50) {
                img.setAttribute('src', './assets/adult-man.jpg')
            } else {
                img.setAttribute('src', './assets/old-man.jpg')
            }

        } else if (fsex[1].checked) {
            genre = "Woman"
            if (age >=0 && age < 10) {
                img.setAttribute('src', './assets/baby-woman.jpg')
            } else if (age < 21) {
                img.setAttribute('src', './assets/young-woman.jpg')
            } else if (age < 50) {
                img.setAttribute('src', './assets/adult-woman.jpg')
            } else {
                img.setAttribute('src', './assets/old-woman.jpg')
            }
        }

        res.style.textAlign = 'center'
        res.innerHTML = `We detected ${genre} with ${age} years.`
        res.appendChild(img)
        
    }
}