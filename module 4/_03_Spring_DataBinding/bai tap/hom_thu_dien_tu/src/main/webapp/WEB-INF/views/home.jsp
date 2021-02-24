<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/24/21
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form:form method="post" modelAttribute="mail">
    <table>
        <tr>
            <th><form:label path="language">Language</form:label></th>
            <td><form:select path="language">
                <form:options items="${listLanguage}"/>
            </form:select></td>
        </tr>
        <tr>
            <th><form:label path="pageSize">Page Size: </form:label></th>
            <td>Show <form:select path="pageSize">
                <form:options items="${listPageSize}"/>
            </form:select> email per page</td>
        </tr>
        <tr>
            <th><form:label path="spamsFilter">Spams Filter: </form:label></th>
            <td><form:checkbox path="spamsFilter"/> Enable spams filter</td>
        </tr>
        <tr>
            <th><form:label path="signature">Signature: </form:label></th>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <th></th>
            <td><input type="submit" value="Update"></td>
            <td><input type="submit" value="Cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
