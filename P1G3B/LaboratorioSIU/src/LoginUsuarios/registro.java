//DIANA VICTORES --> CODIGO Y DISEÑO DE LOGIN Y REGISTRO Y REALIZACION DE CLASES
package LoginUsuarios;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;gi
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */

public class registro {
    
    Connection  conectar=null;
   
    
    public Connection conexion () throws SQLException {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/LabSIU","root","");
            
          // JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        } catch (ClassNotFoundException e) {
            
               JOptionPane.showMessageDialog(null,"Error de Conexion" + e.getMessage());
               
        }
       
       return conectar; 
    }
    
}
