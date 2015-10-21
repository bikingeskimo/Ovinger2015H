<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 21/10/2015
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Summer tall</title>
  </head>
  <body>
    <h1>Summer tall</h1>
        <%
          String t1 = request.getParameter("tall1");
          String t2 = request.getParameter("tall2");

          int sum = 0;

          if (t1 != null && t2 != null){
            int tall1 = Integer.parseInt(t1);
            int tall2 = Integer.parseInt(t2);
            sum = tall1 + tall2;
          }

        %>
    Summen av tallene er: <%= sum %>
  </body>
</html>
