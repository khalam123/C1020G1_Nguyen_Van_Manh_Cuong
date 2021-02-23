<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/2/21
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Customer</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
<div class="row container-fluid">

    <div class="col-lg-4 div1" ><span><img src="${pageContext.request.contextPath}/img/furama_icon.png" alt=""></span></div>
    <div class="col-lg-4"><h2 align="center">Furama</h2></div>
    <div class="col-lg-4 "><span class="div2">Nguyễn Văn Mạnh Cường</span></div>

</div>
<div style="text-align: center">
    <h1>User Management</h1>
    <h2>
        <a href="customer?action=customer">List All Customer</a>
    </h2>
</div>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">

            <tr>
                <th> Id:</th>
                <td>
                    <input type="text" name="id" size="45">
                </td>
            </tr>
            <tr>
                <th> Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th> Birthday:</th>
                <td>
                    <input type="text" name="birthday" id="birthday" size="45"/>
                </td>
            </tr>
            <tr>
                <th> Gender:</th>
                <td>
                    <select name="gender" >
                        <option id="female">Female</option>
                        <option id="male">Male</option>
                        <option id="other">Other</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th> Id Card:</th>
                <td>
                    <input type="text" name="id_card" size="45">
                </td>
            </tr>
            <tr>
                <th> Phone:</th>
                <td>
                    <input type="text" name="phone" size="45">
                </td>
            </tr>
            <tr>
                <th> Email:</th>
                <td>
                    <input type="text" name="email" size="45">
                </td>
            </tr>
            <tr>
                <th> Address:</th>
                <td>
                    <input type="text" name="address" size="45">
                </td>
            </tr>
            <tr>
                <th> Type Customer:</th>
                <td>
                    <select name="type_customer" >
                        <option id="diamond">Diamond</option>
                        <option id="platinium">Platinium</option>
                        <option id="gold">Gold</option>
                        <option id="silver">Silver</option>
                        <option id="member">Member</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
