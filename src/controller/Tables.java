/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author KRISHNA
 */
public class Tables { 
    public static void main(String [] args)
    {
        try{
            String userTable = "create table user (id int AUTO_INCREMENTt primary key,name varchar(200),email varchar(200),mobileNumber varchar(12),address varchar(200),password varchar(200),securityQuestion varchar(200),status varchar(200))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values ('Admin','admin@gmail.com','1234567890','Srilanka','admin','Dream Car?','gtr','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product (id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill (id int primary key, name varchar(200),mobileNumber varchar(20),email varchar(200),date varchar(50), total varchar(200), createdBy varchar(200))";
            
            
            DbOperations.setdataorDelete(userTable, "User Table created Successfully");
            DbOperations.setdataorDelete(adminDetails,"Admin Details Added Successfully");
            DbOperations.setdataorDelete(categoryTable," Category Table created  Successfully"); 
            DbOperations.setdataorDelete(productTable," Product Table created Successfully");
            DbOperations.setdataorDelete(billTable," Bill Table created Successfully");
        }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
            
    }
    
    
}
