/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shekhar
 */
public class ReDoingTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int number=scanner.nextInt();
                break;
            }catch(InputMismatchException ime){
                System.out.println("Invalid Input!");
                scanner.next();
            }
        }
    }
}
