<?php
    require_once("./controller/Controller01.php");
    require_once("./view/View01.php");

    $mainView = new View01();
    $mainController = new Controller01($mainView);


    $mainController->index();

?>