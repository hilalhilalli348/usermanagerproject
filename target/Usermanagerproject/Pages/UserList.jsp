<%@ page import="DAO.UserDAO" %>
<%@ page import="Models.User" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Hello world</title>
    <script src="https://kit.fontawesome.com/6632fe96c8.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../CSS/style.css">
</head>
<body>

<div class="go-back" style="margin-top: 40px !important;">
    <a href="/"><i class="fa-solid fa-circle-arrow-left"></i></a>
</div>

<div id="header">


    <p class="list-header-container">Users List</p>

        <%
    UserDAO userDAO = new UserDAO();
    List<User> users = userDAO.getAllUsers();
        %>

    <ul class="ul-user-list">

        <% for (User u : users) { %>

        <li class="list-item">

            <div class="left-side">
                <div class="user-field-container">ID : <%=u.getId() %>
                </div>
                <div class="user-field-container">Name : <%=u.getName() %>
                </div>
                <div class="user-field-container">Surname : <%=u.getSurName() %>
                </div>
            </div>

            <div class="right-side">

                <a href="../removeuser?id=<%=u.getId()%>"/><i class="fa-solid fa-trash-can white-button"></i></a>

                <a href="../getuser?id=<%=u.getId()%>"> <i class="fa-solid fa-pen-to-square white-button"></i></a>

            </div>

        </li>

        <% } %>


    </ul>


</body>
</html>
