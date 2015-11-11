<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 11.11.2015
  Time: 11.33
  To change this template use File | Settings | File Templates.
--%>
<%@page import="springmvc.userexample.domain.User" %>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="language" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="bean" class="springmvc.userexample.domain.User" scope="session"/>
<jsp:setProperty name="bean" property="*"/>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Display</title>
</head>
    <body>
    <p><language:message code="welcome" /></p><p>${user.firstname} ${user.lastname}</p>
    <img src="http://1.vgc.no/drpublish/images/article/2015/02/16/23397123/1/big_10/2356696.jpg">
    </body>
</html>
