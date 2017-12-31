/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package uiumeetup;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author kruf
 */
public class Student extends user implements Serializable{
    int id;
    int password;
    String name;
    String dept;
    double cgpa;
    int Trisemester;
    ArrayList<String> subject=new ArrayList<>();
    String routine;
    String assignment;
    String faculty;
    HashMap<String, String>ass=new HashMap<>();
   
    
    
    //String assignment;

    public Student(String name,int id, String dept,int Trisemester,int password,double cgpa,  String course,String routine) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.Trisemester = Trisemester;
        this.course = course;
        this.routine=routine;
    }

    public Student() {
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getRoutine() {
        return routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    
    
    void write(Student writeStu) throws Exception
    {
        File f=new File("student.txt");
         FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(writeStu);
        oos.flush();
        oos.close();
        
        
        
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
    
     void deletStudent(int delstu) throws Exception
    {
        //delete srudent from file
        File f=new File("student.txt");
        
         FileOutputStream fi = new FileOutputStream(f);
        ObjectOutputStream ois = new ObjectOutputStream(fi);
        ArrayList<Student> data=new ArrayList<Student>();
        Student s1=new Student();
        System.out.println("out while");
        Boolean chk=true; 
       
       ObjectInputStream in=null;
        try {
            in = new ObjectInputStream (new FileInputStream("student.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Student s1=new Student();
        while (chk==true){
        
                try {
                    s1 = (Student) in.readObject();
                    data.add(s1);
                    System.out.println(s1);
                } catch (Exception e)
                {   
                    System.out.println("caught");
                    in.close();
                    chk=false;   
                    // return false;   
                }
       
       in.close();
    
       
    }   
        
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i).id==delstu)
            {
                data.remove(i);
                break;
            }
        }
        
        ois.writeObject(data);
        ois.flush();
        ois.close();
        
        
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
    
     
    boolean checkStudent(int id,int pass) throws Exception
        {
           
          ObjectInputStream in=null;
        try {
            in = new ObjectInputStream (new FileInputStream("student.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        Student s1=new Student();
        while (true){
        
                try {
                    s1 = (Student) in.readObject();
                } catch (Exception e)
                {         return false;    }
      // Scanner sc = new Scanner (f);
      if(s1.id==id||s1==null )
      {
          if(s1.password==pass||s1==null )
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
            
    public String toString()
    {
        
        return (""+name+ "\n "+id+ "\n "+ dept+"\n " + Trisemester + "\n "+password+"\n "+cgpa+" \n"+ subject+ " \n"+ routine+" \n"+faculty);
    }

    Student getclass(int id) throws Exception
    {
        ObjectInputStream in=null;
        try {
            in = new ObjectInputStream (new FileInputStream("student.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        Student s1=new Student();
        while (true)
        {
                try {
                    s1 = (Student) in.readObject();
                } catch (IOException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
                   // Scanner sc = new Scanner (f);
      
            if(s1.id==id||s1==null )
     
             {
                      return s1;
          
             }
          
         
          
      }
        }
   
    
    void addass(String sub,String topic) throws Exception
    {
        
       ObjectInputStream in=null;
        try {
            in = new ObjectInputStream (new FileInputStream("student.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        Student s1=new Student();
        boolean chk=true;
        while (chk==true)
        {
                try {
                    s1 = (Student) in.readObject();
                } catch (Exception ex) {
                    System.out.println("out");
                    chk=false;
                    
                }  
                
                   // Scanner sc = new Scanner (f);
            System.out.println("before loop");
            for(int i=0;i<s1.subject.size();i++)
            {
                if(s1.subject.get(i).equals(sub))
                {
                    s1.ass.put(sub, topic);
                    System.out.println(sub+" "+topic);
                            s1.write(s1);
                }
            }
          
         
          
      }
        in.close();
        
        
        
       
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
