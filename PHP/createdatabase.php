<?php
	if(isset($_GET["dbname"]))
	{
		$conn= mysqli_connect('localhost','root','') or die('Cannot connect to the DB');
		if(!$conn)
		{
			die("Connection Failed".mysqli_connect_errno());
		}
		
		$sqlquery=" create database ".$_GET["dbname"];
	
		if(mysqli_query($conn,$sqlquery))
		{
			echo "Database successfully created";
		}
		else
		{
			echo "Database NOT created";
		}
	}
	else
	{
		echo "Ander hi nai gaya";
	}
	
?>

