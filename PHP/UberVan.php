<?php
require_once ('Car.php');

class UberVan extends Car{
    public $typeCarAccepted;
    public $seatMaterial;

public function __contruct ($license, $driver, $typeCarAccepted, $seatMaterial){
    parent :: __contruct($license,$driver);
    $this->typeCarAccepted = $typeCarAccepted;
    $this->seatMaterial = $seatMaterial;

}

}
?>