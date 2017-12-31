/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiumeetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.*;
import java.util.logging.Logger;


/**
 *
 * @author kruf
 */
public class teacher extends user implements Serializable {
    
    
      int id;

       int pass;
       String name;
      String department;
       String course;
       String routine;
       String designation;
       String counseling_hour;
       HashMap<String,String> ass=new HashMap<String, String>();
       

    public teacher(int id, int pass, String name, String course, String routine, String designation, String department) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.course = course;
        this.routine = routine;
        this.designation = designation;
        this.department=department;
        
    }
    
    
    public teacher()
    {
        
    }
         
    void write(teacher writeTea) throws FileNotFoundException, IOException
    {
        //write Teacher object in file
         File f=new File("teacher.txt");
         FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(writeTea);
        oos.flush();
        oos.close();
        
    }
    
    void deletTeacher(int delTea) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        {
        //delete srudent from file
        File f=new File("teacher.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
         FileOutputStream fi = new FileOutputStream(f);
        ObjectOutputStream ois = new ObjectOutputStream(fi);
        ArrayList<teacher> data=new ArrayList<teacher>();
        teacher s1=new teacher();
        
       try{ while(true){
       s1 = (teacher) oos.readObject();
       {
      
       data.add(s1);
       
       
        }    
       
       
       oos.close();
       
    }
           
    }catch (Exception e)
    {
        
    }
       
       for(int i=0;i<data.size();i++)
       {
           if(data.get(i).id!=delTea)
           {
               ois.writeObject(data.get(i));
               ois.flush();
           }
       }
       
       
       ois.close();
       
    }
    
   /* Teacher view(int view)
    {
        //read student file find view.id if matches than return to student frame
        return ;*/
    }

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
    
    boolean checkTeacher(int id,int pass) throws FileNotFoundException, IOException, ClassNotFoundException
        {
         ObjectInputStream in=null;
        try {
            in = new ObjectInputStream (new FileInputStream("teacher.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
       teacher s1=new teacher();
        while (true){
        
                try {
                    s1 = (teacher) in.readObject();
                } catch (Exception e)
                {         return false;    }
      // Scanner sc = new Scanner (f);
      if(s1.id==id||s1==null )
      {
          if(s1.pass==pass||s1==null )
          {
              try {
                  in.close();
              } catch (IOException ex) {
                  Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
              }
          return true;
          }
          
          return false;
          
      }
        }
        }
     teacher getclass(int id) throws Exception
    {
       File f=new File("teacher.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
        
        while(true){
       teacher t1 = (teacher) oos.readObject();
       if(t1.id==id || t1 == null)
       {
           return t1;
       }
      
        
    }
    }

    @Override
    public String toString() {
        return (this.name+"\n"+this.id+"\n"+this.department+"\n"+this.designation+"\n"+this.counseling_hour+"\n"+this.routine) ;
    }

    public String getCourse() {
        return course;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRoutine() {
        return routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }

    public String getCounseling_hour() {
        return counseling_hour;
    }

    public void setCounseling_hour(String counseling_hour) {
        this.counseling_hour = counseling_hour;
    }
    
    
}
            
        
       
       
       
    
    

