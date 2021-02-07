<?php
	class Controller01{
		private $view;
		private $page;
		private $model;
		
		function __construct($newView, $newModel){
			$this->view = $newView;
			$this->model = $newModel;
			
			if(isset($_GET["page"])){
				$this->page = $_GET["page"];
			}
			else{
				$this->page = "homepage";
			}
		}
		
		function index(){
			
			switch ($this->page) {
				case "checkDBConnection":
					$message = $this->model->dbConnect();
					$this->view->printMessage($message);
					break;
				case "getAllCustomers":
					$message = $this->model->dbConnect();
					if ($message == "Connection successful!"){
						$allCustomersList = $this->model->getAllCustomers();
						if (is_array($allCustomersList)){
							$this->view->showAllCustomers($allCustomersList);
						}
						else{
							$this->view->printMessage($allCustomersList);
						}
					}
					else{
						$this->view->printMessage($message);
					}
					break;
				case "addNewCustomerForm":
					$this->view->addNewCustomerForm();
					break;
				case "addNewCustomer":
					if(isset($_POST['customerName'])){
						$newName = $_POST['customerName'];
						if(isset($_POST['customerAge'])){
							$newAge = $_POST['customerAge'];
							if(isset($_POST['customerGender'])){
								$newGender = $_POST['customerGender'];
								
								$customer = new Customer(0, $newName, $newAge, $newGender);
								
								$message = $this->model->dbConnect();
								if ($message == "Connection successful!"){
									$this->view->printMessage($this->model->addNewCustomer($customer));
								}
								else{
									$this->view->printMessage($message);
								}
								
							}else{
								$message = "You should enter customer's gender";
								$this->view->printMessage($message);
							}
						}else{
							$message = "You should enter customer's age";
							$this->view->printMessage($message);
						}
					}else{
						$message = "You should enter customer's name";
						$this->view->printMessage($message);
					}
					break;
				default: $this->view->homePage();
			}
		}
	}
?>