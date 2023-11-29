var imageIndex = 1;
var images = ["image1.png", "image2.png", "image3.png"];
var imageElement = document.getElementById("transitionImage");

function transitionImage() {
    imageElement.src = images[imageIndex];
    imageIndex = (imageIndex + 1) % images.length;
}

// Set interval for image transition (change every 5 seconds)
setInterval(transitionImage, 5000);
