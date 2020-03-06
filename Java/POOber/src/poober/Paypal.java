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
public class Paypal extends Payment {
    
  String correo;
  String contraseña;
  
  public Paypal (Integer Id, String correo, String contraseña){
      super (Id);
      this.correo = correo;
      this.contraseña = contraseña;
 
  }
    
}
