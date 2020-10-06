<?php
class Continents {
  public $name, $area, $countries, $population;

  function __construct($name) {
    $this->name = $name;
  }

  function set_name($name) {
    $this->name = $name;
  }
  function get_name() {
    return $this->name;
  }
  function set_area($area) {
    $this->area = $area;
  }
  function get_area() {
    return $this->area;
  }
  function set_countries($countries) {
    $this->countries = $countries;
  }
  function get_countries() {
    return $this->countries;
  }
  function set_population($population) {
    $this->population = $population;
  }
  function get_population() {
    return $this->population;
  }
  function info() {
      echo "Continents name:\t" . $this->get_name();
      echo "\n\tarea in km^2:\t" . $this -> get_area();
      echo "\n\tpopulation in millions:\t" . $this -> get_population();
      echo "\n\tnumber of counries:\t" . $this->get_countries(). "\n";
  }
}


$africa = new Continents("Africa");
$africa->set_area(30370000);
$africa->set_countries(54);
$africa->set_population(1347.333);
$africa -> info();

$antarctica = new Continents("Antarctica");
$antarctica->set_area(14200000);
$antarctica->set_countries(0);
$antarctica->set_population(0.001);
$antarctica -> info();

?>










