/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poober;

/**
 *
 * @author dell
 */
public class UberX extends Car {
    // se require el constructor de la clase que estoy heredando
    
    String brand;
    String model;
    //metodo sencillo
    public UberX (String license, Account driver, String brand, String model){
    super (license, driver); // la palabra clave super 
    //para referirse al metodo constructor de la clase padre
    this.brand = brand;
    this.model = model;
    
   // super hace referencia a los datos de la super clase y this hace 
           // referencia a los atributos de la clase hija
    
    
    
    }
            
}
