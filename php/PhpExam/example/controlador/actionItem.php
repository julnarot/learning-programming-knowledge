<?php
include_once("example/modelo/ItemDAO.php");
/**
 * Description of actionItem
 *
 * @author DMP
 */

class actionItem {
    //put your code here
    public $model;

    public function __construct() {
        $this->model = new ItemDAO();
    }
    public function invoke() {
        if (!isset($_GET['opcion'])) {
            $books = $this->model->listarBook();
            include 'example/vista/itemList.php';
        } 
        
        if($_GET['opcion']=='2'){
            $book = $this->model->listarBookId($_GET['opcion']);
            include 'example/vista/formItem.php';
        }        
        if($_GET['opcion']=='3'){                        
            $this->model->insertBook($_REQUEST['nombre'], $_REQUEST['estado']);                                    
            $books = $this->model->listarBook();
            include 'example/vista/itemList.php';
        }

        if($_GET['opcion']=='5'){                        
            $this->model->eliminarBook($_REQUEST['codigo']);                        
            $books = $this->model->listarBook();
            include 'example/vista/itemList.php';
        }
        if($_GET['opcion']=='6'){ 
            $book=null;
           $book = $this->model->listarBookId($_GET['codigo']);                                   
           include 'example/vista/formItem.php';
        }
        if($_GET['opcion']=='7'){            
           $this->model->actualizarBook($_REQUEST['nombre'], $_REQUEST['estado'], $_REQUEST['codigo']);                                   
            $books = $this->model->listarBook();
            include 'example/vista/itemList.php';
        }
    }
       
}
?>
