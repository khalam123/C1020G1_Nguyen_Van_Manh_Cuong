<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/23/21
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator Simple</h1>
  <form action="/operator">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <br>
    <input type="submit" name="operator" value="Add(+)">
    <input type="submit" name="operator" value="Minus(-)">
    <input type="submit" name="operator" value="Multi(*)">
    <input type="submit" name="operator" value="Div(/)">
  </form>
  </body>
</html>
