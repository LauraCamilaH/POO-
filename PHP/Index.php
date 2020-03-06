<?php
require_once ('UberX.php');
require_once ('Car.php');
require_once ('Account.php');
require_once ('UberPool.php');


echo " <h2> ejemplo objetos </h2>"
 
/*$car = new Car ("AMD123", 
new Account ("Andres Herrera", "doc123"))
$car ->printDataCar();*/

# se crea un objeto de uberX para imprimirlo en pantalla

$uberX new UberX("MAD123",new Acconunt
 ("andresPhp", "doc123"), "marcaChevrolet","ModSpart");
$uberX ->printDataCar();

$uberX new UberPool ("Lic123",new Acconunt
 ("andresPool", "doc123"), "marcaDoge","ModSpart");
$uberPool ->printDataCar();
?>