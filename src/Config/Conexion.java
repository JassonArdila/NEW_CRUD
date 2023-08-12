
package Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    public Connection getConnection(){
      return con;
    }
}
