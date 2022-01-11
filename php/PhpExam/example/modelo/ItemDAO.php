<?php
include_once("example/modelo/ItemTO.php");
include_once("example/Util/sql/ConnectionProperty.php");
include_once "example/Util/sql/QueryExecutor.php";
include_once("example/Util/sql/SqlQuery.php");
include_once("example/Util/sql/Transaction.php");
include_once("example/Util/sql/Connection.php");
include_once("example/Util/sql/ConnectionFactory.php");


/**
 * Description of ItemDAO
 *
 * @author DMP
 */
class ItemDAO{
    //put your code here
    public function listarBook() {
        $sql = "Select * from itemsm";
        try {
            $sqlQuery=new SqlQuery($sql);
            $tabla = QueryExecutor::execute($sqlQuery);
            $list=array();
            for ($a = 0; $a < count($tabla); $a++) {
                $itemTO = new ItemTO();
                $itemTO->setCodigo($tabla[$a]['codigo']);
                $itemTO->setNombre($tabla[$a]['nombre']);
                $itemTO->setEstado($tabla[$a]['estado']);
                $list[$a]=$itemTO;
            }
            return $list;
        }catch (Exception $e) {
            throw new Exception("Error :".$e->getMessage());
        }
    }
    
    
    public function listarBookId($id) {
        $sql = "Select * from itemsm where codigo=?";
        try {
            $sqlQuery=new SqlQuery($sql);
            $sqlQuery->set($id);
            $tabla = QueryExecutor::execute($sqlQuery);
            $list=array();
            for ($a = 0; $a < count($tabla); $a++) {
                $itemTO = new ItemTO();
                $itemTO->setCodigo($tabla[$a]['codigo']);
                $itemTO->setNombre($tabla[$a]['nombre']);
                $itemTO->setEstado($tabla[$a]['estado']);
                $list[$a]=$itemTO;
            }
            return $list;
        }catch (Exception $e) {
            throw new Exception("Error :".$e->getMessage());
        }
    }
    
    
    public function insertBook($nombre, $estado) {
        $sql = "insert into itemsm(nombre, estado) values(?,?)";
        try {
            $sqlQuery=new SqlQuery($sql);
            $sqlQuery->set($nombre);
            $sqlQuery->set($estado);
            QueryExecutor::executeInsert($sqlQuery);
        }catch (Exception $e) {
            throw new Exception("Error :".$e->getMessage());
        }
    }
    
    
    
    
    
    public function eliminarBook($codigo) {
        $sql = "delete from itemsm where codigo=?";
        try {
            $sqlQuery=new SqlQuery($sql);
            $sqlQuery->set($codigo);          
            QueryExecutor::executeUpdate($sqlQuery);
        }catch (Exception $e) {
            throw new Exception("Error :".$e->getMessage());
        }
    }
    
    
    
    public function actualizarBook($nombre, $estado, $codigo) {
        $sql = "update itemsm set nombre=?, estado=?  where codigo=?";
        try {
            $sqlQuery=new SqlQuery($sql);
            $sqlQuery->set($nombre);          
            $sqlQuery->set($estado);          
            $sqlQuery->set($codigo);          
            QueryExecutor::executeUpdate($sqlQuery);
        }catch (Exception $e) {
            throw new Exception("Error :".$e->getMessage());
        }
    }
    

}
?>
