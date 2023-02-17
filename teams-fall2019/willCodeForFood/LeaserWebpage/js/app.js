function imageGallery() {
	const highlight = document.querySelector(".gallery-highlight");
	const previews = document.querySelectorAll(".room-preview img");
	
	previews.forEach(preview => {
		preview.addEventListener('click', function(){
			const smallSrc = this.src;
			const bigSrc = smallSrc.replace("small", "big");
			highlight.src = bigSrc;
		});
	}); 
}

imageGallery();

function popup() {
  alert("You have successfully applied");
}

/* function imageGallery2() {
	const highlight = document.querySelector(".gallery-highlight2");
	const previews = document.querySelectorAll(".room-preview2 img");
	
	previews.forEach(preview => {
		preview.addEventListener('click', function(){
			const smallSrc = this.src;
			const bigSrc = smallSrc.replace("small", "big");
			highlight.src = bigSrc;
		});
	}); 
}

imageGallery2(); */
