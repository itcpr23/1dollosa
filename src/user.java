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
public class user {
    connect conn = new connect();
    
    
    public int reg(String username, String password, String firstname, String lastname){int x=0;
        try {
            Class.forName(conn.forname());
            Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
            
            PreparedStatement ps = con.prepareStatement("select * from bsit23 where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                x=-1;
            }
            else{
              PreparedStatement ps1 = con.prepareStatement("insert into bsit23 values(null,?,?,?,?)");
              ps1.setString(1,firstname);
              ps1.setString(2, lastname);
              ps1.setString(3, username);
              ps1.setString(4, password);
              ps1.executeUpdate();
              x=1;
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    
    
    
    
    
    public int enter(String username, String password){int x=0;
        try {
            Class.forName(conn.forname());
            Connection con = DriverManager.getConnection(conn.driver(),conn.uname(),conn.upass());
            
            PreparedStatement ps = con.prepareStatement("select * from bsit23 where username = ? and password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               x=1;
            }
            else{
             x=-1;
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    
}
