/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class SQLAlumnos extends Conexion {
    public boolean registrarAlumnos(Alumnos alm){
        PreparedStatement ps = null;
        Connection conect = getConexion();
        String sql = "INSERT INTO alumnos VALUES (?,?,?,?,?,?)";
        try{
            ps=conect.prepareStatement(sql);
            ps.setString(1, alm.getCarnetAlumno());
            ps.setString(2, alm.getNombreAlumno());
            ps.setString(3, alm.getDireccionAlumno());
            ps.setString(4, alm.getTelefonoAlumno());
            ps.setString(5, alm.getEmailAlumno());
            ps.setString(6, alm.getEstAlumno());
            ps.execute();
            return true;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                conect.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public void mostrarRegistros(JTable tabla, String busqueda){
        Object[] modeloA = new Object[6];
        DefaultTableModel TModel = (DefaultTableModel) tabla.getModel();
        PreparedStatement ps = null;
        Connection conect = getConexion();
        String sql = "SELECT*FROM alumnos WHERE nombre_Alumno LIKE ?";
        try{
            ps=conect.prepareStatement(sql);
            ps.setString(1, "%" +busqueda+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                modeloA[0]=rs.getString("carnet_Alumno");
                modeloA[1]=rs.getString("nombre_Alumno");
                modeloA[2]=rs.getString("direccion_Alumno");
                modeloA[3]=rs.getString("telefono_Alumno");
                modeloA[4]=rs.getString("email_Alumno");
                modeloA[5]=rs.getString("Estatus_Alumno");
                TModel.addRow(modeloA);
            }
            tabla.setModel(TModel);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
