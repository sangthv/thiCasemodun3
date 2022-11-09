<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div align="center">
    <h2> Add new Student</h2>
    <form action="/create" method="post">
        <table>

            <tr>
                <td>Name</td>
                <td><input type="text" name="name"  class="form-control" placeholder="nhập tên"></td>

            </tr>
            <tr>
                <td> Email Adress</td>
                <td><input type="text" name="email"  class="form-control" placeholder="nhập email">
                </td>

            </tr>
            <tr>
                <td> Date Of Birth</td>
                <td><input type="text" name="birth"  class="form-control"
                           placeholder="nhập DD/MM/YYYY"></td>

            </tr>
            <tr>
                <td> Adress</td>
                <td><input type="text" name="adress"  class="form-control" placeholder="nhập địa chỉ"></td>
            </tr>

            <tr>
                <td>Phone Number</td>
                <td><input type="text" name="phone"  class="form-control" placeholder="Enter phone Number"></td>
            </tr>
            <tr>
                <td> Class</td>
                <td><input type="text" name="class"  class="form-control" placeholder="Open this select menu"></td>
            </tr>
        </table>
        <tr></tr>
        <button type="submit" class="btn btn-danger">Submit</button>

    </form>
</div>

</body>
</html>
