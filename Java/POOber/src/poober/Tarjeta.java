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
public class Tarjeta extends Payment {
    String tipoTarjeta;
    String banco;
    
    public Tarjeta (Integer Id, String tipoTarjeta, String banco){
        super (Id);
        this.tipoTarjeta = tipoTarjeta;
        this.banco = banco;
        
        
    }    
}
