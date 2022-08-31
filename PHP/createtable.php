<?php

	if(isset($_GET["dbname"]))
	{
		$tblname=$_GET['pname'];
		$row1=$_GET['s1'];
		$row2=$_GET['s2'];
		$row3=$_GET['s3'];

		$conn= mysqli_connect('localhost','root','') or die('Cannot connect to the DB');
		if(!$conn)
		{
			die("Connection Failed".mysqli_connect_errno());
		}

		$sqlquery=" CREATE Table $tblname (Date DATE NOT NULL DEFAULT CURRENT_TIMESTAMP, Time TIME NOT NULL DEFAULT CURRENT_TIMESTAMP, $row1 FLOAT NOT NULL, $row2 FLOAT NOT NULL, $row3 FLOAT NOT NULL)";
		
		$name=$_GET['dbname'];
		
		mysqli_select_db($conn,$name);

		if(mysqli_query($conn,$sqlquery))
		{
			echo "done";
		}
		else
		{
			echo "not";
		}
	}
	else
	{
		echo "Ander hi nai gaya";
	}
	
?>

