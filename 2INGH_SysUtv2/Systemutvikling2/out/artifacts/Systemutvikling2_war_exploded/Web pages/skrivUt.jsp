<!-- Filnavn eksempelsamling 1: skrivUt.jsp -->
<!-- Eksempel med utskrift inni metode -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
    <% skrivUt(out); %>
</body>
</html>

<%! void skrivUt(JspWriter outMetode){
          try{
            outMetode.println("Skriver ut fra min egen metode");
          } catch(Exception e){}
        }
%>
