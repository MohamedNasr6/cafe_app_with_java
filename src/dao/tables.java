/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.*;
/**
 *
 * @author MoNasr
 */
public class tables {
    public static void main(String[] args)
    {
        try
        {
            //String userTable ="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobilenumber varchar(15),address varchar(200),password varchar(200),securityquestion varchar(200),answer varchar(200),states varchar(20),UNIQUE (email))";
            //String admindetails="insert into user (name,email,mobilenumber,address,password,securityquestion,answer,states) values('Admin','admin@gmail.com','01011223344','egypt','admin12','Say my name','Heisenberg','true')";
            //String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            //dpoperations.setdataordelete(admindetails,"Admin Added Successfully");
            //dpoperations.setdataordelete(userTable,"User Table Created Successfully");
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            //dpoperations.setdataordelete(categoryTable,"Category Table Created Successfully");
            dpoperations.setdataordelete(productTable,"product Table Created Successfully");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
