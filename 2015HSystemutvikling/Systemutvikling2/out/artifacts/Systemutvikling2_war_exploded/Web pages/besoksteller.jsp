<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 25.08.2015
  Time: 15.16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.io.*, java.util.*" %>
<html>
  <head>
      <title>Besøksteller</title>
  </head>
  <body>
  <%
    Integer hitsCount = (Integer)application.getAttribute("hitCounter");
    if (hitsCount == null || hitsCount == 0){
      hitsCount = 1;
    }else {
      hitsCount +=1;
    }
    application.setAttribute("hitCounter", hitsCount);
  %>
  <div>
    <p>Siden er nå lastet ned  <%= hitsCount%> ganger siden webtjeneren
        startet siste gang</p>
  </div>
  </body>
</html>
