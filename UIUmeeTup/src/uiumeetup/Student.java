/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package uiumeetup;
import java.io.*;

/**
 *
 * @author kruf
 */
public class Student extends user{
    int id;
    int password;
    String name;
    String dept;
    double cgpa;
    int Trisemester;
    String course;

    public Student(int id, int password, String name, String dept, double cgpa, int Trisemester, String course) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.Trisemester = Trisemester;
        this.course = course;
    }

    public Student() {
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
    void write(Student writeStu)
    {
        //write student object in file
    }
    
    void deletStudent(int delstu)
    {
        //delete srudent from file
    }
    
   /* Student view(int view)
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
    
    boolean checkStudent(int id,int pass)
        {
            /*make a object and run while loop to find id first
            if id matches read the object and check pass if matches both
            return true;
            */
            
            
            return true;
        }

    
    
    
    
}
