<?php	
	class View01{
		private $content;
		
		function homePage(){
			$this->content = "1804.01026 <br>";
			$this->content .= "Zhazgul Kadyrbekova <br>";
			$this->content .= "27.11.2020	BIL-371 <br>";
			$this->content .= "Fall Semester <br>";
			$this->getTemplate();
		}
		
		function printMessage($message){
			$this->content = $message;
			$this->getTemplate();
		}
		function printRoute($route){
			if ($route instanceof TrekkingRoutes) {
				$this->content = "id:                ".$route->getId()."<br>";
				$this->content .= "title:            ".$route->getTitle()."<br>";
				$this->content .= "distance:         ".$route->getDistance()."<br>";
				$this->content .= "difficulty level: ".$route->getDifficultyLevel()."<br>";
				$this->content .= "price:            ".$route->getPrice()."<br>";
			}
			$this->getTemplate();
		}

		function showAllData($dataList){
			$this->content = "<h4>All data list</h4><table border=1px>";
			$this->content = $this->content . "<tr><th>Id</th><th>Title</th><th>Distance</th><th>Difficulty Level</th><th>Price</th><th>Delete</th><th>Update</th></tr>";
			foreach ($dataList as $data) {
        
				$this->content = $this->content . "<tr>
					<td>" . $data->getId() . "</td>
					<td>" . $data->getTitle() . "</td>
					<td>" . $data->getDistance() . "</td>
					<td>" . $data->getDifficultyLevel() . "</td>
					<td>" . $data->getPrice() . "</td>
					<td><form method='POST' action='index.php?page=deleteData'>
						<input type='hidden' name='id' value='" . $data->getId() ."'>
						<input type = 'submit' value = 'Delete'>
					</form></td>
					<td><form method='POST' action='index.php?page=updateData'>
						<input type='hidden' name='id' value='" . $data->getId() ."'>
						<input type = 'submit' value = 'Update'>
					</form></td>
					</tr>";
			}
			$this->content = $this->content . "</table><br><br><h3>To add new data use form below</h3>";
			$this->content = $this->content . "
			<form action='index.php?page=addNewData' method='POST'>
				<input type='text' name='title' value='Title'>
				<input type='text' name='distance' value='Distance'>
				<input type='text' name='difficultyLevel' value='Difficulty Level'>
				<input type='text' name='price' value='Price'>
				<input type='submit' value='add'>
			</form>
			";
			$this->getTemplate();
    	}

		function updateDataForm($data) {

			$this->content = "<h4>Update route data</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=updateInfo' method='POST'>
				<input type='hidden' name='id' value='".$data->getId()."'>
				<input type='text' name='title' value='".$data->getTitle()."'>
				<input type='text' name='distance' value='".$data->getDistance()."'>
				<input type='text' name='difficultyLevel' value='".$data->getDifficultyLevel()."'>
				<input type='text' name='price' value='".$data->getPrice()."'>
				<input type='submit' value='update'>
			</form>";
			$this->getTemplate();
		}
		
		function searchTitle() {
			$this->content = "<h4>Search by title</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=searchTitleInfo' method='POST'>
				<input type='text' name='title' value='Title'>
				<input type='submit' value='search'>
			</form>";
			$this->getTemplate();
		}

		function searchDistance() {
			$this->content = "<h4>Search by distance</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=searchDistanceInfo' method='POST'>
				<input type='text' name='distance' value='Distance'>
				<input type='submit' value='search'>
			</form>";
			$this->getTemplate();
		}

		function searchDifficultyLevel() {
			$this->content = "<h4>Search by difficulty level</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=searchdifficultyLevelInfo' method='POST'>
				<input type='text' name='difficultyLevel' value='Difficulty Level'>
				<input type='submit' value='search'>
			</form>";
			$this->getTemplate();
		}

		function searchPrice() {
			$this->content = "<h4>Search by price</h4>";
			$this->content = $this->content . "
			<form action='index.php?page=searchPriceInfo' method='POST'>
				<input type='text' name='price' value='price'>
				<input type='submit' value='search'>
			</form>";
			$this->getTemplate();
		}

		function getTemplate(){
			include("./view/template/main.php");
		}
	}
?>