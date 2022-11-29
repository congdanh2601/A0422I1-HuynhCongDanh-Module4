<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/11/2022
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Calculator</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <style>
    td, form, h2, button {
      padding: 5px;
      margin-left: 10px;
    }
  </style>
</head>
<body>
<center>
  <form action="/calculator/result" method="get">
    <h2>Calculator</h2>
    <div class="mb-3">
      <input type="number" name="firstOperand" class="form-control" placeholder="1st operand" style="width: 300px">
      <input type="number" name="secondOperand" class="form-control" placeholder="2st operand" style="width: 300px">
    </div>
    <div>
      <button type="submit" name="calculate" class="btn btn-outline-primary" value="+">Addition(+)</button>
      <button type="submit" name="calculate" class="btn btn-outline-secondary" value="-">Subtraction(-)</button>
      <button type="submit" name="calculate" class="btn btn-outline-success" value="*">Multiplication(x)</button>
      <button type="submit" name="calculate" class="btn btn-outline-warning" value="/">Division(/)</button>
    </div>
  </form>
</center>
</body>
</html>
