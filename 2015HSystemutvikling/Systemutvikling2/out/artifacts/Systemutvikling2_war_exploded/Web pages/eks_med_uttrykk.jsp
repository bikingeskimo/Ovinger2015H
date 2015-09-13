<!-- Filnavn eksempelsamling 1: eks_med_uttrykk.jsp -->
<!-- Eksempel der uttrykk brukes for å sende dynamisk innhold til klienten -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Eksempel med uttrykk</h1>
<%
    boolean sann = true;
    String streng = "sann ...";
    if (sann) { %>
        <%= streng %>
    <% } else { %>
        <%= "usann ..."%>
    <% } 
%>    
</body>
</html>
