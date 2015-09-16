<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 15/09/2015
  Time: 23:03
  To change this template use File | Settings | File Templates.

  Tar imot dataene i html-formen til Person og tar også inn
  -Motta spam? (checkbox)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bean" class="Oving7.Bean" scope="session"/>
<jsp:setProperty name="bean" property="*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Spam</title>
    </head>
    <body>
        <a href="Person.jsp">return to Person</a><br>
        <form action="Oppsummering.jsp" method="get">
            Retrieve spam?<input type="checkbox" id="check" name="spam" value="true"><br>
            <input type="hidden" value="false" name="spam">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
