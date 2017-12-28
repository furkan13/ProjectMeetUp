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
public class teacher extends user {
    
    
      int id;

       int pass;
       String name;
      
       String course;
       String routine;
       String designation;

    public teacher(int id, int pass, String name, String course, String routine, String designation) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.course = course;
        this.routine = routine;
        this.designation = designation;
    }
    
    
    public teacher()
    {
        
    }
         
    void write(teacher writeTea)
    {
        //write Teacher object in file
    }
    
    void deletTeacher(int delTea)
    {
        //delete srudent from file
    }
    
   /* Teacher view(int view)
    {
        //read student file find view.id if matches than return to student frame
        return ;
    }*/

    String changePass(int oldPass,int newPass)
    {
        if(oldPass==this.getPass())
        {
            this.setPass(newPass);
            return("Password chaged successfully");
        }
        else 
        {
            return("wrong Password");
        }
        
        
        
        
        
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
    boolean checkTeacher(int id,int pass)
        {
            /*make a object and run while loop to find id first
            if id matches read the object and check pass if matches both
            return true;
            */
            
            
            return true;
        }
       
       
       
    
    
}
