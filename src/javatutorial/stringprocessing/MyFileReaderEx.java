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
import java.util.StringTokenizer;

public class MyFileReaderEx {

    public static void main(String[] args) {
        try {
            File file = new File("Data.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String myDocument;

            while ((myDocument = br.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(myDocument, "/");
                if (stringTokenizer.hasMoreElements()) {
                    System.out.println("Name : " + stringTokenizer.nextElement());
                }
                if (stringTokenizer.hasMoreElements()) {
                    System.out.println("Date of Birth : " + stringTokenizer.nextElement());
                }
                if (stringTokenizer.hasMoreElements()) {
                    System.out.println("Date of Death : " + stringTokenizer.nextElement());
                }
                System.out.println("...............................");
            }
        } catch (IOException ioe) {
            System.out.println("Exception Occured.");
            ioe.printStackTrace();
        }
    }
}
