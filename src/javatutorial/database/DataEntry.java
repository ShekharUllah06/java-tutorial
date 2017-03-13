/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shekhar
 */
public class DataEntry {
    public static void main(String[] args){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "1234");
            Statement stmt = conn.createStatement();
            String product_id = "E03";
            String product_name = "Funta";
            String unit = "Liter";
            
            String insert = "INSERT INTO product values ('"+product_id+"','"+product_name+"','"+unit+"')";
            int insertResult = stmt.executeUpdate(insert);
            System.out.println(insertResult+" rows affected");
        }catch(SQLException ses){
            ses.printStackTrace();
        }
    }
}

