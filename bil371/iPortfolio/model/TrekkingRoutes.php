<?php
    class TrekkingRoutes {
        private $id;
        private $title;
        private $distance;
        private $difficultyLevel;
        private $price;

        function __construct($id, $title, $distance, $difficultyLevel, $price) {
            $this->setId($id);
            $this->setTitle($title);
            $this->setDistance($distance);
            $this->setDifficultyLevel($difficultyLevel);
            $this->setPrice($price);
        }
        
        function getId() {
            return $this->id;
        }
        function setId($newId) {
            $this->id = $newId;
        }

        function getTitle() {
            return $this->title;
        }
        function setTitle($title) {
            $this->title = $title;
        }
        
        function getDistance() {
            return $this->distance;
        }
        function setDistance($distance) {
            $this->distance = $distance;
        }

        function getDifficultyLevel() {
            return $this->difficultyLevel;
        }
        function setDifficultyLevel($difficultyLevel) {
            $this->difficultyLevel = $difficultyLevel;
        }
        
        function getPrice() {
            return $this->price;
        }
        function setPrice($price) {
            $this->price = $price;
        }
    }
?>