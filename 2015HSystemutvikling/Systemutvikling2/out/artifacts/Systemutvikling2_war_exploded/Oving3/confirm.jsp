<%@ page import="java.util.ArrayList" %>
<%--
    Document   : payment
    Created on : 21.aug.2015, 10:17:45
    Author     : nilstes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Betaling</title>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <h2>Bekreft kjøp</h2>
        <div>
        Her skal handlekurven listes ut, brukeren skal fylle ut navn og adresse,
        og det skal være en knapp for å bekrefte kjøpet.
        </div>
        <form method="get" action="receipt.jsp">
            Navn: <input type="text" name="navn" value=""><br>
            Adresse: <input type="text" name="adresse" value=""><br><br>
            <input type="submit" value="Bekreft kjøp">
        </form>
        <p></p>
        <h3>
            Din Oving4.Handlekurv:
        </h3>


    <%
        ArrayList<String> handlekurv = (ArrayList<String>)session.getAttribute("handlekurv");
        for (int i = 0; i < handlekurv.size(); i++) {
            out.println("<li>" + handlekurv.get(i) + "</li>");

        }
    %>
    </body>
</html>
