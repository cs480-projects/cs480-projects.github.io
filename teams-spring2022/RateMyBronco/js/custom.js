/*
	Rocket Internet by TEMPLATE STOCK
    templatestock.co @templatestock
*/

/* Header Full Screen */
$(document).ready(function () {
  $("#homeFullScreen").css({ height: $(window).height(), width: $(window).width() });
  $(window).resize(function () {
    $("#homeFullScreen").css({ height: $(window).height(), width: $(window).width() });
  });
});
