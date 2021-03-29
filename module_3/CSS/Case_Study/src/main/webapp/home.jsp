
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
    <title>Home Pages</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <style>
        body, html {
            height: 100%;
            font-family: Arial, Helvetica, sans-serif;
        }
        * {
            box-sizing: border-box;
        }
        .div1{
            float: left;
        }
        .div2{
            float: right;
        }
        .bg{
        background-image: url("/img/furama_resort_da_nang_1.jpg");

        min-height: 450px;

        /* Center and scale the image nicely */
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
        position: relative;
        }

        /* Add styles to the form container */
        .container {
            position: absolute;
            right: 40%;
            margin: 20px;
            max-width: 300px;
            padding: 16px;
            background-color: white;
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Set a style for the submit button */
        .btn {
            background-color: #4CAF50;
            color: white;
            padding: 16px 20px;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .btn:hover {
            opacity: 1;
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
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Employee <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="customer">Customer</a>
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
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Search</button>
        </form>
    </div>
</nav>
</div>
<div class="row"></div>
<div class="bg">
    <form action="/action_page.php" class="container">
        <%--@declare id="psw"--%><%--@declare id="email"--%><h1>Login</h1>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>

        <button type="submit" class="btn">Login</button>
    </form>
</div>
<%--<div class="row container-fluid">--%>
<%--    <div class="col-lg-3">--%>
<%--        <ul style="list-style-type: none ">--%>
<%--            <li>1</li>--%>
<%--            <li>2</li>--%>
<%--            <li>3</li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--    <div class="col-lg-9">--%>
<%--        <h2 align="center">--%>
<%--            <a href="/customer?actionUser=create">Add New Customer</a>--%>
<%--        </h2>--%>
<%--        <div align="center">--%>
<%--            <table border="1" cellpadding="5">--%>
<%--&lt;%&ndash;                <caption><h2>List of Customer</h2></caption>&ndash;%&gt;--%>
<%--                <tr>--%>
<%--                    <th>ID</th>--%>
<%--                    <th>Name</th>--%>
<%--                    <th>BirthDay</th>--%>
<%--                    <th>Gender</th>--%>
<%--                    <th>ID Card</th>--%>
<%--                    <th>Phone</th>--%>
<%--                    <th>Email</th>--%>
<%--                    <th>Address</th>--%>
<%--                    <th>Customer_type</th>--%>
<%--                    <th colspan="2">Action</th>--%>
<%--                </tr>--%>
<%--                <c:forEach var="customer" items="${customerListFromServlet}">--%>
<%--                    <tr>--%>
<%--                        <td><c:out value="${customer.customer_id}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_name}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_birthday}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_gender}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_id_card}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_phone}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_email}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_address}"/></td>--%>
<%--                        <td><c:out value="${customer.customer_type}"/></td>--%>
<%--                        <td>--%>
<%--                            <a href="/customer?actionUser=update&id=${customer.customer_id}">Edit</a>--%>
<%--                            <a onclick="setValue('${customer.customer_id}')" data-toggle="modal" data-target="#exampleModal" >Delete</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--            </table>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--&lt;%&ndash;<button type="button" class="btn btn-primary">&ndash;%&gt;--%>
<%--&lt;%&ndash;    Launch demo modal&ndash;%&gt;--%>
<%--&lt;%&ndash;</button>&ndash;%&gt;--%>
<%--<!-- Modal -->--%>
<%--<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">&times;</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                Are you sure DELETE this ??????--%>
<%--            </div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                <button type="button" class="btn btn-primary" onclick="submitForm()" >Delete</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<form action="/customer?actionUser=delete" method="post" id="formDelete">--%>
<%--    <input type="hidden" id="input" name="delete_modal">--%>
<%--</form>--%>
<%--<script>--%>
<%--    function setValue(id) {--%>
<%--        document.getElementById("input").value = id;--%>
<%--    }--%>
<%--    function submitForm() {--%>
<%--        document.getElementById("formDelete").submit();--%>
<%--    }--%>
<%--</script>--%>
<%--<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>--%>

</body>

</html>
