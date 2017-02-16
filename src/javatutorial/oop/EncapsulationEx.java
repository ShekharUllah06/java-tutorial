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
public class EncapsulationEx {
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setIdNumber("MMM");
        student.setRollNumber(10);
        student.setAdmittedDate(new Date());
        student.setStudentName("Abdul Karim");
        //System.out.println(student.getIdNumber());
        System.out.println(student.toString());
    }
}
