
<%--
  Created by IntelliJ IDEA.
  User: sangpk
  Date: 31/10/2022
  Time: 8:59:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .container mt-3 {
            margin: 0 auto;
        }
        .table table-dark th td{
            text-align: center;
        }
        .table table-dark td{
            padding-bottom: 5px;
        }
    </style>
</head>
<body>
<div class="container mt-3">
    <h2>Danh Sách Sinh Viên</h2>

<%--    nút tìm kiếm----------------------------%>
    <form action="/search">
    <div class="input-group">
        <input type="search" name="search" class="form-control rounded" placeholder="Search" aria-label="Search" aria-describedby="search-addon" />
        <button type="submit" class="btn btn-outline-primary">Tìm Kiếm</button>
    </div>
    </form>
<%-------------------------------------------------------------------%>
    <a type="button" class="btn btn-warning" href="/createStudent.jsp">Add Students</a>
    <a type="button" class="btn btn-warning" href="/students">Back</a>
<%--    <a type="button" href="/createStudent.jsp"> create</a>--%>
    <table class="table table-dark">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Email</th>
            <th>Adress</th>
            <th>Action</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="st">
            <tr>
                <td>${st.id}</td>
                <td>${st.name}</td>
                <td>${st.birth}</td>
                <td>${st.email}</td>
                <td>${st.adress}</td>
                <td><a type="button" class="btn btn-danger" href="/edit?id=${st.id}">Edit</a></td>
                <td><a type="button" onclick="showMess(${st.id})" class="btn btn-success" href="#">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
<script>
    function showMess(id) {
        var option = confirm('Bạn có chắc chắn muốn xóa không ?');
        if (option === true) {
            window.location.href = "/delete?id=" + id;
        }
    }
</script>
</html>
