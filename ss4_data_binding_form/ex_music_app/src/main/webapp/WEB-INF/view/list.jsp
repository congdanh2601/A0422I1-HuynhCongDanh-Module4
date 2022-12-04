<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04/12/2022
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>LIST OF SONGS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
<center>
    <h2>LIST OF SONGS</h2>
    <p style="color: red">${mess}</p>
    <div class="col-sm-2 right" style="padding: 5px; margin: 5px">
        <a href="upload" class="btn btn-primary" data-toggle="modal">Upload a song</a>
    </div>
    <table class="table table-stripped table-hover table-bordered border-primary">
        <tr>
            <th>Id</th>
            <th>Song name</th>
            <th>Singer</th>
            <th>Genre</th>
            <th>Path</th>
        </tr>
        <c:forEach var="song" items="${list}" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${song.name}</td>
                <td>${song.singer}</td>
                <td>${song.genre}</td>
                <td>${song.path}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
