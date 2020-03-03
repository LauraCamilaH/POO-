<?php
class Car {
    public $id;  
    public $driver;
    public $license;
    public $passenger;


    public function __construct ($license, &driver)
    {
        $this ->license = $license;
        $this ->driver = $driver;
    }

    public function PrintDataCar(){
        echo "License: " .$this->license .", name driver: " . $this->driver ->name.  " , document driver: " . $this ->driver ->document;    }
}
?>