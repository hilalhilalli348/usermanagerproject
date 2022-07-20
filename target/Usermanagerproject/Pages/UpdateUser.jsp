<%@ page import="DAO.UserDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="Models.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
    <script src="https://kit.fontawesome.com/6632fe96c8.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../CSS/style.css">
</head>
<body>

<% User u = (User) request.getAttribute("user"); %>

<div class="go-back">
    <a href="/userlist"><i class="fa-solid fa-circle-arrow-left">    </i></a>
</div>


<p class="list-header-container">Update User</p>

<form action="updateuser?id=<%=u.getId()%>" method="post">


    <table class="add-user-table">
        <tr>
            <td><label for="name">Name  </label></td>
            <td><input id="name" name="name" value="<%=u.getName()%>" type="text"></td>
        </tr>

        <tr>
            <td><label for="surname">Surname  </label></td>
            <td><input id="surname" name="surname" value="<%=u.getSurName()%>" type="text"></td>
        </tr>

        <tr >
            <td class="submit-td" colspan="2">
                <button type="submit">
                    <i class="fa-solid fa-gear"></i>
                    Update
                </button>
            </td>


        </tr>
    </table>

</form>
</body>
</html>
