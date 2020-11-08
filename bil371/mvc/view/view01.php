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
			$this->content = "<h4>Add new customer</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=addNewCustomer' method='POST'>
				<input type='text' name='name' value='Enter name'>
				<input type='text' name='age' value='Enter age'>
				<select name='gender'>
					<option value='M'>Male</option>
					<option value='F'>Female</option>
				</select>
				<input type='submit' value='add'>
			</form>";
			$this->getTemplate();
		}

		function showAllCustomers($allCustomersList){
			$this->content = $this->content . "<h4>All customers list</h4><table border=1>";
			$this->content = $this->content . "<tr><th>Id</th><th>Name</th><th>Age</th><th>Gender</th></tr>";
			foreach ($allCustomersList as $customer) {
				$this->content = $this->content . "<tr><td>" . $customer->getId() . "</td><td>" . $customer->getName() . "</td><td>" . $customer->getAge() . "</td><td>" . $customer->getGender() . "</td></tr>";
			}
			$this->content = $this->content . "</table>";
			$this->getTemplate();
		}

		function updateCustomerDataForm($allCustomersList) {
			$this->content = $this->content . "<h4>All customers list</h4><table border=1>";
			$this->content = $this->content . "<tr><th>Id</th><th>Name</th><th>Age</th><th>Gender</th></tr>";
			foreach ($allCustomersList as $customer) {
				$this->content = $this->content . "<tr><td>" . $customer->getId() . "</td><td>" . $customer->getName() . "</td><td>" . $customer->getAge() . "</td><td>" . $customer->getGender() . "</td></tr>";
			}
			$this->content = $this->content . "</table><br>";

			$this->content = $this->content . "<h4>Update customer data</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=updateCustomerData' method='POST'>
				<input type='text' name='id' value='Enter id'>
				<input type='text' name='name' value='Enter name'>
				<input type='text' name='age' value='Enter age'>
				<select name='gender'>
					<option value='M'>Male</option>
					<option value='F'>Female</option>
				</select>
				<input type='submit' value='update'>
			</form>";
			$this->getTemplate();
		}
		
		function deleteCustomerForm($allCustomersList){
			$this->content = $this->content . "<h4>All customers list</h4><table border=1>";
			$this->content = $this->content . "<tr><th>Id</th><th>Name</th><th>Age</th><th>Gender</th></tr>";
			foreach ($allCustomersList as $customer) {
				$this->content = $this->content . "<tr><td>" . $customer->getId() . "</td><td>" . $customer->getName() . "</td><td>" . $customer->getAge() . "</td><td>" . $customer->getGender() . "</td></tr>";
			}
			$this->content = $this->content . "</table><br>";

			$this->content = $this->content . "<h4>Delete customer</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=deleteCustomer' method='POST'>
				<input type='text' name='id' value='Enter id of customer to delete it'>
				<input type='submit' value='delete'>
			</form>";
			$this->getTemplate();
		}

		function getTemplate(){
			include("./view/template/main.php");
		}
	}
?>