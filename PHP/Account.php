<?php
class Account{
    Public $id;
    Public $name;
    Public $email;
    Public $password;
    Public $document;
}

public function __construct ($name, $document, $email, $password){
    $this->name = $name;
    $this ->document = $document;
    $this ->email = $email;
    $this ->password = $password;


}

public function (){
    echo ("impresion de nombre ".$this ->$name)
}
?>