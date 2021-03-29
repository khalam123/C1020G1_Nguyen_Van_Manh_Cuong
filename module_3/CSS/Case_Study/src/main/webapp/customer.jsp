
<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 1/29/21
  Time: 2:15 PM
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
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <style>
        .bg{
            background-image: url("/img/furama_resort_da_nang_1.jpg");
            height: 100%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            /*filter: blur(8px);*/
            /*-webkit-filter: blur(8px);*/
        }
        .div1{
            float: left;
        }
        .div2{
            float: right;
        }
        .bg-text {
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
            color: white;
            font-weight: bold;
            border: 3px solid #f1f1f1;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            z-index: 2;
            width: 80%;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>

<div class="row container-fluid">

    <div class="col-lg-4 div1" ><span><img src="${pageContext.request.contextPath}/img/furama_icon.png" alt=""></span></div>
    <div class="col-lg-4"><h2 align="center">Furama</h2></div>
    <div class="col-lg-4 "><span class="div2">Nguyễn Văn Mạnh Cường</span></div>

</div>
<div class="row-cols-1">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/home">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Employee <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/customer">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0" action="/customer">
                <input type="hidden" name="actionUser" value="search">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="id" value="${id}">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>
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
            <a href="/customer?actionUser=create" style="float: right"><button type="button" class="btn btn-info add-new" ><i class="fa fa-plus" ></i> Add New Customer</button></a>

        <%--            <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button>--%>
        </div>
<%--    </div>--%>
    <div class="row"></div>
    <div class="col-lg-12">
<%--        <div align="center">--%>
            <table class="table table-striped">

                <thead>
                <%--                <caption><h2>List of Customer</h2></caption>--%>
                <tr class="table-danger">
                    <th>ID</th>
                    <th>Name</th>
                    <th>BirthDay</th>
<%--                    <th>Gender</th>--%>
<%--                    <th>ID Card</th>--%>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Customer_type</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customerListFromServlet}">
                    <tr class="table-warning">
                        <td><c:out value="${customer.customer_id}"/></td>
                        <td><c:out value="${customer.customer_name}"/></td>
                        <td><c:out value="${customer.customer_birthday}"/></td>
<%--                        <td><c:out value="${customer.customer_gender}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_id_card}"/></td>--%>
                        <td><c:out value="${customer.customer_phone}"/></td>
                        <td><c:out value="${customer.customer_email}"/></td>
                        <td><c:out value="${customer.customer_address}"/></td>
                        <td><c:out value="${customer.customer_type}"/></td>
                        <td>
                            <a href="/customer?actionUser=update&id=${customer.customer_id}"><i class="material-icons">&#xE254;</i></a>
                            <a onclick="setValue('${customer.customer_id}')" data-toggle="modal" data-target="#exampleModal" ><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

    </div>

</div>

<%--<button type="button" class="btn btn-primary">--%>
<%--    Launch demo modal--%>
<%--</button>--%>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure DELETE this ??????
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="submitForm()" >Delete</button>
            </div>
        </div>
    </div>
</div>
<form action="/customer?actionUser=delete" method="post" id="formDelete">
    <input type="hidden" id="input" name="delete_modal">
</form>
<script>
    function setValue(id) {
        document.getElementById("input").value = id;
    }
    function submitForm() {
        document.getElementById("formDelete").submit();
    }
</script>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>

</html>
