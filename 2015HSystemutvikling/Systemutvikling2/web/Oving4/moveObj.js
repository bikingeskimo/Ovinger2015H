/**
 * Created by Roger on 08.09.2015.
 */
$(document).ready(function(){
    $("#box").mouseover(function() {
        var dWidth = window.innerWidth,
            dHeight = window.innerHeight,
            nextX = Math.floor(Math.random() * dWidth),
            nextY = Math.floor(Math.random() * dHeight);
        $("#box").stop()
        $("#box").animate({ left: nextX + 'px', top: nextY + 'px' }, 4000, 'linear');
    });

    $("#box").click(function(){
        $("#box").stop();
        $("#box").fadeOut(500);
    });
});