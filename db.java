/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultcalculator;

/**
 *
 * @author AD0KW3
 */
import java.sql.*;
import javax.swing.*;


public class db{
    Connection conn;

    public static Connection dbcon(){
      
    try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:Required file\\result.db");
            //C:\\Users\\AD0KW3\\Documents\\NetBeansProjects\\ResultCalculator\\
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}