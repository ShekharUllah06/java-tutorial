/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.exception;

/**
 *
 * @author Shekhar
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentData {

    int studentId;
    String studentName;

    StudentData(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void display() {
        System.out.println(studentId + " - " + studentName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //int sId = (Integer.parseInt(scanner.nextLine()));
            int sId=scanner.nextInt();
            scanner.nextLine();
            //System.out.println();
            String sName = scanner.nextLine();
            StudentData s1 = new StudentData(sId, sName);
            s1.display();
        } catch (InputMismatchException ime) {
            System.out.println("Enter valid Number like 0-9");
        }

    }
}
