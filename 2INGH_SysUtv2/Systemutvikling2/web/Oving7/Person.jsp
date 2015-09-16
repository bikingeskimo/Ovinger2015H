<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 15/09/2015
  Time: 16:57
  To change this template use File | Settings | File Templates.

  Skal inneholde en html-form som tar inn:
  Fornavn
  Etternavn
  Alder (talli JB)
  Kjønn

  Oppg.3: Legg inn feilhåndtering, og send tilbake for nytt forsøk.
  Skriv ut feilmelding
  Sørg for at de andre feltene ikke strykes fordi ett er feil
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <script>
        function validateForm(){
            var x = document.forms["form"]["name"].value();
            if(x == null || x == "") {
                alert("Fill out name please!");
            }
            return false;
        }
    </script>
    <meta http-equiv="content-type" content="text/html charset=UTF-8">
    <title>Person</title>
  </head>
  <body>
    <form name="form" action="Spam.jsp"; method="post">
        Name: <input type="text" name="name" required><br>
        Surname: <input type="text" name="surname" required><br>
        Age: <input type="text" name="age" required><br>
        <input type="radio" name="gender" value="Male" required>Male
        <input type="radio" name="gender" value="Female" required>Female
        <input type="submit" value="submit"><br>
    </form>
  </body>
</html>
