<?php
require_once ('Car.php');
class UberBlack extends Car {

    # se definen las dos variables que quedaban pendientes

    public $typeCarAccepted;
    public $seatsMaterial;

   public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
    parent :: __construct ($license, $driver);
    $this-> typeCarAccepted = $typeCarAccepted;
    $this-> seatsMaterial = $seatsMaterial;

} 

}
?>