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
 * @author MoNasr
 */
public class productdao {
    public static void save(Product product)
    {
    String query="insert into product (name,category,price) values('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
    dpoperations.setdataordelete(query, "Product Added Successfully");
    }
    public static ArrayList<Product> getAllRecords()
    {
        ArrayList<Product> arr=new ArrayList<>();
        try{
            ResultSet rs=dpoperations.getdata("select *from product");
            while(rs.next())
            {
                Product p=new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setCategory(rs.getString("category"));
                p.setPrice(rs.getString("price"));
                arr.add(p);
                
                
            }
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, e);}
        return arr;
    }
    public static void update(Product p)
    {
        String query="update product set name ='"+p.getName()+"',category ='"+p.getCategory()+"',price ='"+p.getPrice()+"' where id ='"+p.getId()+"'";
        dpoperations.setdataordelete(query, "Product Updated Successfully");
    }
    public static void delete(Product p)
    {
        String q="delete from product where id = '"+p.getId()+"'";
        dpoperations.setdataordelete(q, "Product Deleted Successfully");
        
    }
    
}
