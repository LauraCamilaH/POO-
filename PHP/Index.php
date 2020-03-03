<?php
require_once 'Car.php';
require_once 'Account.php';

echo " <h2> ejemplo objetos </h2>"
 
$car = new Car ("AMD123", 
new Account ("Andres Herrera", "doc123"))
$car ->printDataCar();
?>