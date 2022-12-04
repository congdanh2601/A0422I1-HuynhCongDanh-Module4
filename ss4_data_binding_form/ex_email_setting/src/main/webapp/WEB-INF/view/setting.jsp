<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/11/2022
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
    <link rel="stylesheet" href="resources/bootstrap-5.2.2-dist/css/bootstrap.min.css">
    <script src="resources/bootstrap-5.2.2-dist/js/bootstrap.min.js"></script>
    <style>
        td, form, h2, button {
            padding: 5px;
            margin-left: 10px;
        }
    </style>
</head>
<body>
<h2>Settings</h2>
<form:form id="setting" action="setting" modelAttribute="setting">
    <table>
        <tr>
            <td><b>Languages: </b></td>
            <td><select name="language">
                <option value="English" ${setting.language == "English" ? 'selected':''}>English</option>
                <option value="Vietnamese" ${setting.language == "Vietnamese" ? 'selected':''}>Vietnamese</option>
                <option value="Japanese" ${setting.language == "Japanese" ? 'selected':''}>Japanese</option>
                <option value="Chinese" ${setting.language == "Chinese" ? 'selected':''}>Chinese</option>
            </select></td>
        </tr>
        <tr>
            <td><b>Page size: </b></td>
            <td>Show <select name="size">
                <option value="5" ${setting.size == "5" ? 'selected':''}>5</option>
                <option value="10" ${setting.size == "10" ? 'selected':''}>10</option>
                <option value="15" ${setting.size == "15" ? 'selected':''}>15</option>
                <option value="20" ${setting.size == "20" ? 'selected':''}>20</option>
                <option value="25" ${setting.size == "25" ? 'selected':''}>25</option>
                <option value="50" ${setting.size == "50" ? 'selected':''}>50</option>
                <option value="100" ${setting.size == "100" ? 'selected':''}>100</option>
            </select> emails per page</td>
        </tr>
        <tr>
            <td><b>Spams filter: </b></td>
            <td><span>
                <input type="checkbox" name="filter" ${setting.filter ? 'checked' : ''}>
                Enable spams filter
            </span></td>
        </tr>
        <tr>
            <td><b>Signature: </b></td>
            <td><textarea name="signature" form="setting">${setting.signature}</textarea></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" class="btn btn-success" style="margin-top: 15px">Update</button>
                <button type="reset" class="btn btn-outline-secondary" style="margin-top: 15px">Cancle</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
