<?php
    class View01{
        private $content;

        function home() {
            $this->content = "Welcome!<br>Register below to participate in Central Asia Informational Conference";
            $this->getTemplate();
        }

        function registration() {
            $this->content = "Fill all fields below.";
            $this->getTemplate();
        }

        function final() {
            $this->content = "Congratulations!<br>We will wait you in Central Asia Informational Conference.";
            $this->getTemplate();
        }

        function getTemplate() {
            include('./view/main.php');
        }
    }
?>
