
<html>
<head>
    <title>Hello world</title>
    <script src="https://kit.fontawesome.com/6632fe96c8.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../CSS/style.css">
</head>
<body>
<div class="go-back">
        <a href="/"><i class="fa-solid fa-circle-arrow-left">    </i></a>
</div>

<p class="list-header-container">Add User</p>
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

        <tr >
            <td class="submit-td" colspan="2">
                <button type="submit">
                    <i class="fa-solid fa-plus"></i>
                    Add User
                </button>
            </td>
        </tr>
    </table>
</form>




</body>
</html>
