/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.stringprocessing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Shekhar
 */
public class DateConvertionExample {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2013";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
