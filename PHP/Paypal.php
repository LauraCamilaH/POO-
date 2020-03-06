<?php

class Paypal extends Payment {
    public $correo;
    public $contraseña;

    public function __contruct($id,  $correo, $contraseña){

        parent ::__contruct($id);
        $this->$correo = $correo;
        $this ->$contraseña = $contraseña;

    }

}
?>