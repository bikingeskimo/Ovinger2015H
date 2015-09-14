<%-- 
    Document   : newjsp
    Created on : 19.aug.2015, 10:55:11
    Author     : nilstes
--%>

<%@page import="java.util.Date"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="javax.swing.text.html.HTMLDocument" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kvittering</title>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <h2>Bekreftelse</h2>
        Denne siden skal vise en kvittering på utført kjøp.

    <h3>Dine varer:</h3>
        <%
            ArrayList<String> handlekurv = (ArrayList<String>)session.getAttribute("handlekurv");
            for (int i = 0; i < handlekurv.size(); i++) {
                out.println("<li>" + handlekurv.get(i) + "</li>");

            }
        %>
    <h3>Navn: </h3>
        <%
            out.println(request.getParameter("navn"));
        %>
    <h3>Adresse: </h3>
        <%
            out.println(request.getParameter("adresse"));
        %>
    <p><a href="index.html">Hjem</a></p>
    </body>
</html>
<%
    session.invalidate();

%>