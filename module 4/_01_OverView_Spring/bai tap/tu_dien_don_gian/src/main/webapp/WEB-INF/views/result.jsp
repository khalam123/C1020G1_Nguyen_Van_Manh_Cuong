<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/22/21
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<form action="/dictionary">
    <input type="text" name="text" value="${text}">
    <input type="submit" name="search">
</form>
<h2>Result: ${resultTranslate}</h2>

</body>
</html>
