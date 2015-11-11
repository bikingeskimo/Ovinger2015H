<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="language" uri="http://www.springframework.org/tags" %>

<%@page import="springmvc.userexample.domain.User" %>
<jsp:useBean id="bean" class="springmvc.userexample.domain.User" scope="session"/>
<jsp:setProperty name="bean" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <language:message code="welcome"/>
        <h1>Your personal data are: </h1>
        
        <c:set var="user" value="${userForm.user}" />
               
        <p> <language:message code="firstname"/>: ${user.firstname}
        <p> <language:message code="lastname"/>: ${user.lastname}
        <p> <language:message code="gender"/>: ${user.gender}
        <p> <language:message code="country"/>: ${user.country}
        <p> <language:message code="age"/>: ${user.age}
        <p> <language:message code="spam"/>: ${user.spam}
        <p> <language:message code="hobbies"/>: ${user.hobby}
            
        <p> All: ${user}
    </body>
</html>
