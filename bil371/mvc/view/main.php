<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>MVC Main Page</title>
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
        
            <section>
            <p><br>
                <?php
                    echo $this->content;
                ?>
            </p><br>
        </section>

        <!--p><a href="./view/registration.php">Apply to Conference</a></p-->

        <div class="pass-test pass-test__content">
            <p class="button pass-test__button button--primary"><a href="./view/registration.php">Apply to Conference</a></p>
        </div>

        
    </body>
</html>