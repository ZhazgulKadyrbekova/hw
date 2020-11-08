<?php
	class Customer{
		
		private $id;
		private $name;
		private $age;
		private $gender;
		
		function __construct($newId, $newName, $newAge, $newGender){
			$this->setId($newId);
			$this->setName($newName);
			$this->setAge($newAge);
			$this->setGender($newGender);
		}
		
		function setId($newId){
			$this->id = $newId;
		}
		
		function setName($newName){
			$this->name = $newName;
		}
		
		function setAge($newAge){
			$this->age = $newAge;
		}
		
		function setGender($newGender){
			$this->gender = $newGender;
		}
		
		function getId(){ return $this->id;	}
		function getName(){ return $this->name;	}
		function getAge(){ return $this->age;	}
		function getGender(){ return $this->gender;	}
	}
?>