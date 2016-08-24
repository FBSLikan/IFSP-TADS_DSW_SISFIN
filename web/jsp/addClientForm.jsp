<%-- 
    Document   : ClientDetails.jsp
    Created on : 16/08/2016, 14:35:53
    Author     : carloseduardobeluzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Details</title>
    </head>
    <body>
       <h1>Modulo: Client</h1><hr>
       <form action="../AddClient.do">
            <div>Nome <input type="text" name="name"> </div>
            <div>Email <input type="text" name="email"> </div>
            <input type="submit" value="Add">
        </form>
            <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
