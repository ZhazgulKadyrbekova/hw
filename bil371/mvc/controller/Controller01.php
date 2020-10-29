<?php

    class Controller01 {
        private $view;
        private $page;

        function __construct($newView)
        {
            $this -> view = $newView;
            if (isset($_GET["page"])) {
                $this -> page = $_GET["page"];
            } else {
                $this->page = "homepage";
            }
        }

        function index() {
            if ($this->page == "homepage") {
                $this->view->home();
            }
            if ($this->page == "registration") {
                $this->view->registration();
            }
            if ($this->page == "final") {
                $this->view->final();
            }
        }
    }

?>
