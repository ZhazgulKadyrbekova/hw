<?php
	class Model01{
		private $servername;
		private $username;
		private $password;
		private $database;
		private $conn;
		
		function __construct($newServerName, $newUserName, $newPassword, $newDatabase){
			$this->servername = $newServerName;
			$this->username = $newUserName;
			$this->password = $newPassword;
			$this->database = $newDatabase;
		}

		function dbConnect(){
			$this->conn = new mysqli($this->servername, $this->username, $this->password, $this->database);

			// Check connection
			if ($this->conn->connect_error) {
				$message = "Connection failed: " . $conn->connect_error;
			}
			else{
				$message = "Connection successful!";
			}
			return $message;
		}
		
		function getAllCustomers(){
			$stmt = $this->conn->stmt_init();
			
			if ($stmt -> prepare("SELECT * FROM `customer`")) {

			  $stmt -> execute();
			  
			  $stmt->store_result();

			  $stmt -> bind_result($id, $name, $age, $gender);

				$customersList = array();
				if ($stmt ->num_rows > 0) {
				  // output data of each row
				  while($stmt -> fetch()) {
					  $customersList[] = new Customer($id, $name, $age, $gender);
				  }
				  
				  $stmt -> close();
				  $this->conn->close();
				  return $customersList;
				} else {
					//var_dump($this->conn);
					
					$stmt -> close();
					$this->conn->close();
					$message = "No data found";
					return $message;
				}
			}
			else{
				$message = "Statement prepare error";
				return $message;
			}
		}
		
		function addNewCustomer($customer){
			
			$stmt = $this->conn->stmt_init();
			
			$sql = "INSERT INTO `customer` (`id`, `name`, `age`, `gender`) 
					VALUES (NULL,?,?,?);";
					
			if ($stmt -> prepare($sql)) {
				
				$name = htmlspecialchars($customer->getName());
				$age = htmlspecialchars($customer->getAge());
				$gender = htmlspecialchars($customer->getGender());
				
				$stmt -> bind_param("sds", $name, $age, $gender);

				$stmt -> execute();
				
				if ($stmt->affected_rows>0) {
					$message = "New record created successfully";
				} else {
					$message = "Error: " . $sql . "<br>" . $this->conn->error;
				}

			}else{
				$message = "Statement prepare error";
			}

			$this->conn->close();
			return $message;
			
		}
	}
?>