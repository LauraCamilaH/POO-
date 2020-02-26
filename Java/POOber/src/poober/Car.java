/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poober;

/**
 *
 * @author laura
 */
public class Car {
    Integer id;
   String license;
    Account driver; // el conductor herreda de la clase account
    Integer passegenger;
    
    //constructor nombre de la clase, parametros  tipo y nombrbe
    //es buena practica poner el nombre igual al definido ejemplo license, los parametros se declaran de manera local
    public Car(String license, Account driver){
        //se llama escribiendo su nombre, pero como tiene el mismo nombre que la variable local
        // se utiliza la palabra this
        this.driver = driver;
        this.license = license;
        
    }
    
    void printDataCar (){
        System.out.println("licencia: "+ license + "conductor:  " + driver.name );
    }
}
