/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author MoNasr
 */
public class userdao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobilenumber,address,password,securityquestion,answer,states) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobilenumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityquestion() + "','" + user.getAnswer() + "','" + user.getStatus() + "')";
        dpoperations.setdataordelete(query, "Registered Successfully! Wait for Admin Approval");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = dpoperations.getdata("select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("states"));
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = dpoperations.getdata("select *from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityquestion(rs.getString("securityquestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email = '" + email + "'";
        dpoperations.setdataordelete(query, "password changed successfully");
    }
}
