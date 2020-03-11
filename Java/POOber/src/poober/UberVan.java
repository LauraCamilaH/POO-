/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temppassengerlate file, choose Tools | Templates
 * and open the template in the editor.
 */
package poober;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author dell
 */
public class UberVan extends Car {
    
   // private Integer passenger;
    
  // marca      //modelo dos datos 
    Map<String, ArrayList<String>> typeCarAccepted;
    //material del auto
    ArrayList<String>seatsMaterial;
    
    public UberVan(String license, Account driver,
        Map <String,ArrayList <String>> typeCarAccepted, // le pasamos los parametros en un super
        ArrayList<String>seatsMaterial){
        super (license, driver);
        //this.
        this.seatsMaterial = seatsMaterial;
       
    }
    
    public UberVan(String license, Account driver){
        super (license, driver);}
     
    @Override
    public void setPassenger(Integer passenger){
      
        if (passenger == 6){
        
        this.passenger = passenger;
        }
        else{
            System.out.println("El numero de pasajeros no es correctos");
        } 
    }
}
