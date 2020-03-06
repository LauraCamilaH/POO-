/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package poober;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author dell
 */
public class UberBlack extends Car {
    
  // marca      //modelo dos datos 
    Map <String, ArrayList<String>> typeCarAccepted; //Esto no tiene sentido
    //material del auto
    ArrayList<String>seatsMaterial;
    
    public UberBlack(String license, Account driver,
        Map < String, ArrayList <String>>typeCarAccepted, // le pasamos los parametros en un super
        //Ford -> [Focus, Fiesta, Explorer]
        //Ford -> [2010, 2020]    Map<String,ArrayList<Integer>>
        ArrayList<String>seatsMaterial){
        super (license, driver);
        //this.
        this.seatsMaterial = seatsMaterial;
       
    }
    
}
