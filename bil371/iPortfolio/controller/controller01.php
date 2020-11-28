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
                case "showAllData" :
					$message = $this->model->dbConnect();
					if ($message == "Connected successfully") {
					  $dataList = $this->model->getAll();
					  if (is_array($dataList)) {
						$this->view->showAllData($dataList);
					  } else {
						$this->view->printMessage($message);  
					  }
					} else {
					  $this->view->printMessage($message);
					}	
					break;

				case "checkDBConnection" :
					$message = $this->model->dbConnect();
					$this->view->printMessage($message);
					break;

				case "addNewData" :
					if (isset($_POST['title'])) {
						$title = $_POST['title'];
			
						if (isset($_POST['distance'])) {
						$distance = $_POST['distance'];
			
						if (isset($_POST['difficultyLevel'])) {
							$difficultyLevel = $_POST['difficultyLevel'];
			
							if (isset($_POST['price'])) {
							$price = $_POST['price'];
			
							$route = new TrekkingRoutes(null, $title, $distance, $difficultyLevel, $price);
			
							$message = $this->model->dbConnect();
							if ($message == "Connected successfully") {
								$this->view->printMessage($this->model->addNewData($route));
			
							} else {
								$this->view->printMessage($message);
							}	
							} else {
							$message = "Enter price";
							$this->view->printMessage($message);
							}
						} else {
							$message = "Enter difficulty level";
							$this->view->printMessage($message);
						}
						} else {
						$message = "Enter distance";
						$this->view->printMessage($message);
						}
					} else {
						$message = "Enter title";
						$this->view->printMessage($message);
					}
					break;

				case "updateData" :
					if (isset($_POST['id'])) {
						$newId = $_POST['id']; 
			
						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
						$data = $this->model->getById($newId);
						if ($data instanceof TrekkingRoutes) {
							$this->view->updateDataForm($data);
						} else {
							$this->view->printMessage($data);
						}
						} else {
						$this->view->printMessage($message);
						}	
					} else {
						$message = "No id detected";
						$this->view->printMessage($message);
					}
					break;
			
				case "updateInfo" :
					if (isset($_POST['id'])) {
						$id = $_POST['id'];

						if (isset($_POST['title'])) {
							$title = $_POST['title'];
				
							if (isset($_POST['distance'])) {
							$distance = $_POST['distance'];
				
								if (isset($_POST['difficultyLevel'])) {
									$difficultyLevel = $_POST['difficultyLevel'];
					
									if (isset($_POST['price'])) {
										$price = $_POST['price'];
				
										$route = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
										$message = $this->model->dbConnect();
										if ($message == "Connected successfully") {
											$this->view->printMessage($this->model->updateInfo($route));
										} else {
										$this->view->printMessage($message);
										}
									} else {
										$message = "Set price";
										$this->view->printMessage($message);
									}
								}	else {
									$message = "Set difficulty level";
									$this->view->printMessage($message);
								}
							} else {
								$message = "Set distance";
								$this->view->printMessage($message);
							}
						} else {
							$message = "Set title";
							$this->view->printMessage($message);
						}
					} else {
						$message = "No customer id detected";
						$this->view->printMessage($message);
					}
					break;
		
				case "deleteData" :	
					if (isset($_POST['id'])) {
						$newId = $_POST['id'];
			
						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
							$this->view->printMessage($this->model->deleteData($newId));
			
						} else {
							$this->view->printMessage($message);
						}	
					
					} else {
						$message = "No customer id detected";
						$this->view->printMessage($message);
					}
					break;
				
				case "searchTitle" :	

					$this->view->searchTitle();
					
					break;
				
				case "searchTitleInfo" :
					if (isset($_POST['title'])) {
						$title = $_POST['title'];

						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
							$this->view->printRoute($this->model->searchTitle($title));
						} else {
							$this->view->printMessage($message);
						}
					} else {
						$message = "Set title";
						$this->view->printMessage($message);
					}
					break;	

				case "searchDistance" :	

					$this->view->searchDistance();


					
					break;

				case "searchDistanceInfo" :
					if (isset($_POST['distance'])) {
						$distance = $_POST['distance'];

						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
							$this->view->printRoute($this->model->searchDistance($distance));
						} else {
							$this->view->printMessage($message);
						}
					} else {
						$message = "Set distance";
						$this->view->printMessage($message);
					}
					break;	

				case "searchDifficultyLevel" :	

					$this->view->searchDifficultyLevel();
					break;

				case "searchdifficultyLevelInfo" :
					if (isset($_POST['difficultyLevel'])) {
						$difficultyLevel = $_POST['difficultyLevel'];

						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
							$this->view->printRoute($this->model->searchDifficultyLevel($difficultyLevel));
						} else {
							$this->view->printMessage($message);
						}
					} else {
						$message = "Set Difficulty Level";
						$this->view->printMessage($message);
					}
					break;	
					

				case "searchPrice" :	

					$this->view->searchPrice();
					break;
				case "searchPriceInfo" :
					if (isset($_POST['price'])) {
						$price = $_POST['price'];

						$message = $this->model->dbConnect();
						if ($message == "Connected successfully") {
							$this->view->printRoute($this->model->searchPrice($price));
						} else {
							$this->view->printMessage($message);
						}
					} else {
						$message = "Set price";
						$this->view->printMessage($message);
					}
					break;	
						
					
				default :
					$this->view->homePage();
                
            }
			
		}
	}
?>
