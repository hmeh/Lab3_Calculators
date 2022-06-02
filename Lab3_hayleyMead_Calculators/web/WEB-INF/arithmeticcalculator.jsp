<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 1, 2022, 6:02:17 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="number" name="first_num" value="${first}" required>
            <br>
            <label>Second: </label>
            <input type="number" name="second_num" value="${second}" required>
            <br>
            <input type="submit" name="calcbtn" value="+">
            <input type="submit" name="calcbtn" value="-">
            <input type="submit" name="calcbtn" value="*">
            <input type="submit" name="calcbtn" value="%">
        </form>
            
        <p>Result:  ${message} ${CalcMsg}</p>
        <a href="./age">Age Calculator</a>
    </body>
</html>
