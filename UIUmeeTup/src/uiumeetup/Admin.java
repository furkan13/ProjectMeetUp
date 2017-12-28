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
    int ID=123;
    int pass=12345;
    Boolean  checkAdmin(int id,int _pass)
    {
       if(pass==_pass )
       {
           
           //call second menu
           return true;
           
       }
       
       else
       {
           return false;
       }

      
      
    }
    
    
   void addStudent(int id,int password,String name,String dept,double cgpa,int Trisemester)
   {
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
}
