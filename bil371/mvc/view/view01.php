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

    	function loginForm(){
			$this->content = "<h4>Log In</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=login' method='POST'>
				<input type='text' name='name' value='Enter name'>
				<input type='text' name='password' value='Enter password'>
				<input type='submit' value='login'>
			</form>";
			$this->getTemplate();
		}

		function incorrect(){
			$this->content = "<h4>Incorrect username or password</h4>";
			$this->content = $this->content . "
			<form action='login.php' method='POST'>
				<input type='text' name='name' value='Enter name'>
				<input type='text' name='password' value='Enter password'>
				<input type='submit' value='login'>
			</form>";
			$this->getTemplate();
		}

		function logoutForm(){
			$this->content = "<h4>Hello, " . $_SESSION['name'] . " </h4><br><p>You are logged in</p>" ;
			$this->content = $this->content . "
			<form action='index.php?page=logout' method='POST'>
				
				<input type='submit' value='logout'>
			</form>";
			$this->getTemplate();
		}

		function logout(){
			$this->content = "You have successfully logged out";
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
			<input type='text' name='password' value='Enter password'>
				<input type='submit' value='add'>
			</form>";
			$this->getTemplate();
		}

		function showAllCustomers($allCustomersList){
			$this->content = $this->content . "<h4>All customers list</h4><table>";
			$this->content = $this->content . "<tr><th>Id</th><th>Name</th><th>Age</th><th>Gender</th><th>Delete</th><th>Update</th></tr>";
			foreach ($allCustomersList as $customer) {
        	if ($customer->getGender()=="m"){
					$gender = "male";
				} else $gender = "female";
        
				$this->content = $this->content . "<tr>
					<td>" . $customer->getId() . "</td>
					<td>" . $customer->getName() . "</td>
					<td>" . $customer->getAge() . "</td>
          			<td>" . $gender . "</td>
					<td><form method='POST' action='index.php?page=deleteCustomer'>
						<input type='hidden' name='id' value='" . $customer->getId() ."'>
						<input type = 'submit' value = 'Delete'>
					</form></td>
					<td><form method='POST' action='index.php?page=updateCustomerData'>
						<input type='hidden' name='id' value='" . $customer->getId() ."'>
						<input type = 'submit' value = 'Update'>
					</form></td>
					</tr>";
			}
			$this->content = $this->content . "</table>";
			$this->getTemplate();
    	}

		function updateCustomerDataForm($customer) {

			if ($customer->getGender() == "m") {
				$maleSelected = "selected";
				$femaleSelected = "";
			} else {
				$maleSelected = "";
				$femaleSelected = "selected";
			}
			$this->content = "<h4>Update customer data</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=updateCustomerInfo' method='POST'>
				<input type='hidden' name='id' value='".$customer->getId()."'>
				<input type='text' name='name' value='".$customer->getName()."'>
				<input type='text' name='age' value='".$customer->getAge()."'>
				<select name='gender'>
					<option value='M' ".$maleSelected.">Male</option>
					<option value='F' ".$femaleSelected.">Female</option>
			</select>
			<input type='text' name='password'>
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