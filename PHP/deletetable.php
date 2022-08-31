<?php
	if(isset($_GET["tblname"]))
	{
		$conn= mysqli_connect('localhost','root','') or die('Cannot connect to the DB');
		if(!$conn)
		{
			die("Connection Failed".mysqli_connect_errno());
		}
		
		$sqlquery=" DROP Table ".$_GET["tblname"];

		$name=$_GET['db'];
		
		mysqli_select_db($conn,$name);
	
		if(mysqli_query($conn,$sqlquery))
		{
			echo "done";
		}
		else
		{
			echo "Not";
		}
	}
	else
	{
		echo "Ander hi nai gaya";
	}
	
?>

