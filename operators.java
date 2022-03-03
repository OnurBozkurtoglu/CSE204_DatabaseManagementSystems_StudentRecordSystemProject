
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class operators {
    
    
     
   

    public static Connection connect(){
        
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/highschooldb","root","");

        } catch (Exception e) {
            System.out.println("inter.operator.connect()");
            JOptionPane.showConfirmDialog(null,e);
        }


        return con;
    
}
}
