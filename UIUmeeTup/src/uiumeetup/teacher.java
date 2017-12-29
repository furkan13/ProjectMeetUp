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
import java.util.Scanner;

/**
 *
 * @author kruf
 */
public class teacher extends user implements Serializable {
    
    
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
         
    void write(teacher writeTea) throws FileNotFoundException, IOException
    {
        //write Teacher object in file
         File f=new File("teacher.txt");
         FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(writeTea);
        oos.close();
        
    }
    
    void deletTeacher(int delTea) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //delete srudent from file
        File f=new File("teacher.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
       teacher t1 = (teacher) oos.readObject();
       Scanner sc= new Scanner(f);
       while(sc.hasNext()){
       if(t1.id==delTea)
       {
           oos.close();
       }      
         oos.close();
    }
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
    
    boolean checkTeacher(int id,int pass) throws FileNotFoundException, IOException, ClassNotFoundException
        {
         
          File f=new File("teacher.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
       teacher t1 = (teacher) oos.readObject(); 
       oos.close();
       Scanner sc= new Scanner(f);
       while(sc.hasNext()){
     
      
       }
          return true;
        }
            
        
       
       
       
    
    

