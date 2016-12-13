/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.condition;

import java.util.Scanner;

/**
 *
 * @author Shekhar
 */
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = input.nextInt();
        String result = "Invalid Marks";
        if (mark >= 0 && mark < 32) {
            result = "Failed";
        } else if (mark >= 33 && mark < 40) {
            result = "D Grade";
        } else if (mark >= 40 && mark < 50) {
            result = "C Grade";
        } else if (mark >= 50 && mark < 60) {
            result = "B Grade";
        }else if (mark >= 60 && mark < 70) {
            result = "A- Grade";
        }else if (mark >= 70 && mark < 80) {
            result = "A Grade";
        }
        else if (mark >= 80 && mark <= 100) {
            result = "A+ Grade";
        }
        System.out.println(result);
    }
}
