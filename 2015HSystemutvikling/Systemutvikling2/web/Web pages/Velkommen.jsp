<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 26.08.2015
  Time: 13.30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.lang.*" %>
 <html>
    <head>
      <title>Velkommen</title>
    </head>
    <body>
        <h2><script>
            var navn = "";
            do {
              navn = prompt("Skriv inn dit namn, unge padawan");
            }while (navn == null);
            document.writeln("Velkommen " + navn);
            </script></h2>
        <div id="Lok"></div>
    </body>
</html>
<style>
    #Lok{
        width: 700px; height: 400px;
        background-image: url("http://www.frukt.no/sitefiles/site1/files/artimg/gul-lok66.jpg");
        }

    #Lok:hover{
        background-image: url("http://www.bama.no/eway/imgstore/ec482f892f.jpg");
    }
</style>
