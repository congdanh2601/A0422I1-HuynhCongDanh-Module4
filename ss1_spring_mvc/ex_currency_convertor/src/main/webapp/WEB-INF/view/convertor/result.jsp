<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/11/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.2/css/bootstrap.min.css">
    <style>
        td, form, h2, button, fieldset {
            padding: 5px;
            margin-left: 10px;
        }
    </style>
</head>
<body>
<fieldset>
    <legend>CURRENCY CONVERTOR</legend>
    <form>
        <table>
            <tr>
                <td>USD:</td>
                <td><input required class="form-control" type="number" name="usd" value="${usd}"></td>
            </tr>
            <tr>
                <td>VNĐ:</td>
                <td><input readonly class="form-control" type="number" name="vnd" value="${vnd}"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">Rate: 1 USD = 23000 VNĐ</td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <button type="submit" class="btn btn-success">Convert</button>
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
