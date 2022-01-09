<?php
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ConnectionProperty
 *
 * @author DMP
 */
class ConnectionProperty{
	private static $host = 'localhost';//'localhost'
	private static $user = 'pruebas';//root
	private static $password = '123456';//cticsperu
	private static $database = 'pruebas';//cvl_data

	public static function getHost(){
		return ConnectionProperty::$host;
	}

	public static function getUser(){
		return ConnectionProperty::$user;
	}

	public static function getPassword(){
		return ConnectionProperty::$password;
	}

	public static function getDatabase(){
		return ConnectionProperty::$database;
	}
}
?>
