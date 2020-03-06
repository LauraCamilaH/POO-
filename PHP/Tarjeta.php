<?php
class Tarjeta extends Payment{
    public $tipoTarjeta;
    public $banco;

    public function __construct($id, $tipoTarjeta, $banco){
        parent ::__construct ($id);
        $this ->$tipoTarjeta = $tipoTarjeta;
        $this ->$banco = $banco;

    }
}
?>