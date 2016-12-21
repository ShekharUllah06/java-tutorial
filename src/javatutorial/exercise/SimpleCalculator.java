/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.exercise;

/**
 *
 * @author Shekhar
 */
import java.util.Scanner;

public class SimpleCalculator {

    private int addition(int num1, int num2) {
        return num1 + num2;
    }

    private int substraction(int num1, int num2) {
        return num1 - num2;
    }

    private int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    private double division(double num1, double num2) {
        return num1 / num2;
    }

    private void menu() {
        System.out.println("Enter 1 for Addition:");
        System.out.println("Enter 2 for Substraction:");
        System.out.println("Enter 3 for Multiplication:");
        System.out.println("Enter 4 for Division:");
        System.out.println("Enter 0 for Exit:");
        System.out.println("..........");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int num = 0;
        while (num <= 5) {
            simpleCalculator.menu();
            int number = sc.nextInt();
            if (number == 0) {
                break;
            } else if (number == 1) {
                System.out.println("Enter Number 1:");
                int number1 = sc.nextInt();
                System.out.println("Enter Number 2:");
                int number2 = sc.nextInt();
                int resultAddition = simpleCalculator.addition(number1, number2);
                System.out.println("..........");
                System.out.println(resultAddition);
                System.out.println("..........");
            } else if (number == 2) {
                System.out.println("Enter Number 1:");
                int number1 = sc.nextInt();
                System.out.println("Enter Number 2:");
                int number2 = sc.nextInt();
                int resultSubstraction = simpleCalculator.substraction(number1, number2);
                System.out.println("..........");
                System.out.println(resultSubstraction);
                System.out.println("..........");
            } else if (number == 3) {
                System.out.println("Enter Number 1:");
                int number1 = sc.nextInt();
                System.out.println("Enter Number 2:");
                int number2 = sc.nextInt();
                int resultMultiplication = simpleCalculator.multiplication(number1, number2);
                System.out.println("..........");
                System.out.println(resultMultiplication);
                System.out.println("..........");
            } else if (number == 4) {
                System.out.println("Enter Number 1:");
                double number1 = sc.nextDouble();
                System.out.println("Enter Number 2:");
                double number2 = sc.nextDouble();
                double resultDivision = simpleCalculator.division(number1, number2);
                System.out.println("..........");
                System.out.println(resultDivision);
                System.out.println("..........");
            }
        }
    }
}
