/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.loop;

/**
 *
 * @author Shekhar
 */
public class StarPyramid {

    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
