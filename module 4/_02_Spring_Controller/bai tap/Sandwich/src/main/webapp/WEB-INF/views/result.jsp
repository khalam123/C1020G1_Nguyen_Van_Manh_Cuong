<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/23/21
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sandwich Condiment</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<h4>Choose one or more condiment</h4>
<form action="/save" method="get">
    <table>
        <tr>
            <td>
                <label>Lettuce</label><br>
                <input type="checkbox" name="condiment" value="Lettuce">
            </td>
            <td>
                <label>Tomato</label><br>
                <input type="checkbox" name="condiment" value="Tomato">
            </td>
            <td>
                <label>Mustard</label><br>
                <input type="checkbox" name="condiment" value="Mustard">
            </td>
            <td>
                <label>Sprouts</label><br>
                <input type="checkbox" name="condiment" value="Sprouts">
            </td>
        </tr>
    </table>
    <input type="submit" value="save">
</form>
<h1>Condiments:</h1>
    <c:forEach var="contiment" items="${condiment}">
        <h3>
                ${contiment}
        </h3>
    </c:forEach>
</body>
</html>
