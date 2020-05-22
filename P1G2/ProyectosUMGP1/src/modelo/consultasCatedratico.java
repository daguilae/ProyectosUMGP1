
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class consultasCatedratico extends Conexion2 {
    
    public boolean registrar(Catedratico cat)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="INSERT INTO alumnos (Nombres:, Apellidos:, Correo:, Curso:) VALUES (?,?,?,?)";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setString(1, cat.getNombre());
            ps.setString(2, cat.getApellido());
            ps.setString(3, cat.getEmail());
            ps.setString(4, cat.getCurso());
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
    
     public boolean modificar(Catedratico cat)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="UPDATE catedraticos SET Nombres:=?, Apellidos:=?, Correo:=?, Curso:=? WHERE codigo:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setString(1, cat.getNombre());
            ps.setString(2, cat.getApellido());
            ps.setString(3, cat.getEmail());
            ps.setString(4, cat.getCurso());
            ps.setInt(5, cat.getCodigo());
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
    
      public boolean eliminar(Catedratico cat)
    {
        PreparedStatement ps=null;
        Connection con=getConexion2();
        
        String sql="DELETE FROM catedraticos WHERE codigo:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setInt(1, cat.getCodigo());
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
     
     public boolean buscar(Catedratico cat)
    {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConexion2();
        
        String sql="SELECT * FROM catedraticos WHERE codigo:=?";
        
        try{
            
            ps=con.prepareStatement (sql);
            ps.setInt(1, cat.getCodigo());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                cat.setCodigo(Integer.parseInt(rs.getString("codigo:")));
                cat.setNombre(rs.getString("Nombres:"));
                cat.setApellido(rs.getString("Apellidos:"));
                cat.setEmail(rs.getString("Correo:"));
                cat.setCurso(rs.getString("Curso:"));
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
