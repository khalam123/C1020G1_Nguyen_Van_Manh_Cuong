<%--
  Created by IntelliJ IDEA.
  User: Ryan
  Date: 2/23/21
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <p>Choose one or more condiment</p>
  <form action="/save" method="get">
    <table>
      <tr>
        <td>
          <label>Lettuce</label><br>
          <input type="checkbox" name="condiment" value="Lettuce">
        </td>
        <td>
          <label>Tomato</label><br>
          <input type="checkbox" name="condiment" value="Tomato">
        </td>
        <td>
          <label>Mustard</label><br>
          <input type="checkbox" name="condiment" value="Mustard">
        </td>
        <td>
          <label>Sprouts</label><br>
          <input type="checkbox" name="condiment" value="Sprouts">
        </td>
      </tr>
    </table>
    <input type="submit" value="save">
  </form>


  </body>
</html>
