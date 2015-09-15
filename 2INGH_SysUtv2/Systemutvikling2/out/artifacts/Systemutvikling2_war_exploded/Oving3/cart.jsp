<%-- 
    Document   : cart
    Created on : 21.aug.2015, 10:13:36
    Author     : nilstes
--%>

<%@page import="Oving4.Vareutvalg"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // todo: Denne skal hentes fra sesjonen
    // Hvis den ikke eksisterer i sesjonen må vi opprette ny og legge i sesjonen

    ArrayList<String> handlekurv = (ArrayList<String>) session.getAttribute("handlekurv");

    if (handlekurv == null){
        handlekurv = new ArrayList<>();
    }

    // todo: Sjekk om det er parametre i requesten og legg isåfall til varen i handlekurven

    if (request.getParameter("item") != null){
        handlekurv.add(request.getParameter("item"));
    }

    session.setAttribute("handlekurv", handlekurv);

    Cookie cookie = new Cookie("item", request.getParameter("item"));
    String preselected = "";

    Cookie[] cookielist = request.getCookies();
    for (int i=0; i < cookielist.length; i++){
        if(cookielist[i].getName().equals("item")){
            preselected = cookielist[i].getValue();
        }
    }


%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Butikken sin</title>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <a href="confirm.jsp">Til betaling</a>
        <h2>Innhold i handlevogn:</h2>
        <ul>
            <%
                for(int i=0; i<handlekurv.size(); i++) {
                    out.print("<li>" + handlekurv.get(i) + "</li>");
                 }
            %>
        </ul>
        <h2>Legg til ny vare:</h2>
        <form method="POST" action="cart.jsp">
            <select name="item">
                <% 
                    List<String> varer = Vareutvalg.getVareliste();

                    for(int i=0; i<varer.size(); i++) {
                        if (varer.get(i).equals(preselected)){
                            out.print("<option selected='selected'>" + varer.get(i) + "</option>");
                        }else {
                            out.print("<option>" + varer.get(i) + "</option>");
                        }
                    }
                %>
            </select>
            <input type="submit" value="Legg til">
        </form>
    </body>
</html>
