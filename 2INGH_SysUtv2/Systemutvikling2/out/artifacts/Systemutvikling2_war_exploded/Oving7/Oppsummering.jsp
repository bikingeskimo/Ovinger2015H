<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 15/09/2015
  Time: 23:04
  To change this template use File | Settings | File Templates.

  Det skal lages en JavaBean som tar imot og lagrer opplysningene.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="bean" class="Oving7.Bean" scope="session"/>
<jsp:setProperty name="bean" property="spam"/>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html charset=UTF-8">
        <title>Oppsummering</title>
    </head>
        <a href="Spam.jsp">return to Spam</a><br>
        <a href="Person.jsp">return to Person</a><br>

        Name: = <c:out value="${bean.name}"/><br>
        Surname: = <c:out value="${bean.surName}"/><br>
        Age: <c:out value="${bean.age}"/><br>
        Gender: <c:out value="${bean.gender}"/><br>
        Spam <c:out value="${bean.spam}"/><br>
    </body>
</html>
