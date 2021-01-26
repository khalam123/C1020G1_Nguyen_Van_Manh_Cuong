<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 1/25/21
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Simple Calculator</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/bootstrap.min.css">--%>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator" method="get">
    <fieldset >
        <legend><h3>Calculator</h3></legend>
        <table>
            <tr>
                <td>First operand: </td>
                <td><input type="text" name="input1"></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td><select name="operator" >
                        <option value="addition" >Addition</option>
                        <option value="minus">Minus</option>
                        <option value="multiple">Multiple</option>
                        <option value="divide">Divide</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand:</td>
                <td><input type="text" name="input2"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculator"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
