/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
    document.getElementById("Bathrooms").onclick = function() {bathroomFunction()};
    document.getElementById("Microwaves").onclick = function() {microwaveFunction()};
}

function myMap() {
  var mapCanvas = document.getElementById("map");
  var mapOptions = {
    center: new google.maps.LatLng(34.058929, -117.818898),
    zoom: 16
  }
  var map = new google.maps.Map(mapCanvas, mapOptions);
  
}

function bathroomFunction() {
  var mapCanvas = document.getElementById("map");
  var mapOptions = {center: new google.maps.LatLng(34.058929, -117.818898),zoom: 16}
  var map = new google.maps.Map(mapCanvas, mapOptions);
  /*finds the map and resets all of it again*/
  
  /*puts markers on where you want*/
   br1 = {lat: 34.058524, lng: -117.824785}; <!-- to display markers on specific places-->
   br2 = {lat: 34.057617, lng: -117.823385};
   br3 = {lat: 34.057857, lng: -117.821132};
   br4 = {lat: 34.059584, lng: -117.824255};
   var br = [br1,br2,br3,br4];
   for (i = 0; i < 4; i++){
		 new google.maps.Marker({position: br[i], map: map});
	 }
}

function microwaveFunction() {
  var mapCanvas = document.getElementById("map");
  var mapOptions = {center: new google.maps.LatLng(34.058929, -117.818898),zoom: 16}
  var map = new google.maps.Map(mapCanvas, mapOptions);
  /*finds the map and resets all of it again*/
  
    /*puts markers on where you want*/
   mw1 = {lat: 34.057564, lng: -117.823525}; <!-- to display markers on specific places-->
   mw2 = {lat: 34.057831, lng: -117.823010};
   mw3 = {lat: 34.055884, lng: -117.821154};
   mw4 = {lat: 34.059107, lng: -117.822398};
   var mw = [mw1,mw2,mw3,mw4];
   for (i = 0; i < 4; i++){
		 new google.maps.Marker({position: mw[i], map: map});
	 }
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
