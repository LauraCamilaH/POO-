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
public class Main {

    public static void main (String [] args){
        System.out.println("hola");
        Car car = new Car("AMQ123", new Account ("Andres Herrera", "123"));
        car.passegenger = 4;
        car.printDataCar();
        
       Car pepino = new Car("QME567", new Account ("Andrea Herrera", "1234"));
       pepino.passegenger = 3;
      pepino.printDataCar();
        
        /*
        objeto
        nombre clase, nombre objeto como quiera llamrlo, la palabra reservada, llamando el constructor de la clasa () parametros
        Car pepino = new Car ();
        pepino.license = "QME567";
        pepino.driver = "Andrea Herrera";
        pepino.passegenger = 3;
        // nombre de la clase, nombre de mi objeto palabra reservda y metodo
        pepino.printDataCar();
        */
    }
}
