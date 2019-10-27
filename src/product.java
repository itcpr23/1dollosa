/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aspire 3
 */
public class product {
     connect conn = new connect();
     
     
     public void addprod(String product, int quantity, int price){
         try {
             Class.forName(conn.forname());
             Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
             PreparedStatement ps = con.prepareStatement("insert into products values(null,?,?,?)");
             ps.setString(1, product);
             ps.setInt(2, quantity);
             ps.setInt(3, price);
             ps.executeUpdate();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
     
     public void delete(int id){
         try {
             Class.forName(conn.forname());
             Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
             PreparedStatement ps = con.prepareStatement("delete from products where id =?");
             ps.setInt(1, id);
             ps.executeUpdate();
            
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
     
     public void edit(int id,String product, int price){
         try {
             Class.forName(conn.forname());
             Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
             PreparedStatement ps = con.prepareStatement("update products set pname =? , pprice =? where id =?");
             ps.setString(1, product);
             ps.setInt(2, price);
             ps.setInt(3, id);
             ps.executeUpdate();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
         }
             
     }
     
     
      public void editqty(int id, int qty){
        try {
            Class.forName(conn.forname());
            Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
            PreparedStatement ps = con.prepareStatement("update products set pquantity = (pquantity+?) where id = ?");
            ps.setInt(1, qty);
            ps.setInt(2, id);
       
            ps.executeUpdate();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
