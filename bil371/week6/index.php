<html>
<body>
<h3>Registration form for Conference</h3>
<form action="second.php" method="post">
    <label>Name:</label><br>
        <input type="text" name="name" style="width: 24em; height: 2em;" value="Enter your name here!"/><br><br>

    <label>Gender:</label> <br>
        <input type="radio" name="gender" value="Female">Female
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Other">Other<br><br>

    <label>Interested field:</label> <br>
        <input type="checkbox" name="field[]" value="IT">IT
        <input type="checkbox" name="field[]" value="Media">Media
        <input type="checkbox" name="field[]" value="Communication">Communication
        <input type="checkbox" name="field[]" value="Art">Art<br><br>

    <label>E-mail:</label> <br>
        <input type="email" name="email" style="width: 24em; height: 2em;" placeholder="Type Here" value="example@example.com"><br><br>

    <label>Age:</label> <br>
        <input type="number" name="age" style="width: 24em; height: 2em;" placeholder="type here" value="20"><br><br>

    <label>Birthdate:</label> <br>
        <input type="date" name="birthdate" value="01.01.2020"><br><br>

    <input type="submit" value="SUBMIT">
</form>

</body>
</html>