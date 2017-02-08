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
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        String dateInString = "7 Jun 2013";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

            long d1 = formater.parse("2001-1-1").getTime();
            long d2 = formater.parse("2004-8-2").getTime();
            long totalDay=Math.abs((d1 - d2) / (1000 * 60 * 60 * 24));
            int year=(int)totalDay/365;
            int month=((int)totalDay%365)/30;
            int day=((int)totalDay%365)% 30;
            System.out.println(totalDay);
            System.out.println("Year: "+year+" Month: "+ month + " day:"+ day);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
