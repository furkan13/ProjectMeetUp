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
          // Teacher tea=new Teacher();
           
       }
       
       
       else if(classType=="Student")
       {
           Student stu=new Student();
           check=stu.checkStudent(id, pass);
           
       }
       return check;
       
   }
   
   static void  selectFrame(String type)
   {
       if(type.equals("Admin"))
       {
           
           new Adminframe().setVisible(true);
       }
       
       
       else if(type.equals("Student"))
       {
           new Studentframe().setVisible(true);
       }
       
       else
       {
           new Teacherframe().setVisible(true);
       }
       
   }

    public static String getClassType() {
        return classType;
    }
   
   
   
   
    
    
    
}
