<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 25.08.2015
  Time: 15.33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Kvadratrota</title>
  </head>
  <body>
  <strong>Kvadratrota</strong>
    <ul>
        <%
            double[] in = {-16, 0, 25};
            ArrayList<String> ut = new ArrayList<String>();
            String svar;
            for (int i = 0; i < in.length; i++) {
                double answer = Math.sqrt(in[i]);
                if (in[i] < 0){
                    svar = "<li> Kan ikke ta kvadratrota av " + in[i] + " <strong> Tallet er negativt!</strong> </li>";
                }else {
                    svar = "<li> Kvadratrota av " + in[i] + " er " + answer + "</li>";
                }
                ut.add(svar);
            }

        %>
        <%=ut%>
    </ul>
  </body>
</html>
