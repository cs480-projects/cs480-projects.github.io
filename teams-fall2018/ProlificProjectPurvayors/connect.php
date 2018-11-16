<?php
$username = filter_input(INPUT_POST, username);
$password = filter_input(INPUT_POST, password);
if(!empty($username)){
	if(!empty($password)){
	$host ="localhost";
	$dbusername = "root";
	$dbpassword = "";
	$dbname = "practice";

	$conn = new mysqli($host, $dbname, $dbpassword, $dbname);

	if(mysqli_connect_error()){
		die('Connection Error ('. mysqli_connect_error().')' mysqli_connect_error());
	}
	else {
		$sql = "INSERT INTO account (username, password)
		value ('$username', '$password')";
		if($conn->query($sql)){
			echo "New record is inserted sucessfully";
		}
		else {
			echo "Error: ". $sql ."<br>". $conn->error;
		}
		$conn->close();
	}


	}
	else {
		echo "password is empty"
		die();
	}

}
else {
	echo "username is empty"
	die();
}

?>