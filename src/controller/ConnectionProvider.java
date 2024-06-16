/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author KRISHNA
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?zeroDateTimeBehavior=convertToNull", "root", "");
            System.out.println("Connection success!");
            return con;
        }
            catch(Exception e){
                System.out.println(e);
                return null;    
                    }
    }
    
}
