<!-- Filnavn eksempelsamling 1: eks_med_out.jsp -->
<!-- Eksempel der out-objektet brukes for å sende dynamisk innhold til klienten -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Eksempel med out</h1>
<%
    boolean sann = true;
    String streng = "sann ...";
    if (sann) out.println(streng);
    else out.println("usann");
%>  
</body>
</html>
