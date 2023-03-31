<!DOCTYPE html>
<html lang="en">
<head>
   
    <title>Document</title>
</head>
<body>
<?php
    
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "project";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }
    
    if(isset($_POST['signinsub'])){

        $email=$_POST['$email'];
        $phone=$_POST['$phone'];
        $date=$_POST['date'];
        $password=$_POST['$password'];
        $username = $_POST['$username'];
        $password2=$_POST['$password2'];

        $sql="INSERT INTO signup (email,phone,password,dateor) VALUES ('$email','$phone','$password','$date')";
        $sql1="INSERT INTO signin (username,password2) VALUES ('$username','$password2')";
        
        if ($conn->query($sql) === TRUE) {
            echo "Account created successfully" . "<br>";
        } else {
            echo "Error: " . $sql . "<br>" . $conn->error;
        }

        if ($conn->query($sql1) === TRUE) {
            echo "Personal data inserted successfully";
        } else {
            echo "Error: " . $sql1 . "<br>" . $conn->error;
        }

    }
    
    $conn->close();
    ?>
</body>
</html>