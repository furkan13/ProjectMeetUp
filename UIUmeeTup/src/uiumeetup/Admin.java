/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiumeetup;

/**
 *
 * @author kruf
 */
public class Admin {
    int ID;
    String pass="12345";
    Boolean  checkAdmin(int id,String _pass)
    {
       if(pass==_pass && ID==id)
       {
           
           //call second menu
           return true;
           
       }
       
       else
       {
           return false;
       }
        
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
}
