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
public class Account {
    
   Integer Id;
   String name;
   String document;
   String email;
   String password;
          
   //metodo costructor
   
   public void Account (String name, String document){
       this.name = name;
       this.document = document;
   }
   
    
}
