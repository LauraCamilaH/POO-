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
public class UberPool extends Car {
    
    String brand;
    String Model;
    
    public UberPool (String license, Account driver, String brand, String Model){
    super (license, driver);
    this.brand = brand;
    this.Model = Model;
    
      
    }
    
}
