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
public class ClassLevelVariable {

    private int number1 = 20;
    private int number2 = 15;
    private int number3 = 25;
    private int number4 = 35;

    private int add() {
        return number1 + number2 + number3 + number4;
    }

    private int average() {
        ClassLevelVariable classLevelVariable = new ClassLevelVariable();
        int result = classLevelVariable.add();
        return result / 4;
    }

    private void substraction() {
        System.out.println(number1 - number2);
    }

    public static void main(String[] args) {
        ClassLevelVariable classLevelVariable = new ClassLevelVariable();
        //classLebelVariable.add();
        System.out.println(classLevelVariable.average());
    }
}
