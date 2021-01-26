<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 1/25/21
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Customer list</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/bootstrap.min.css">
</head>
<body>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Name</th>
        <th scope="col">DayOfBirth</th>
        <th scope="col">Address</th>
        <th scope="col">Image</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="customer" items="${CustomerFromServlet}">
            <tr>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.dob}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td><img src="${customer.image}"/></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
