/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.stringprocessing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Shekhar
 */
public class DateConvertionExample {

    public static void main(String[] args) {
        /*SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
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
        }*/
        System.out.println(ageCalculate(06, 9, 1988));
    }

    public static String calculateAge(int day, int month, int year) {
        String dateInString = day + " " + month + " " + year;
        String age = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        try {
            Date dateOfBirth = formatter.parse(dateInString);
            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
            long d1 = dateOfBirth.getTime();
            long d2 = (new Date()).getTime();
            long totalDay = Math.abs((d1 - d2) / (1000 * 60 * 60 * 24));
            int yearAge = (int) totalDay / 365;
            int monthAge = ((int) totalDay % 365) / 30;
            int dayAge = ((int) totalDay % 365) % 30;
            System.out.println(totalDay);
            age = "Age: Year: " + yearAge + " Month: " + monthAge + " day:" + dayAge;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return age;
    }

    public static String ageCalculate(int mDay, int mMonth, int mYear) {
        Calendar c = Calendar.getInstance();
        int tYear = c.get(Calendar.YEAR);
        int tMonth = c.get(Calendar.MONTH)+1;
        int tDay = c.get(Calendar.DAY_OF_MONTH);

        int mYearDiff = tYear - mYear;
        int mMonDiff = tMonth - mMonth;

        if (mMonDiff < 0) {
            mYearDiff = mYearDiff - 1;
            mMonDiff = mMonDiff + 12;
        }

        int mDayDiff = tDay - mDay;
        if (mDayDiff < 0) {
            if (mMonDiff > 0) {
                mMonDiff = mMonDiff - 1;
                mDayDiff = mDayDiff + MonthsToDays(tMonth - 1, tYear);
            } else {
                mYearDiff = mYearDiff - 1;
                mMonDiff = 11;
                mDayDiff = mDayDiff + MonthsToDays(tMonth - 1, tYear);;
            }

        }
        String age = "Age: " + mYearDiff + " Years " + mMonDiff + " Months " + mDayDiff+ " Days";
        return age;
    }

    public static int MonthsToDays(int tMonth, int tYear) {
        if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7
                || tMonth == 8 || tMonth == 10 || tMonth == 12) {
            return 31;
        } else if (tMonth == 2) {
            if (tYear % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }
}
