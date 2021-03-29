<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/24/21
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Mail</title>
</head>
<body>
<h2>Submitted</h2>
<table>
    <tr>
        <th>Language:</th>
        <td>${language}</td>
    </tr>
    <tr>
        <th>Page size:</th>
        <td>${pageSize} emails per pages</td>
    </tr>
    <tr>
        <th>SpamsFilter: </th>
        <td>${spamsFilter}</td>
    </tr>
    <tr>
        <th>Signature: </th>
        <td>${signature}</td>
    </tr>
</table>

</body>
</html>
