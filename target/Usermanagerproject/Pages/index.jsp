<%@ page import="Models.User" %>
<%@ page import="DAO.UserDAO" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>User manager tool</title>
    <script src="https://kit.fontawesome.com/6632fe96c8.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<div id="header">
<p class="list-header-container">User Manager tool</p>

   <div class="page-list">
       <a class="link-to-page" href="/adduser">
           <i class="fa-solid fa-user-plus"></i>
           Add user
       </a>

       <a class="link-to-page" href="/userlist">
           <i class="fa-solid fa-table-list"></i>
           Go to users list
       </a>

   </div>


</div>
</body>
</html>
