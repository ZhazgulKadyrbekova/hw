<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">
<body>

<h4>Thank you for your registration</h4>

<?php

$_SESSION["name"] = $_POST["name"];
$_SESSION["gender"] = $_POST["gender"];

$_SESSION['field'] = $_POST["field"];

$_SESSION["email"] = $_POST["email"];
$_SESSION["age"] = $_POST["age"];
$_SESSION["birthdate"] = $_POST["birthdate"];
echo "Session variables are set.<br>";
echo "<a href='third.php'> Click </a> to get to next page.";

echo "<br>";
?>
</body>
</html>
