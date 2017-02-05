/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.stringprocessing;

import java.util.StringTokenizer;

/**
 *
 * @author Shekhar
 */
public class StringTokenizerExample {

    public static void main(String[] args) {

        String str = "This is String/split by StringTokenizer/created by mkyong";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("---- Split by space ------");
        System.out.println("Total Token: "+st.countTokens());
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("---- Split by slash ',' ------");
        StringTokenizer st2 = new StringTokenizer(str, "/");
          System.out.println("Total Token: "+st2.countTokens());
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
