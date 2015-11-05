<%--suppress ALL --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="language" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="spring" %>

<%@page import="springmvc.userexample.domain.User" %>
<jsp:useBean id="bean" class="springmvc.userexample.domain.User" scope="request"/>
<jsp:setProperty name="bean" property="*"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>

    <language:message code="welcome"/>

    <form:form method="POST" modelAttribute="userForm" >
    <form:errors path="*" />
        <table>
		<tr>
            <td><language:message code="firstname"/>:</td>
			<td><form:input path="user.firstname" /></td>
            <td><form:errors path="user.firstname" /></td>
		</tr>
		<tr>
            <td> <language:message code="lastname"/>:</td>
			<td><form:input path="user.lastname" /></td>
            <td><form:errors path="user.lastname" /></td>
		</tr>
        <tr>
            <td><language:message code="age"/>:</td>
            <td><form:input path="user.age" /></td>
            <td><form:errors path="user.age" /></td>
        </tr>
		<tr>
            <td><language:message code="gender"/>:</td>
			<td><form:radiobutton path="user.gender" value="M" label="M" /> 
				<form:radiobutton path="user.gender" value="F" label="F" />
			</td>
			<td><form:errors path="user.gender" /></td>
		</tr>
		<tr>
            <td><language:message code="country"/>:</td>
			<td><form:select path="user.country">
				<form:option value="" label="Select" />
				<form:options items="${userForm.countryList}" />
				</form:select>
			</td>
            <td><form:errors path="user.country" /></td>
        </tr>
        <tr>
            <td><language:message code="spam"/>:</td>
            <td><form:radiobutton path="user.spam" value="Yes" label="Yes" />
                <form:radiobutton path="user.spam" value="No" label="No" />
            </td>
            <td><form:errors path="user.spam" /></td>
        </tr>
            <td><language:message code="hobby"/>:</td>
            <td><form:checkboxes path="user.hobby" items="${userForm.hobbyList}"/></td>
            <td><form:errors path="user.hobby" /></td>
        </tr>
        <tr>
            <td></td><td><form:input path="user.hobby" placeholder="Other hobby?"/></td>
            <td><form:errors path="user.hobby" /></td>
        </tr>

		<tr>
            <td><input type='submit' value="SEND"></td>
        </tr>
        </table>
    </form:form>

    <language:message code="footer"/>
</body>
</html>