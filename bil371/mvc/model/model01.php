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

        function getAllCustomers() {
            $stmt = $this->conn -> stmt_init();
            if ($stmt -> prepare("select * from Customers")) {

                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $name, $age, $gender, $password);

                $customersList = array();
                if ($stmt->num_rows > 0) {
                    while ($stmt -> fetch()) {
                        $customersList[] = new Customer($id, $name, $age, $gender, $password);
                    }
                    $stmt -> close();
                    $this->conn->close();
                    return $customersList;
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

        function getCustomerById($id) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select * from Customers where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($id);
                $stmt -> bind_param("d", $id);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($id, $name, $age, $gender, $password);

                if ($stmt -> num_rows == 1) {
                    $stmt -> fetch();
                    $customer = new Customer($id, $name, $age, $gender, $password);
                    $stmt->close();
                    $this->conn->close();
                    return $customer;
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }

        function addNewCustomer($customer) {
            $stmt = $this->conn -> stmt_init();
            $sql = "insert into `Customers` (`id`, `name`, `age`, `gender`, `password`) values(null, ?, ?, ?, ?);";
            if ($stmt -> prepare($sql)) {

                $name = htmlspecialchars($customer->getName());
                $age = htmlspecialchars($customer->getAge());
                $gender = htmlspecialchars($customer->getGender());
                $password = htmlspecialchars($customer->getPassword());
                $hashed = md5($password);

                $stmt -> bind_param("sdss", $name, $age, $gender, $hashed);

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

        function updateCustomerInfo($customer) {
            $stmt = $this->conn -> stmt_init();
            $sql = "update `Customers` set `name`=?,
                                            `age`=?,
                                            `gender`=?,
                                            `password`=?
                        where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($customer->getId());
                $name = htmlspecialchars($customer->getName());
                $age = htmlspecialchars($customer->getAge());
                $gender = htmlspecialchars($customer->getGender());
                $password = htmlspecialchars($customer->getPassword());
                $hashed = md5($password);

                $stmt -> bind_param("sdssd", $name, $age, $gender, $hashed, $id);

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

        function deleteCustomer($id) {
            $stmt = $this->conn -> stmt_init();
            $sql = "delete from Customers where id = ?;";
            if ($stmt -> prepare($sql)) {

                $id = htmlspecialchars($id);

                $stmt -> bind_param("d", $id);

                if ($stmt -> execute() === TRUE) {
                    $message = "Customer deleted successfully";
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            
            
            $this->conn->close();

            return $message;
        }

        function getPasswordByName($name, $password) {
            $stmt = $this->conn -> stmt_init();
            $sql = "select `password` from Customers where name = ?;";
            if ($stmt -> prepare($sql)) {

                $name = htmlspecialchars($name);
                $stmt -> bind_param("s", $name);
                $stmt -> execute();
                $stmt -> store_result();
                $stmt -> bind_result($password);

                if ($stmt -> num_rows === 1) {
                    $stmt -> fetch();
                    $stmt->close();
                    $this->conn->close();
                    return $password;
                } else {
                    $message = "Error: " . $sql . "<br>" . $this->conn->error;
                }
            } else {
                $message = "Statement prepare error";
            }
            $this->conn->close();
            return $message;
        }
        
    }
?>