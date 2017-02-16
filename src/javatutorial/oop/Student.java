/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.oop;

import java.util.Date;

/**
 *
 * @author Shekhar
 */
public class Student {
    private String idNumber;
    private int rollNumber;
    private String studentName;
    private Date admittedDate;

    public Student(String idNumber, int rollNumber, String studentName, Date admittedDate) {
        this.idNumber = idNumber;
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.admittedDate = admittedDate;
    }

    public Student() {
    }
    /*
    rules for set method
    1. will be public
    2. return will be void
    3. Parameter with variable type
    */
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
     /*
    rules for get method
    1. will be public
    2. return type will be variable type
    3. no Parameter 
    */
    
    public String getIdNumber(){
        return idNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(Date admittedDate) {
        this.admittedDate = admittedDate;
    }

  

    @Override
    public String toString() {
        return "Student{" + "idNumber=" + idNumber + ", rollNumber=" + rollNumber + ", studentName=" + studentName + ", admittedDate=" + admittedDate + '}';
    }
    
}
