<!-- Filnavn eksempelsamling 1: kvadrat.jsp -->
<!-- Deklarasjon av metode -->

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%! int kvadrat(int innTall){
         return innTall*innTall;
       }
%>
Kvadratet av 10 blir: <%= kvadrat(10) %>
</body>
</html>
