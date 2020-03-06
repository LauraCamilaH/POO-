<?php

require_once('Payment.php');

class User extends Payment {

    public function User ($name, $document, $email, $password){
        parent :: __construct($name, $document, $email, $password)
        

    }
    

}

?>