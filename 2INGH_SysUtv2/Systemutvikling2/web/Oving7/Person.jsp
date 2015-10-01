<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 15/09/2015
  Time: 16:57
--%>
<%@page import="beans.Bean" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="person" class="beans.Bean" scope="request"/>
<jsp:setProperty name="person" property="*"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=UTF-8">
    <title>Person</title>
  </head>
  <body>
    <form name="form" action="Spam.jsp"; method="post">
        Name: <br> <input type="text" name="name" required><br>
        Surname: <br> <input type="text" name="surName" required><br>
        Age: <br> <input type="number" name="age" required><br>
        <input type="radio" name="gender" value="Male" required>Male
        <input type="radio" name="gender" value="Female" required>Female
        <input type="radio" name="gender" value="Pokemon" required>Pokemon<br>
        <input type="submit" value="submit"><br>
    </form>
  </body>
</html>
