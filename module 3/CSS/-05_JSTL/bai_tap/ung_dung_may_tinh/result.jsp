<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 1/25/21
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>Result</h2>
<c:choose>
    <c:when test="${check != 0}"> Can't divide by 0</c:when>
    <c:otherwise>
        <c:out value="${num1}"/>
        <c:out value="${operator}"/>
        <c:out value="${num2}"/>
        <c:out value="${'='}"/>
        <c:out value="${result}"/>
    </c:otherwise>
</c:choose>

</body>
</html>
