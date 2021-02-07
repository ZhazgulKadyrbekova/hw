<?php
	class View01{
		private $content;
		
		function homePage(){
			$this->content = "This is home page!";
			$this->getTemplate();
		}
		
		function printMessage($message){
			$this->content = $message;
			$this->getTemplate();
		}
		
		function addNewCustomerForm(){
			$this->content = "<h1>Add new customer</h1>";
			$this->content=$this->content.
			"<form action='index.php?page=addNewCustomer' method='POST'> 
				<input type='text' name='customerName' value='Enter Customer name'>
				<input type='text' name='customerAge' value='Enter Customer age'>
				<select name='customerGender'>
					<option value='m'>Male</option>
					<option value='f'> Female</option>
				</select>
				<input type='submit' value='Add'>
			</form>";
			$this->getTemplate();
		}
		
		function showAllCustomers($allCustomersList){
			$this->content = $this->content."<table border=1>";
			$this->content = $this->content."<tr><th>Id</th><th>Customer's name</th><th>Age</th><th>Gender</th></tr>";
			foreach ($allCustomersList as $customer) {
				$this->content = $this->content."<tr><td>".$customer->getId()."</td><td>".$customer->getName()."</td><td>".$customer->getAge()."</td><td>".$customer->getGender()."</td></tr>";
			}
			$this->content = $this->content."</table>";
			
			//$this->content = print_r($allCustomersList, true);
			$this->getTemplate();
		}
		
		function getTemplate(){
			include("./view/template/main.php");
		}
	}
?>