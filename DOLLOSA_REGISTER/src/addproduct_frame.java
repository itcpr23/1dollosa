
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class addproduct_frame {
conn cn = new conn();

 
public int addproduct(String prname, int prqty, Float prprice){
    int z = 0;
    String sql= "insert into product values (null,?,?,?)";
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(cn.url,cn.username,cn.password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, prname);
        ps.setInt(2, prqty);
        ps.setFloat(3, prprice);
        z= ps.executeUpdate();
        
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
    }
return z;
}
}
