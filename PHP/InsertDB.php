<?php

    $tblname=$_POST['pname'];
	$temp=$_POST['s1'];
	$moist=$_POST['s2'];
	$light=$_POST['s3'];
	$dname=$_POST['dbname'];
	
	$conn= mysqli_connect('localhost','root','') or die('Cannot connect to the DB');
	if(!$conn)
	{
		die("Connection Failed".mysqli_connect_errno());
	}
		
	mysqli_select_db($conn,$dname);
    
    date_default_timezone_set('Asia/Kolkata');
    $d = date("Y-m-d");
    $t = date("H:i:s");

    if(!empty($_POST['s1']))
    {
	    $sql = "INSERT INTO $tblname (Date, Time, Temperature, Moisture, Light) VALUES ('".$d."', '".$t."', '".$temp."', '".$moist."', '".$light."' )";

		if ($conn->query($sql) === TRUE) {
		    echo "OK VALUES INSERTED";
		} else {
		    echo "Error: " . $sql . "<br>" . $conn->error;
		}
	}

	$conn->close();
?>