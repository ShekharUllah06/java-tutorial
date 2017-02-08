/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.stringprocessing;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class MyFileReaderEx {

    public static void main(String[] args) {
        try {
            File file = new File("Data.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String myDocument;
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            while ((myDocument = br.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(myDocument, "/");
                if (stringTokenizer.hasMoreElements()) {
                    System.out.println("Name : " + stringTokenizer.nextElement());
                }
                Date dateOfBirth = null;
                Date dateOfDeath = null;
                
                if (stringTokenizer.hasMoreElements()) {
                    dateOfBirth = sdf.parse(stringTokenizer.nextElement().toString());
                    System.out.println("Date of Birth : " +sdf.format(dateOfBirth) );
                }
                if (stringTokenizer.hasMoreElements()) {
                    dateOfDeath = sdf.parse(stringTokenizer.nextElement().toString());
                    System.out.println("Date of Death : " +sdf.format(dateOfDeath));
                }
                long date1 = dateOfBirth.getTime();
                long date2 = dateOfDeath.getTime();
                long totalDay =Math.abs((date1 - date2)/(1000 * 60 * 60 * 24));
                int year = (int)totalDay/365;
                int month=((int)totalDay%365)/30;
                int finalDay = ((int)totalDay%365)%30;
                System.out.println("Age : "+year+" Year "+month+" Month "+finalDay+" Days.");
                System.out.println("...............................");
            }
        } catch (IOException ioe) {
            System.out.println("Exception Occured.");
            ioe.printStackTrace();
        }catch(ParseException pe){
        
        }
    }
}
