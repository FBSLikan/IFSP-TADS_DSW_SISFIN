<%-- 
    Document   : feedbackView
    Created on : 24/08/2016, 21:15:53
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String msg = (String) request.getAttribute("msgAttr");
        %>
        
        <h1><%=msg%></h1>
        
        ${param.name} | ${param.email}
        <hr>
        <a href="jsp/managerView.jsp">Back</a>

    </body>
</html>
