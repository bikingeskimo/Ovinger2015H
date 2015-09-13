<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 25.08.2015
  Time: 15.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<html>
  <head>
      <title>En hilsen</title>
  </head>
  <body>
        <%
            String hilsen;
            int hours = new java.util.Date().getHours();
          if (hours < 10){
              hilsen = "God Morgen!";
            }else if (hours > 10 && hours < 17){
              hilsen = "God Dag!";
            }else {
              hilsen = "God Kveld!";
            }
                %>
      <div>
        <out.println> Klokka er </out.println>
        <%=String.format(new Date().getHours() + "" + new Date().getMinutes())%>
      <out.println> Da sier vi </out.println>
      <%=hilsen%>
    </div>
  </body>
</html>
