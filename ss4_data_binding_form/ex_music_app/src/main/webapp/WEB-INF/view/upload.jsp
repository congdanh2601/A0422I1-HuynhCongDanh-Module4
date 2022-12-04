<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04/12/2022
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Upload a song</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <style>
        td, form, h2, button {
            padding: 5px;
            margin-left: 10px;
        }
    </style>
</head>
<body>
<h2>UPLOAD A SONG</h2>
<form:form action="upload" method="post" modelAttribute="song">
    <table>
        <tr>
            <td>Song name:</td>
            <td><input class="form-control" type="text" name="name" value="${song.name}"></td>
        </tr>
        <tr>
            <td>Singer:</td>
            <td><input class="form-control" type="text" name="singer">${song.singer}</td>
        </tr>
        <tr>
            <td>Genre:</td>
            <td><input class="form-control" type="text" name="genre">${song.genre}</td>
        </tr>
        <tr>
            <td>Path to file:</td>
            <td><input class="form-control" type="text" name="path">${song.path}</td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" class="btn btn-success" style="margin-top: 15px">Upload</button>
                <button type="button" class="btn btn-success" style="margin-top: 15px"><a style="text-decoration: none; color: white" href="list">Cancel</a></button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
