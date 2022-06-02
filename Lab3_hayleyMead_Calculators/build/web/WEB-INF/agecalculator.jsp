<%-- 
    Document   : agecalculator
    Created on : Jun 1, 2022, 3:34:28 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age: </label>
            <input type="number" name="age_user" value="${age}" required>
            <br>
            <input type="submit" value="Age next birthday">
        </form>
            
        <p>${message} ${ageCalcMsg}</p>
        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
