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
public class Payment {
    
    Integer id;
    
    public Payment (Integer id){
        this.id = id;
    
    }
    
    void PrintDataPayment (){
        System.out.println("Tipo de pago " + id);
    } 
    
}
