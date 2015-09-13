<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 01.09.2015
  Time: 13.35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Hvor lenge er det til julaften?</title>
  </head>
  <body>
    <script type="text/javascript">
        function findChristmas() {
            day = new Date();
            today = new Date(day.getFullYear(), 10, 24);
            var christmas = new Date(today.getFullYear(), 11, 24);            // Month is 0-11 in JS
            if (today.getMonth() == 11 && today.getDate() > 24) {            // If later than 24/12
                christmas.setFullYear(christmas.getFullYear() + 1);         // Calculate next year
            }
            var one_day = 1000 * 60 * 60 * 24;                            //Convert from date-format (seconds) to day

            var result = Math.ceil((christmas.getTime() - today.getTime()) / (one_day));

            document.getElementById("days").innerHTML  = result;

            if (result > 30 && result < 90 || result == 30 || result == 90) {
                document.getElementById("days").style.color = 'green';
            } else if (result < 30) {
                document.getElementById("days").style.color = 'red';
            } else {
                document.getElementById("days").style.color = 'black';
            }
        }
    </script>

  <h1>Dager til jul:
  <div id = "days"></div></h1>
    <script>findChristmas();</script>
  </body>
</html>
