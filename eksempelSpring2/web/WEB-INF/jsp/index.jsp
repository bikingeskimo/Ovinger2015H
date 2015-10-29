<%@page contentType="text/html;" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 21/10/2015
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TB/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
      <head>
          <title>JSP Page</title>
      </head>
      <body>
            <form:form method="POST" modelAttribute="kalkulator" action="summer">
                <table>
                    <tr>
                        <td>Tall 1: </td>
                        <td><form:input path="tall1"/></td>
                        <td><form:errors path="tall1"/></td>
                    </tr>
                    <tr>
                        <td>Tall 2: </td>
                        <td><form:input path="tall2"/></td>
                        <td><form:errors path="tall2"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="SEND"></td>
                    </tr>
                </table>
            </form:form>
      </body>
</html>
