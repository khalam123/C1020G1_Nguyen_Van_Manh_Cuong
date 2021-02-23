
<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/2/21
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Customer</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

</head>
<body>
<div class="row container-fluid">

    <div class="col-lg-4 div1" ><span><img src="${pageContext.request.contextPath}/img/furama_icon.png" alt=""></span></div>
    <div class="col-lg-4"><h2 align="center">Furama</h2></div>
    <div class="col-lg-4 "><span class="div2">Nguyễn Văn Mạnh Cường</span></div>

</div>
<h1 align="center">Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p align="center">
    <a href="/customer">Back to customer</a>
</p>
<div align="center">
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table border="1" cellpadding="5">

            <tr>
                <th>Name: </th>
                <td><input type="text" name="name" value="${customerListFromServlet.customer_name}"></td>
            </tr>
            <tr>
                <td>Birthday: </td>
                <td><input type="text" name="birthday"  value="${customerListFromServlet.customer_birthday}"></td>
            </tr>
            <tr>
                <th>Gender: </th>
                <td>
                    <select name="gender" value="${customerListFromServlet.customer_gender}">
                        <option id="female">Female</option>
                        <option id="male">Male</option>
                        <option id="other">Other</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Id_card: </th>
                <td><input type="text" name="id_card" value="${customerListFromServlet.customer_id_card}"></td>
            </tr>
            <tr>
                <th>Phone: </th>
                <td><input type="text" name="phone" value="${customerListFromServlet.customer_phone}"></td>
            </tr>
            <tr>
                <th>Email: </th>
                <td><input type="text" name="email" value="${customerListFromServlet.customer_email}"></td>
            </tr>
            <tr>
                <th>Address: </th>
                <td><input type="text" name="address" value="${customerListFromServlet.customer_address}"></td>
            </tr>
            <tr>
                <th>Customer type: </th>
                <td>
                    <select name="customer_type" value="${customerListFromServlet.customer_type}">
                        <option id="diamond">Diamond</option>
                        <option id="platinum">Platinum</option>
                        <option id="gold">Gold</option>
                        <option id="silver">Silver</option>
                        <option id="member">Member</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</div>
</body>
</html>
