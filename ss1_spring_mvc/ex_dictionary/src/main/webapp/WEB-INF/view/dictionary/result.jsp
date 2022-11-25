<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/11/2022
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
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
    <form>
        <table>
            <tr>
                <td colspan="2" style="text-align: center"><h3>TỪ ĐIỂN</h3></td>
            </tr>
            <tr>
                <td>Nhập từ tiếng Anh:</td>
                <td><input required class="form-control" type="text" name="eng" value="${eng}"></td>
            </tr>
            <tr>
                <td colspan="2"><h4>${eng} nghĩa là: ${vie}</h4></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <button type="submit" class="btn btn-success">Translate</button>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
