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
        
            <!--section>
            <p><br>
                
            </p><br>
        </section-->
<h3>Registration form for Conference</h3>
<form action="final.php" method="post" id="info">
    Name: <br>
        <input type="text" name="name" value="John Doe"><br><br>

    Gender: <br>
        <input type="radio" name="gender" value="Female">Female
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Other">Other<br><br>

    Interested field: <br>
        <input type="checkbox" name="field[]" value="IT">IT
        <input type="checkbox" name="field[]" value="Media">Media
        <input type="checkbox" name="field[]" value="Communication">Communication
        <input type="checkbox" name="field[]" value="Art">Art<br><br>

    E-mail: <br>
        <input type="email" name="email" value="example@example.com"><br><br>

    Age: <br>
        <input type="number" name="age"><br><br>

    <label for="study">Studying field:</label>
    <select name="study" id="study" form="info">
        <option value="it">IT</option>
        <option value="media">Media</option>
        <option value="communication">Communication</option>
        <option value="art">Art</option>
    </select><br><br>

    Birthdate: <input type="date" name="birthdate" value="01.01.2020"><br><br>

    <input type="submit" value="SUBMIT">
</form>

</body>
</html>