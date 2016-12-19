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

    /*
    More generally, method declarations have six components, in order:
    Modifiers—such as public, private, and others you will learn about later.
    The return type—the data type of the value returned by the method, or void if the method does not return a value.
    The method name—the rules for field names apply to method names as well, but the convention is a little different.
    The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
    An exception list—to be discussed later.
    The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.
     */
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
