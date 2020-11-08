<?php
	class Controller01{
		private $view;
		private $page;
		private $model;
		
		function __construct($newView, $model){
			$this->view = $newView;
			$this->model = $model;
			if(isset($_GET["page"])){
				$this->page = $_GET["page"];
			}
			else{
				$this->page = "homepage";
			}
		}
		
		function index(){
      
      switch ($this->page) {

        case "checkDBConnection" :
          $message = $this->model->dbConnect();
          $this->view->printMessage($message);
          break;

        case "getAllCustomers" :
          $message = $this->model->dbConnect();
          if ($message == "Connected successfully") {
            $allCustomersList = $this->model->getAllCustomers();
            if (is_array($allCustomersList)) {
              $this->view->showAllCustomers($allCustomersList);
            } else {
              $this->view->printMessage($message);  
            }
          } else {
            $this->view->printMessage($message);
          }	
          break;
          
        case "addNewCustomerForm" :
          $this->view->addNewCustomerForm();
          break;

        case "addNewCustomer" :
          if (isset($_POST['name'])) {
            $newName = $_POST['name'];

            if (isset($_POST['age'])) {
              $newAge = $_POST['age'];

              if (isset($_POST['gender'])) {
                $newGender = $_POST['gender'];

                $customer = new Customer(null, $newName, $newAge, $newGender);

                $message = $this->model->dbConnect();
                if ($message == "Connected successfully") {
                  $this->view->printMessage($this->model->addNewCustomer($customer));

                } else {
                  $this->view->printMessage($message);
                }	
              } else {
                $message = "Enter your gender";
                $this->view->printMessage($message);
              }
            } else {
              $message = "Enter your age";
              $this->view->printMessage($message);
            }
          } else {
            $message = "Enter your name";
            $this->view->printMessage($message);
          }
          break;
  
        case "updateCustomerDataForm" :
          $message = $this->model->dbConnect();
          if ($message == "Connected successfully") {
            $allCustomersList = $this->model->getAllCustomers();
            if (is_array($allCustomersList)) {
              $this->view->updateCustomerDataForm($allCustomersList);
            } else {
              $this->view->printMessage($message);  
            }
          } else {
            $this->view->printMessage($message);
          }	
          break;

        case "updateCustomerData" :
          if (isset($_POST['id'])) {
            $newId = $_POST['id'];

            if (isset($_POST['name'])) {
              $newName = $_POST['name'];
  
              if (isset($_POST['age'])) {
                $newAge = $_POST['age'];
  
                if (isset($_POST['gender'])) {
                  $newGender = $_POST['gender'];
  
                  $customer = new Customer($newId, $newName, $newAge, $newGender);
  
                  $message = $this->model->dbConnect();
                  if ($message == "Connected successfully") {
                    $this->view->printMessage($this->model->updateCustomerData($customer));
  
                  } else {
                    $this->view->printMessage($message);
                  }	
                } else {
                  $message = "Enter your gender";
                  $this->view->printMessage($message);
                }
              } else {
                $message = "Enter your age";
                $this->view->printMessage($message);
              }
            } else {
              $message = "Enter your name";
              $this->view->printMessage($message);
            }
          } else {
            $message = "Enter id";
            $this->view->printMessage($message);
          }
          break;

          case "deleteCustomerForm" :
            $message = $this->model->dbConnect();
            if ($message == "Connected successfully") {
              $allCustomersList = $this->model->getAllCustomers();
              if (is_array($allCustomersList)) {
                $this->view->deleteCustomerForm($allCustomersList);
              } else {
                $this->view->printMessage($message);  
              }
            } else {
              $this->view->printMessage($message);
            }	
            break;
  
          case "deleteCustomer" :
            if (isset($_POST['id'])) {
              $newId = $_POST['id'];

              $message = $this->model->dbConnect();
              if ($message == "Connected successfully") {
                $this->view->printMessage($this->model->deleteCustomer($newId));

              } else {
                $this->view->printMessage($message);
              }	
          
            } else {
              $message = "Enter id";
              $this->view->printMessage($message);
            }
            break;
          
        default :
          $this->view->homePage();
          
      }
			
		}
	}
?>