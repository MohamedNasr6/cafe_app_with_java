/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
/**
 *
 * @author MoNasr
 */
public class userdao {
    public static void save(User user)
    {
        String query ="insert into user(name,email,mobilenumber,address,password,securityquestion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityquestion()+"','"+user.getAnswer()+"','"+user.getStatus()+",'";
        dpoperations.setdataordelete(query, "Registered Successfully! Wait for Admin Approval");
    }
}
