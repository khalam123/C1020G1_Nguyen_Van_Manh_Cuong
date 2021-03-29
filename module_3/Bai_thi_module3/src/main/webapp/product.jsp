<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/4/21
  Time: 9:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        body {
            color: #404E67;
            background: #F5F7FA;
            font-family: 'Open Sans', sans-serif;
        }
        .table-wrapper {
            width: 700px;
            margin: 30px auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 1px 1px rgba(0,0,0,.05);
        }
        .table-title {
            padding-bottom: 10px;
            margin: 0 0 10px;
        }
        .table-title h2 {
            margin: 6px 0 0;
            font-size: 22px;
        }
        .table-title .add-new {
            float: right;
            height: 30px;
            font-weight: bold;
            font-size: 12px;
            text-shadow: none;
            min-width: 100px;
            border-radius: 50px;
            line-height: 13px;
        }
        .table-title .add-new i {
            margin-right: 4px;
        }
        table.table {
            table-layout: fixed;
        }
        table.table tr th, table.table tr td {
            border-color: #e9e9e9;
        }
        table.table th i {
            font-size: 13px;
            margin: 0 5px;
            cursor: pointer;
        }
        table.table th:last-child {
            width: 100px;
        }
        table.table td a {
            cursor: pointer;
            display: inline-block;
            margin: 0 5px;
            min-width: 24px;
        }
        table.table td a.add {
            color: #27C46B;
        }
        table.table td a.edit {
            color: #FFC107;
        }
        table.table td a.delete {
            color: #E34724;
        }
        table.table td i {
            font-size: 19px;
        }
        table.table td a.add i {
            font-size: 24px;
            margin-right: -1px;
            position: relative;
            top: 3px;
        }
        table.table .form-control {
            height: 32px;
            line-height: 32px;
            box-shadow: none;
            border-radius: 2px;
        }
        table.table .form-control.error {
            border-color: #f50000;
        }
        table.table td .add {
            display: none;
        }
    </style>
    <title>Product Manager</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
    <h2>Danh sách sản phẩm</h2>
    <div class="row container-fluid" >



        <%--    <div class="col-lg-3">--%>
        <%--        <ul style="list-style-type: none ">--%>
        <%--            <li>1</li>--%>
        <%--            <li>2</li>--%>
        <%--            <li>3</li>--%>
        <%--        </ul>--%>
        <%--    </div>--%>
        <%--    <div class="row">--%>
        <div class="col-sm-11">
            <a href="${pageContext.request.contextPath}/product?actionUser=create" style="float: right"><button type="button" class="btn btn-info add-new" ><i class="fa fa-plus" ></i> Add New Product</button></a>
        </div>
<%--        <div>--%>
<%--            <p>Danh </p>--%>
<%--        </div>--%>
        <div>
            <div class="col-lg-12">
                <table class="table table-striped">
                    <thead>
                    <tr class="table-danger">
                        <th>STT</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Discount</th>
                        <th>Stock</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="product" items="${productList}">
                        <tr class="table-warning">
                            <td><c:out value="${product.product_id}"/></td>
                            <td><c:out value="${product.product_name}"/></td>
                            <td><c:out value="${product.product_price}"/></td>
                            <td><c:out value="${product.product_discount}"/></td>
                            <td><c:out value="${product.product_stock}"/></td>
<%--                            <td>--%>
<%--                                <a href="/customer?actionUser=update&id=${customer.customer_id}"><i class="material-icons">&#xE254;</i></a>--%>
<%--                                <a onclick="setValue('${customer.customer_id}')" data-toggle="modal" data-target="#exampleModal" ><i class="material-icons">&#xE872;</i></a>--%>
<%--                            </td>--%>
                        </tr>
                    </c:forEach>
                    </tbody>
        </div>
    </div>


<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>
