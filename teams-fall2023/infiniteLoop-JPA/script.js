var imageIndex = 1;
var images = ["HuddleHome.png", "Signup.png", "HuddleGroups.png", "CreateHuddle.png", "Task.png","AddTask.png","Calendar.png","Members.png","AddMember.png"];
var imageElement = document.getElementById("transitionImage");

function transitionImage() {
    imageElement.src = images[imageIndex];
    imageIndex = (imageIndex + 1) % images.length;
}

// Set interval for image transition (change every 5 seconds)
setInterval(transitionImage, 2000);