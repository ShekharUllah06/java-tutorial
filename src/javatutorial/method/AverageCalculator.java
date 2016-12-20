/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.method;

import java.util.Scanner;

/**
 *
 * @author Shekhar
 */
public class AverageCalculator {

    private double average(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4;
        double avarage = sum / 4;
        return avarage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Enter Number 1");
        num1 = scanner.nextInt();
        System.out.println("Enter Number 2");
        num2 = scanner.nextInt();
        System.out.println("Enter Number 3");
        num3 = scanner.nextInt();
        System.out.println("Enter Number 4");
        num4 = scanner.nextInt();
        AverageCalculator avarageCalculator = new AverageCalculator();
        double average = avarageCalculator.average(num1, num2, num3, num4);
        System.out.println(average);
    }
}
