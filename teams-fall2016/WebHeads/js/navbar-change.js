$(document).ready(function () {
    var scroll_start = 0;
    var startchange = $('#about');
    var offset = startchange.offset();
    
    $(document).scroll(function () {
        scroll_start = $(this).scrollTop();
        if (scroll_start >= offset.top) {
            $('.navbar').css('background-color', '#4C4C4C');
        } else {
            $('.navbar').css('background-color', 'transparent');
        }
    });
});