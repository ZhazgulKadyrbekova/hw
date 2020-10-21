<?php
session_start();
?>
<!DOCTYPE html>
<html>
<body>
<h4>Your information is written below</h4>
<?php
echo "Your name is <strong>" . $_SESSION["name"] . "</strong>.<br>";
echo "Your gender is <strong>" . $_SESSION["gender"] . "</strong>.<br>";
echo "Your field is <strong>";
foreach($_SESSION['field'] as $item){
    echo $item;
    echo " ";
}

echo "</strong>.<br>";
echo "Your email is <strong>" . $_SESSION["email"] . "</strong>.<br>";
echo "Your age is <strong>" . $_SESSION["age"] . "</strong>.<br>";
echo "Your birthdate is <strong>" . $_SESSION["birthdate"] . "</strong>.<br>";


?>

</body>
</html>