<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>MVC Registration Page</title>
        <link rel="stylesheet" href="./view/css/style.css">
    </head>
<body>
<header>Central Asia Informational Conference</header>
        
        <nav>
            <ul><a href = "">Home Page</a></ul>
            <ul><a href = "">Registration</a></ul>
            <ul><a href = "">Final</a></ul>
            <ul><a href = "">Contacts</a></ul>
        </nav>

<h4>Thank you for your registration</h4>
<h4>Your information is written below</h4>
<?php

    if (!empty($_POST["name"])) {
        echo "<br>Welcome ";
        echo $_POST["name"];
    }


    if (!empty($_POST["gender"])) {
        echo "<br>Your gender is ";
        echo $_POST["gender"];
    }


    if(!empty($_POST["field"])) {
        echo "<br>Your interested fields are ";
        foreach($_POST["field"] as $item){
            echo $item;
            echo " ";
        }
    }


    if(!empty($_POST["email"])) {
        echo "<br>Your email address is ";
        echo $_POST["email"];
    }

    if(!empty($_POST["age"])) {
        echo "<br>Your age is ";
        echo $_POST["age"];
    }


    if (!empty($_POST["study"])) {
        echo "<br>You are studying ";
        echo $_POST["study"];
    }


    if (!empty($_POST["birthdate"])) {
        echo "<br>Your birthdate is ";
        echo $_POST["birthdate"];
    }

?>
</body>
</html>
