<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/4/21
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
<div style="text-align: center">
    <h1>Product Management</h1>
    <h2>
        <a href="product?action=product">List All Product</a>
    </h2>
</div>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">

            <tr>
                <th> Name Product(*):</th>
                <td>
                    <input type="text" name="name" id="name" size="45" required
                           pattern="^[A-Z][a-z]+$"/>
                </td>
            </tr>
            <tr>
                <th> Price (*):</th>
                <td>
                    <input type="text" name="price" id="price" size="45" required
                            pattern="^([1-9][0-9][0-9])+$" title=" Price must > 100"/>
                </td>
            </tr>
            <tr>
                <th> Discount(*):</th>
                <td>
                    <select name="discount" >
                        <option id="5" value="5">5%</option>
                        <option id="10" value="10">10%</option>
                        <option id="15" value="15">15%</option>
                        <option id="20" value="20">20%</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th> Stock:</th>
                <td>
                    <input type="text" name="stock" id="stock" size="45" required
                            pattern="^([1-9][0-9])+$" title="Price must > 10">
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
