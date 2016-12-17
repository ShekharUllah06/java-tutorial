/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.method;

/**
 *
 * @author Shekhar
 */
public class MethodDemo {

    private int addition() {
        int x, y;
        x = 10;
        y = 20;
        int result = x + y;
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        int result = methodDemo.addition();
        System.out.println(result);

        int s_t = methodDemo.st();
        System.out.println(s_t);

    }

    private int st() {
        int j = 10;
        int m = 8;
        int result = j - m;
        return result;
    }
}
