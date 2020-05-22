
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
    private Connection conn = null; 
    
    public Connection getConexion()//se crea un metodo tipo conexion para que regrese la conección - Jaqueline Carrera
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");//nombre del espacio que trae el conector - JackyCarrera
            conn = (Connection) DriverManager.getConnection(this.url, this.user, this.password);//se va realizar la coneccion con parametros por orden 
            
        } catch(SQLException e)//agrega una exepcion 
        {
            System.err.println(e);//va imprimir en pantalla
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return conn;  //me va a retornar la variable con 
    }
    public ResultSet consulta(String sql){//Jaqueline Carrera
        ResultSet res = null;
       try{
           PreparedStatement pstm = conn.prepareStatement(sql);
           res = pstm.executeQuery();
       } catch(SQLException e){//agrega una exepcion 
           System.err.println("Error consulta: "+ e.getMessage());
       }
         return res;
    }
    public DefaultComboBoxModel Obt_nombre(){//Jaqueline Carrera
        DefaultComboBoxModel Listamodelo = new DefaultComboBoxModel();
Listamodelo.addElement("Seleccione una clave");
ResultSet res = this.consulta("Select * from facultades order by nombre_facultad");
try{
    while(res.next()){
        Listamodelo.addElement(res.getString("nombre_facultad"));
        
    }
    res.close();
}catch(SQLException ex){
    System.err.println(ex.getMessage());
} return Listamodelo;
    }
}
    


