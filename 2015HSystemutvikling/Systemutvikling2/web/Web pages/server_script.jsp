<!-- Filnavn eksempelsamling 1: server_script.jsp -->
<!-- Eksempel på programmering av tjenersiden -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Tjenerside-script</title>
</head>
<body>
<h1> Denne siden viser klokken nå </h1>
        <% out.println(new java.util.Date()); %>
</body>
</html>
