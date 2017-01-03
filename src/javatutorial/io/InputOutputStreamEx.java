/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Shekhar
 */
public class InputOutputStreamEx {

    public static void main(String[] args) throws IOException {//write text with space and characters
        String source = "Now is the time for all good men\n" + "to come to the aid of their country\n" + "and pay their due taxes.";
        //declare variables 
        int lines = 0, char1 = 0, c = 0, words = 0;
        //declare temporary variable as true
        boolean temp = true;
        String whitespace = " \t\n\r";
        //create object fos and write text into mno.txt file
        OutputStream fos = new FileOutputStream("mno.txt");
        //define byte array b and source into getByte()
        byte b[] = source.getBytes();
        //call method fos write
        fos.write(b);
        //fos close
        fos.close();
        System.out.println("File Created ");
        //read from mno.txt file
        InputStream fis = new FileInputStream("mno.txt");
        while ((c = fis.read()) != -1)//check condition
        {
            char1++;//increment char1 by 1
            if (c == '\n')//check condition
            {
                lines++;//increment line by 1
            }
            /*The index of the first occurrence of the character in the 
              character sequence represented by this object,
              or -1 if the character does not occur*/
            int index = whitespace.indexOf(c);
            if (index == -1) {
                if (temp == true)//check condition
                {
                    ++words;//increment word by 1
                }
                temp = false;
            } else {
                temp = true;
            }
        }
        if (char1 != 0)//check condition
        {
            ++lines;//increment by 1
        }
        System.out.println("Number of lines: "
                + lines + "\n Number of Characters :" + char1 + "\n Number of words: " + words);
    }
}
