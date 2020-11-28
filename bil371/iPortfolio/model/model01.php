<?php
    class Model01 {
        private $servername;
        private $username;
        private $password;
        private $db;
        private $conn;

        function __construct($servername, $username, $password, $db) {
            $this->servername = $servername;
            $this->username = $username;
            $this->password = $password;
            $this->db = $db;
        }

        function dbConnect() {
            
            $this->conn = new mysqli($this->servername, $this->username, $this->password, $this->db);

            if ($this->conn->connect_error) {
                $message = "Connection failed: " . $conn->connect_error;
            } else {
                $message = "Connected successfully";
            }
            return $message;
            $this->conn->close();
        }

        function getAll() {
            $stmt = $this->conn -> stmt_init();
            if ($stmt -> prepare("select * from TrekkingRoutes")) {

                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                $dataList = array();
                if ($stmt->num_rows > 0) {
                    while ($stmt -> fetch()) {
                        $dataList[] = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    }
                    $stmt -> close();
                    $this->conn->close();
                    return $dataList;
                } else {
                    $stmt -> close();
                    $this->conn->close();
                    $message = "0 results";
                    return $message;
                }
            } else {
                $message = "Statement prepare error";
                return $message;
            }
        }

        function getById($id) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from TrekkingRoutes where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($id);
                $stmt -> bind_param("d", $id);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $data = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    $stmt->close();
                    $this->conn->close();
                    return $data;
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }

        function addNewData($data) {
            $stmt = $this->conn -> stmt_init();
            $sql = "insert into `TrekkingRoutes` (`id`, `title`, `distance`, `difficultyLevel`, `price`) values(null, ?, ?, ?, ?);";
            if ($stmt -> prepare($sql)) {

                $title = htmlspecialchars($data->getTitle());
                $distance = htmlspecialchars($data->getDistance());
                $difficultyLevel = htmlspecialchars($data->getDifficultyLevel());
                $price = htmlspecialchars($data->getPrice());

                $stmt -> bind_param("sddd", $title, $distance, $difficultyLevel, $price);

                if ($stmt -> execute() === TRUE) {
                    $message = "New record created successfully";
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            
            
            $this->conn->close();

            return $message;
        }

        function updateInfo($data) {
            $stmt = $this->conn -> stmt_init();
            $sql = "update `TrekkingRoutes` set `title`=?,
                                            `distance`=?,
                                            `difficultyLevel`=?,
                                            `price`=?
                        where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($data->getId());
                $title = htmlspecialchars($data->getTitle());
                $distance = htmlspecialchars($data->getDistance());
                $difficultyLevel = htmlspecialchars($data->getDifficultyLevel());
                $price = htmlspecialchars($data->getPrice());

                $stmt -> bind_param("sdddd", $title, $distance, $difficultyLevel, $price, $id);

                $stmt -> execute();

                if ($stmt -> affected_rows > 0) {
                    $message = "Record updated successfully";
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            
            
            $this->conn->close();

            return $message;
        }

        function deleteData($id) {
            $stmt = $this->conn -> stmt_init();
            $sql = "delete from TrekkingRoutes where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($id);

                $stmt -> bind_param("d", $id);

                if ($stmt -> execute() === TRUE) {
                    $message = "Data deleted successfully";
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            
            
            $this->conn->close();

            return $message;
        }

        function searchTitle($title) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from TrekkingRoutes where title = ?;";
            if ($stmt -> prepare($sql)) {

                $title = htmlspecialchars($title);
                $stmt -> bind_param("s", $title);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $data = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    $stmt->close();
                    $this->conn->close();
                    return $data;
                } else {
                    $message = "No data found" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }

        function searchDistance($distance) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from TrekkingRoutes where distance = ?;";
            if ($stmt -> prepare($sql)) {

                $distance = htmlspecialchars($distance);
                $stmt -> bind_param("d", $distance);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $data = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    $stmt->close();
                    $this->conn->close();
                    return $data;
                } else {
                    $message = "No data found" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }

        function searchDifficultyLevel($difficultyLevel) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from TrekkingRoutes where difficultyLevel = ?;";
            if ($stmt -> prepare($sql)) {

                $difficultyLevel = htmlspecialchars($difficultyLevel);
                $stmt -> bind_param("d", $difficultyLevel);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $data = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    $stmt->close();
                    $this->conn->close();
                    return $data;
                } else {
                    $message = "No data found" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }
        
        function searchPrice($price) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from TrekkingRoutes where price = ?;";
            if ($stmt -> prepare($sql)) {

                $price = htmlspecialchars($price);
                $stmt -> bind_param("d", $price);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $title, $distance, $difficultyLevel, $price);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $data = new TrekkingRoutes($id, $title, $distance, $difficultyLevel, $price);
                    $stmt->close();
                    $this->conn->close();
                    return $data;
                } else {
                    $message = "No data found" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }
    }
?>