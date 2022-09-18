/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author omar
 */
public class CategoryDao {
    public static void save(Category category){
        String query ="insert into category (name) values('"+category.getName()+"')";
        dpoperations.setdataordelete(query, "Category Added successfully");
    }
    public static ArrayList<Category>getAllRecords()
    {
        ArrayList<Category> arraylist =new ArrayList<>();
        try{
            ResultSet rs=dpoperations.getdata("select *from category");
            while(rs.next())
            {
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arraylist.add(category);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    public static void delete(String id)
    {
        String query="delete from category where id ='"+id+"'";
        dpoperations.setdataordelete(query, "Catogery deleted Successfully");
    }
}
