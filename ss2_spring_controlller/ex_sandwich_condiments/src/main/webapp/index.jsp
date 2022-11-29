<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/11/2022
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Sandwich Condiments</title>
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
  <form action="/condiment/result" method="get">
    <h2>Sandwich Condiments</h2>
    <div class="form-check form-check-inline">
      <input name="condiment" class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Lettuce">
      <label class="form-check-label" for="inlineCheckbox1">Lettuce</label>
    </div>
    <div class="form-check form-check-inline">
      <input name="condiment" class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Tomato">
      <label class="form-check-label" for="inlineCheckbox2">Tomato</label>
    </div>
    <div class="form-check form-check-inline">
      <input name="condiment" class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Mustard">
      <label class="form-check-label" for="inlineCheckbox3">Mustard</label>
    </div>
    <div class="form-check form-check-inline">
      <input name="condiment" class="form-check-input" type="checkbox" id="inlineCheckbox4" value="Sprouts">
      <label class="form-check-label" for="inlineCheckbox4">Sprouts</label>
    </div>
    <button type="submit" class="btn btn-outline-success">Save</button>
  </form>
</center>
</body>
</html>
