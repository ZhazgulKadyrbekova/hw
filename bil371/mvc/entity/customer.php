<?php
    class Customer {
        private $id;
        private $name;
        private $age;
        private $gender;

        function __construct($id, $name, $age, $gender) {
            $this->setId($id);
            $this->setName($name);
            $this->setAge($age);
            $this->setGender($gender);
        }
        
        function getId() {
            return $this->id;
        }
        function setId($newId) {
            $this->id = $newId;
        }

        function getName() {
            return $this->name;
        }
        function setName($newName) {
            $this->name = $newName;
        }
        
        function getAge() {
            return $this->age;
        }
        function setAge($newAge) {
            $this->age = $newAge;
        }

        function getGender() {
            return $this->gender;
        }
        function setGender($newGender) {
            $this->gender = $newGender;
        }
        
    }
?>