/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shekhar
 */
public class JdbcInsertTest {

    public static void main(String[] args) {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "1234"); // MySQL

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();) {
            // Step 3 & 4: Execute a SQL INSERT|DELETE statement via executeUpdate(),
            //   which returns an int indicating the number of rows affected.

        
            // INSERT a record
            String sqlInsert = "insert into product " // need a space
                    + "values ('P03','Carrot','KG')";
            System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            
            // Issue a SELECT to check the changes
            String strSelect = "select * from product";
            System.out.println("The SQL query is: " + strSelect);  // Echo For debugging
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {   // Move the cursor to the next row
                System.out.println(rset.getString("product_id") + ", "
                        + rset.getString("product_name") + ", "
                        + rset.getString("product_unit"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        // Step 5: Close the resources - Done automatically by try-with-resources
    }
}
