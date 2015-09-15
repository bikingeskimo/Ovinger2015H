/**
 * Created by Roger on 08.09.2015.
 */
$(document).ready(function(){
    jQuery("#button").click(function (){
        var msg = $("#melding").val();
        jQuery.post("http://localhost:8080/Oving4/service.jsp", { input : msg});
    });

    var interval = setInterval(function (){
        $.get("http://localhost:8080/Oving4/service.jsp", function (data){
            $("#retrieve").html(data);
        });
    }, 3000);
});