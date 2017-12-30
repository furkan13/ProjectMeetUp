/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiumeetup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kruf
 */
public class CheckClass {
    
    
   static String classType;
   static boolean  check;
   static int id;
   static int pass;
   

    public static void setClassType(String _classType) {
        classType = _classType;
    }
    
    
  
   
   
   public  static boolean selectClass(int id,int pass) throws IOException
   {
       //System.out.println("in checkkk:" +classType);
       if(classType.equals("Admin"))
       {
           //System.out.println("in adminnnnnn");
           Admin ad=new Admin();
           check=ad.checkAdmin(id, pass);
           return check;
           
       }
       
       
       else if(classType.equals("Teacher"))
       {
           teacher tea=new teacher();
           try {
               check=tea.checkTeacher(id, pass);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(CheckClass.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(CheckClass.class.getName()).log(Level.SEVERE, null, ex);
           }
           return check;
           
       }
       
       
       else if(classType.equals("Student"))
       {
           //System.out.println("in student");
           
               Student stu=new Student();
              // TransferData td=new TransferData();
           try {           
               check=stu.checkStudent(id, pass);
           } catch (Exception ex) {
               Logger.getLogger(CheckClass.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           
       }
       else
       {
           System.out.println("ase naaaaaa");
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        CheckClass.id = id;
    }

    public static int getPass() {
        return pass;
    }

    public static void setPass(int pass) {
        CheckClass.pass = pass;
    }

   
    
    
    
    
   
   
   
   
    
    
    
}
