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
public class ReverseNumber {
    public static void main(String[] args){
        int number=123456;
        for(int i=number;i>0;i=i/10){
            System.out.print(i%10);
        }
        System.out.println();
    }
}
