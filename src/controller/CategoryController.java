/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.JOptionPane;
import model.Category;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author KRISHNA
 */
public class CategoryController {
    
     public static void save(Category category){
        String query = "insert into category(name) values ('"+category.getName()+"')";
        DbOperations.setdataorDelete(query, "Category Added Successfully"); 
    }
     
     public static ArrayList<Category> getALLrecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from category");
            while (rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
            
        catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
                return arrayList;
        
    
    }
     
     public static void delete(String id){
         String query = "delete from category where id ='"+id+"'";
         DbOperations.setdataorDelete(query,"Category Deleted Successfully");
     }
     
     
}
