document.addEventListener('DOMContentLoaded', function() {
    const button = document.querySelector(".arrow")
    const image = button.querySelector("img")

    button.addEventListener("click", function() {
        const isScrolledDownByATeensyBit = image.classList.toggle("rotated")

        if (isScrolledDownByATeensyBit) {
            window.scrollBy({
                top: 900,
                behavior: "smooth"
            })
        }
        else {
            window.scrollTo({
                top: 0,
                behavior: "smooth"
            })
        }
    })

    window.addEventListener('scroll', function() {
        if (window.scrollY === 0) {
            image.classList.remove('rotated');
        } else {
            image.classList.add('rotated');
        }
    });
})