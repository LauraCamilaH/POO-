<?php
require_once ('Car.php');
    class UberX extends Car {
    public $brand;
    public $model;


    Public function __construct ($license, $driver, $brand, $model){
        # se utiliza la palabra parent en vez de super para asiganarle los atributos a la clase padre
        #luego va su constructor
        parent ::__construct($license, $driver)

        $this->brand = $brand;
        $this->model = $model;

    }
}


?>