<?php
    require_once ('Payment.php');
    class Driver extends Account {

    public $license 

    public function construct($name, $document, $email, $password, $license){
        parent ::_construct ($name, $document, $email, $password)
        $this ->$license = $license

    }

 }

?>