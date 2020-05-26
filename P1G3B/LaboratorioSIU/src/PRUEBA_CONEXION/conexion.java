//DIANA VICTORES --> CODIGO Y DISEÑO DE LOGIN Y REGISTRO Y REALIZACION DE CLASES
package PRUEBA_CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;




public class conexion {
    Connection conectar=null;
    
            public Connection conexion (){
        try {
           Class.forName("com.mysql.jdbc.Driver");
            
            conectar=(Connection)DriverManager.getConnection ("jdbc:mysql://localhost/pro", "root","");
            
          //JOptionPane.showMessageDialog (null,"Conexion Exitosa");
            
        } catch (Exception e){
            
              JOptionPane.showMessageDialog (null,"Error de Conexion" + e.getMessage ());
        }
        return conectar;
        
        }       
    
}
