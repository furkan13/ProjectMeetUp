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
public class user {
    String name;
    int id;
     int pass;
    String Dept;
    String course;
    int notification;
    double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public String getCurrentourse() {
        return course;
    }

    public void setCurrentourse(String currentourse) {
        this.course = currentourse;
    }

    public int getNotification() {
        return notification;
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double  cgpa) {
        this.cgpa = cgpa;
    }
    
    
    
    
    
}
