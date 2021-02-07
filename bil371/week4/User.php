<?php
User user = new User($_GET["fname"], $_GET["sname"], $_GET[age], $_GET[gender]);
?>

<?php
    class User {
        private $name;
        private $surname;
        private $age;
        private $gender;

        function __construct($name, $surname, $age, $gender) {
            $this->name = $name;
            $this->surname = $surname;
            $this->age = $age;
            $this->gender = $gender;
        }

        public function getName() {
            return $this->name;
        }
        public function setName($name) {
            $this->name = $name;
        }

        public function getSurname()
        {
            return $this->surname;
        }
        public function setSurname($surname) {
            $this->surname = $surname;
        }

        public function getAge() {
            return $this->age;
        }
        public function setAge($age) {
            $this->age = $age;
        }

        public function getGender() {
            return $this->gender;
        }
        public function setGender($gender) {
            $this->gender = $gender;
        }




    }

?>
