<?php
//require_once '/../../Util/sql/ConnectionProperty.php';
//include_once ('../../Util/core/MD5Crypt.php');

class ConnectionFactory{
	static public function getConnection(){
        $conn = mysql_connect(ConnectionProperty::getHost(),ConnectionProperty::getUser() ,ConnectionProperty::getPassword());
        mysql_select_db(ConnectionProperty::getDatabase());
		if(!$conn){
			throw new Exception('No se puede conecctar con DB');
		}
		return $conn;
	}
	static public function close($connection){
		mysql_close($connection);
	}
}
//echo ConnectionFactory::getConnection();
?>
