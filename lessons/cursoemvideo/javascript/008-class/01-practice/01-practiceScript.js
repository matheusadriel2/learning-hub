function Time() {
    const msg = window.document.getElementById('msg');
    const img = window.document.getElementById('image')
    const date = new Date();
    const hours = date.getHours();
    msg.innerHTML = `Now is ${hours} hours.`

    if (hours >= 0 && hours < 12) {
        img.src = './assets/manha.jpg'
    } else if (hours >= 12 && hours < 18) {
        img.src = './assets/tarde.jpg'
    } else {
        img.src = './assets/noite.jpg'
    }
}