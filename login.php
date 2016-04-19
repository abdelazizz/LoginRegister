<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
	
	require 'connection.php';
	createLogin();
}

function creatlogin(){
	global $connect;

	$login = $_POST["login"];
	$password = $_post["password"];

	$query = "Insert into login(login,password) values ('$login','$password');";

	mysqli_query($connect, $query) or die (mysqli_error($connect));
	mysqli_close($connect);
} 