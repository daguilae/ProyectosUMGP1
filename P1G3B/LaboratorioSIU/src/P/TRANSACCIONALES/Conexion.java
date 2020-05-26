
package P.TRANSACCIONALES;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class Conexion {
    
    private final String base = "Proyecto";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null; 
    
    public Connection getConexion()//se crea un metodo tipo conexion para que regrese la conección - Jaqueline Carrera
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");//nombre del espacio que trae el conector - JackyCarrera
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);//se va realizar la coneccion con parametros por orden 
            
        } catch(SQLException e)//agrega una exepcion 
        {
            System.err.println(e);//va imprimir en pantalla
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  //me va a retornar la variable con 
    }
    
}
    


