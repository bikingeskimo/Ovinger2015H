<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 21/10/2015
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sum JSP View</h1>
        Summen av tallene er <c.out value="${summenAvTallene}"/>
    </body>
</html>
