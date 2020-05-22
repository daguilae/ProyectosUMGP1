
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class consultasAlumnos extends Conexion2 {
    
    public boolean registrar(Alumno alum)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="INSERT INTO alumnos (Nombres:, Apellidos:, Correo:, Ciclo:) VALUES (?,?,?,?)";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setString(1, alum.getNombre());
            ps.setString(2, alum.getApellido());
            ps.setString(3, alum.getEmail());
            ps.setInt(4, alum.getCiclo());
            ps.execute();
            return true;
            
        } catch (SQLException e){
        System.err.println(e);
        return false;
            } finally{
            try{
                con.close();
            } catch (SQLException e){
                 System.err.println(e);
            }
        }
                
    }
    
     public boolean modificar(Alumno alum)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="UPDATE alumnos SET Nombres:=?, Apellidos:=?, Correo:=?, Ciclo:=? WHERE Carnet:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setString(1, alum.getNombre());
            ps.setString(2, alum.getApellido());
            ps.setString(3, alum.getEmail());
            ps.setInt(4, alum.getCiclo());
            ps.setInt(5, alum.getCarnet());
            ps.execute();
            return true;
            
        } catch (SQLException e){
        System.err.println(e);
        return false;
            } finally{
            try{
                con.close();
            } catch (SQLException e){
                 System.err.println(e);
            }
        }
                
    }
    
      public boolean eliminar(Alumno alum)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="DELETE FROM alumnos WHERE Carnet:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setInt(1, alum.getCarnet());
            ps.execute();
            return true;
            
        } catch (SQLException e){
        System.err.println(e);
        return false;
            } finally{
            try{
                con.close();
            } catch (SQLException e){
                 System.err.println(e);
            }
        }
                
    }
     
     public boolean buscar(Alumno alum)
    {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConexion2();
        
        String sql="SELECT * FROM alumnos WHERE Carnet:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setInt(1, alum.getCarnet());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                alum.setCarnet(Integer.parseInt(rs.getString("Carnet:")));
                alum.setNombre(rs.getString("Nombres:"));
                alum.setApellido(rs.getString("Apellidos:"));
                alum.setEmail(rs.getString("Correo:"));
                alum.setCiclo(Integer.parseInt(rs.getString("Ciclo:")));
                return true;
                
            }
            
            return false;
            
        } catch (SQLException e){
        System.err.println(e);
        return false;
            } finally{
            try{
                con.close();
            } catch (SQLException e){
                 System.err.println(e);
            }
        }
                
    }  
      
}
