<?php
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ItemTO
 *
 * @author DMP
 */
class ItemTO {
    //put your code here
    public $codigo;
    public $nombre;
    public $estado;
    
    public function getCodigo() {
        return $this->codigo;
    }
    public function setCodigo($codigo) {
        $this->codigo = $codigo;
    }
    public function getNombre() {
        return $this->nombre;
    }
    public function setNombre($nombre) {
        $this->nombre = $nombre;
    }
    public function getEstado() {
        return $this->estado;
    }
    public function setEstado($estado) {
        $this->estado = $estado;
    }
    }
?>
