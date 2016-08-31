<%-- 
    Author     : Fausto Biazzi de Sousa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Card Details</title>
    </head>
    <body>
       <h1>Modulo: Cartão</h1><hr>
       <form action="../AddCard.do">
            <div>Numero <input type="int" name="Numero"> </div>
            <div>vencimento <input type="date" name="Data"> </div>
            <input type="submit" value="Add">
        </form>
            <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
