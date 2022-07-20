
<html>
<head>
    <title>Hello world</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/6632fe96c8.js" crossorigin="anonymous"></script>
    <script src="../JavaScript/index.js"></script>
    <link rel="stylesheet" href="../CSS/style.css">
</head>
<body>
<div class="go-back">
        <a href="/"><i class="fa-solid fa-circle-arrow-left">    </i></a>
</div>

<p class="list-header-container">Add User</p>
<span id="is_correct"><%=request.getAttribute("is_correct")==null ? "":request.getAttribute("is_correct")%></span>
<form class="add-user-form" action="../aduser" method="post">

    <table class="add-user-table">
        <tr>
            <td><label for="name">Name  </label></td>
            <td><input   id="name" placeholder="Ehmed" name="name" type="text"></td>
        </tr>

        <tr>
            <td><label for="surname">Surname  </label></td>
            <td><input id="surname" placeholder="Elmirli" name="surname"   type="text"></td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td class="submit-td" colspan="2">
                <button id="btn_adduser" type="submit">
                    <i class="fa-solid fa-plus"></i>
                    Add User
                </button>
            </td>
        </tr>
    </table>
</form>




</body>
</html>
