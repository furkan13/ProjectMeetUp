
package uiumeetup;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Scanner;

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
    String course;
    String routine;
    String assignment;
    String faculty;

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
    
    
    
    void write(Student writeStu) throws Exception
    {
        File f=new File("student.txt");
         FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(writeStu);
        oos.flush();
        oos.close();
        
        
    }
    
     void deletStudent(int delstu) throws IOException, ClassNotFoundException
    {
        //delete srudent from file
        File f=new File("student.txt");
         FileInputStream fo = new FileInputStream(f);
        ObjectInputStream oos = new ObjectInputStream(fo);
        
        while(true){
       Student s1 = (Student) oos.readObject();
       if(s1.id==delstu )
       {
           oos.close();
       }
      
        
    }
    }
    
    
   /* Student view(int view)
    {
        //read student file find view.id if matches than return to student frame
        return ;
    }*/

    String changePass(int oldPass,int newPass)
    {
        if(oldPass==this.getPassword())
        {
            this.setPassword(newPass);
            return("Password chaged successfully");
        }
        else 
        {
            return("wrong Password");
        }
        
        
        
        
        
    }
    
     
   boolean checkStudent(int id,int pass) throws Exception
        {
            //File f=new File("student.txt");
         //FileInputStream fo = new FileInputStream(f);
        //ObjectInputStream oos = new ObjectInputStream(fo);
            //System.out.println("in check");
            /*File f=new File("student.txt");
         FileInputStream fi = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fi);
        
        Student s1 = (Student)ois.readObject();
        System.out.println(s1);
        
        ois.close();*/
        //return true;
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
                   // System.out.println(s1);
                    //System.out.println(s1.id+ "  " +s1.password+" id:"+id+" pass"+pass);
                } catch (IOException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        
        return (""+name+ " "+id+ " "+ dept+" " + Trisemester + " pass"+password+" "+cgpa+" "+ course+ " "+ routine+" "+faculty);
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
                   // System.out.println(s1);
                    //System.out.println(s1.id+ "  " +s1.password+" id:"+id+" pass"+pass);
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
    }
    
    
    
    

