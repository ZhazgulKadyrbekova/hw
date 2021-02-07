<?php
	class Controller01{
		private $view;
		private $page;
    private $model;
    private $authorized;
		
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
          if ($_SESSION['authenticated'] === FALSE) {
            $message = "You have to be authorized to change info";
            //$this->view->printMessage($message);
            $this->view->loginForm();
          } 
          $this->view->addNewCustomerForm();
          break;

        case "addNewCustomer" :
          if (isset($_POST['name'])) {
            $newName = $_POST['name'];

            if (isset($_POST['age'])) {
              $newAge = $_POST['age'];

              if (isset($_POST['gender'])) {
                $newGender = $_POST['gender'];

                if (isset($_POST['password'])) {
                  $newPassword = $_POST['password'];

                  $customer = new Customer(null, $newName, $newAge, $newGender, $newPassword);

                  $message = $this->model->dbConnect();
                  if ($message == "Connected successfully") {
                    $this->view->printMessage($this->model->addNewCustomer($customer));

                  } else {
                    $this->view->printMessage($message);
                  }	
                } else {
                  $message = "Enter password";
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

        case "updateCustomerData" :
          if ($_SESSION['authenticated'] === FALSE) {
            $message = "You have to be authorized to change info";
            //$this->view->printMessage($message);
            $this->view->loginForm();
          }
          if (isset($_POST['id'])) {
            $newId = $_POST['id']; 
  
            $message = $this->model->dbConnect();
            if ($message == "Connected successfully") {
              $customer = $this->model->getCustomerById($newId);
              if ($customer instanceof Customer) {
                $this->view->updateCustomerDataForm($customer);
              } else {
                $this->view->printMessage($customer);
              }
            } else {
              $this->view->printMessage($message);
            }	
          } else {
            $message = "No customer id detected";
            $this->view->printMessage($message);
          }
          break;
  
        case "updateCustomerInfo" :
            if (isset($_POST['name'])) {
              $newName = $_POST['name'];
  
              if (isset($_POST['age'])) {
                $newAge = $_POST['age'];
  
                if (isset($_POST['gender'])) {
                  $newGender = $_POST['gender'];
  
                  if (isset($_POST['id'])) {
                    $newId = $_POST['id'];
                  
                    if (isset($_POST['password'])) {
                      $newPassword = $_POST['password'];

                      $customer = new Customer($newId, $newName, $newAge, $newGender, $newPassword);
                      $message = $this->model->dbConnect();
                      if ($message == "Connected successfully") {
                        $this->view->printMessage($this->model->updateCustomerInfo($customer));
                      } else {
                        $this->view->printMessage($message);
                      }
                    } else {
                      $message = "Set customer password";
                      $this->view->printMessage($message);
                    }
                  }	else {
                    $message = "No customer id detected";
                    $this->view->printMessage($message);
                  }
                } else {
                  $message = "Enter gender";
                  $this->view->printMessage($message);
                }
              } else {
                $message = "Enter age";
                $this->view->printMessage($message);
              }
            } else {
              $message = "Enter name";
              $this->view->printMessage($message);
            }
            break;

        case "deleteCustomer" :
          if ($_SESSION['authenticated'] === FALSE) {
            $message = "You have to be authorized to change info";
            //$this->view->printMessage($message);
            $this->view->loginForm();
          }
            if (isset($_POST['id'])) {
              $newId = $_POST['id'];

              $message = $this->model->dbConnect();
              if ($message == "Connected successfully") {
                $this->view->printMessage($this->model->deleteCustomer($newId));

              } else {
                $this->view->printMessage($message);
              }	
          
            } else {
              $message = "No customer id detected";
              $this->view->printMessage($message);
            }
            break;
          
        
        case "loginForm" :
          if (!isset($_SESSION['authenticated']) || $_SESSION['authenticated'] === FALSE) {
            $this->view->loginForm();
          } else {
            $this->view->logoutForm();
          }
          break;
        case "login" :
          if ($_SESSION['authenticated'] == true) {
            $this->view->logoutForm();
          } else {
              $error = null;
              if (!empty($_POST)) {
                  $username = empty($_POST['name']) ? null : $_POST['name'];
                  $password = empty($_POST['password']) ? null : $_POST['password'];
                  $message = $this->model->dbConnect();
                  if ($message == "Connected successfully") {
                    $message = $this->model->getPasswordByName($username, $password);
                  } else {
                    $this->view->printMessage($message);
                  }	
                  

                  if ($message == "Statement prepare error" || substr($message, 0, 5) == "Error") {
                    $this->view->printMessage($message);
                  }
                 
                  if (md5($password) == $message) {
                      $_SESSION['authenticated'] = true;
                      $_SESSION['name'] = $username;
                      $this->view->logoutForm();
                  } else {
                      $this->view->incorrect();
                  }
              }
              $this->view->loginForm();
            
          }

          break;
        case "incorrect" :
          $this->view->incorrect();
          break;
        case "logout" :
          session_destroy();
          $this->view->logout();
          break;
        default :
          $this->view->homePage();
          
      }
			
		}
	}
?>