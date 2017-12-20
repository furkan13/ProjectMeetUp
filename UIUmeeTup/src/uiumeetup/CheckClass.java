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
public class CheckClass {
    
    
   static String classType;
   static boolean  check;

    public static void setClassType(String _classType) {
        classType = _classType;
    }
    
    
  
   
   
   public  static boolean selectClass(int id,int pass)
   {
       if(classType=="Admin")
       {
           Admin ad=new Admin();
           check=ad.checkAdmin(id, pass);
           return check;
           
       }
       
       
       else if(classType=="Teacher")
       {
           //call Teacher
           
       }
       
       
       else if(classType=="Student")
       {
           //call Student
       }
       return check;
       
   }
   
   
   
    
    
    
}
