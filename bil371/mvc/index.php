<?php
session_start();
if (!isset($_SESSION['authenticated'])) {
    $_SESSION['authenticated'] = false;
    $_SESSION['name'] = null;
 } 
	require_once ("./controller/controller01.php");
    require_once ("./view/view01.php");
    require_once ("./model/model01.php");
    require_once ("./model/conf.php");
    require_once ("./entity/customer.php");
	
    $mainView = new View01();
    $model = new Model01($servername, $username, $password, $dbName);
	$mainController = new Controller01($mainView, $model);
	
	$mainController->index();
?>
