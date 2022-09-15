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
            String userTable ="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobilenumber varchar(10),address varchar(200),password varchar(200),securityquestion varchar(200),answer varchar(200))";
            dpoperations.setdataordelete(userTable,"User Table Created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
