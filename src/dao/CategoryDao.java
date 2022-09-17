/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Category;
/**
 *
 * @author omar
 */
public class CategoryDao {
    public static void save(Category category){
        String query ="insert into category (name) values('"+category.getName()+"')";
        dpoperations.setdataordelete(query, "Category Added successfully");
    }
}
