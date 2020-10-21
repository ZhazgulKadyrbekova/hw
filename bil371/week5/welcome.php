<?php
class Participant {
    private $name;
    private $age;
    private $gender;
    private $email;
    private $study;
    private $field;
    private $birthdate;

    public function __construct($name, $age, $gender, $email, $study, $field, $birthdate)
    {
        $this->name = $name;
        $this->age = $age;
        $this->gender = $gender;
        $this->email = $email;
        $this->study = $study;
        $this->field = $field;
        $this->birthdate = $birthdate;
    }

    public function getName()
    {
        return $this->name;
    }
    public function setName($name): void
    {
        $this->name = $name;
    }

    public function getAge()
    {
        return $this->age;
    }
    public function setAge($age): void
    {
        $this->age = $age;
    }

    public function getGender()
    {
        return $this->gender;
    }
    public function setGender($gender): void
    {
        $this->gender = $gender;
    }

    public function getEmail()
    {
        return $this->email;
    }
    public function setEmail($email): void
    {
        $this->email = $email;
    }

    public function getStudy()
    {
        return $this->study;
    }
    public function setStudy($study): void
    {
        $this->study = $study;
    }

    public function getField()
    {
        return $this->field;
    }
    public function setField($field): void
    {
        $this->field = $field;
    }

    public function getBirthdate()
    {
        return $this->birthdate;
    }
    public function setBirthdate($birthdate): void
    {
        $this->birthdate = $birthdate;
    }

}
?>

<!DOCTYPE html>
<html lang="en">
<body>

<h4>Thank you for your registration</h4>
<h4>Your information is written below</h4>
<?php
    $user = new Participant($_POST["name"], $_POST["age"], $_POST["gender"], $_POST["email"], $_POST["study"], $_POST["field"], $_POST["birthdate"]);

    if (!empty($user->getName())) {
        echo "<br>Welcome ";
        echo $user->getName();
    }


    if (!empty($user->getGender())) {
        echo "<br>Your gender is ";
        echo $user->getGender();
    }


    if(!empty($user->getField())) {
        echo "<br>Your interested fields are ";
        foreach($user->getField() as $item){
            echo $item;
            echo " ";
        }
    }


    if(!empty($user->getEmail())) {
        echo "<br>Your email address is ";
        echo $user->getEmail();
    }

    if(!empty($user->getAge())) {
        echo "<br>Your age is ";
        echo $user->getAge();
    }


    if (!empty($user->getStudy())) {
        echo "<br>You are studying ";
        echo $user->getStudy();
    }


    if (!empty($user->getBirthdate())) {
        echo "<br>Your birthdate is ";
        echo $user->getBirthdate();
    }

?>
</body>
</html>

