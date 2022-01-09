<?php
//require_once '/../../Util/sql/ConnectionFactory.php';
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Connection
 *
 * @author DMP
 */
class Connection{
	private $connection;

	public function Connection(){
		$this->connection = ConnectionFactory::getConnection();
	}

	public function close(){
		ConnectionFactory::close($this->connection);
	}
	public function executeQuery($sql){
		return mysql_query($sql, $this->connection);
	}
    public function getConn() {
        return ConnectionFactory::getConnection();
    }
}
?>
