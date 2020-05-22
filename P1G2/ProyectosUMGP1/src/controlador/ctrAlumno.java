
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.consultasAlumnos;
import vista.mantenimientoAlumnos;


public class ctrAlumno implements ActionListener {
    
    private Alumno mod;
    private consultasAlumnos modC;
    private mantenimientoAlumnos mnt;
    
    public ctrAlumno(Alumno mod, consultasAlumnos modC, mantenimientoAlumnos mnt)
    {
        this.mod=mod;
        this.modC=modC;
        this.mnt=mnt;
        this.mnt.guardar.addActionListener(this);
        this.mnt.cambiar.addActionListener(this);
        this.mnt.eliminar.addActionListener(this);
        this.mnt.buscar.addActionListener(this);
        this.mnt.limpiar.addActionListener(this);
        
    }
    
    public void iniciar()
    {
        mnt.setTitle("Alumnos");
        mnt.setLocationRelativeTo(null);
        mnt.txtid.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mnt.guardar)
        {
            mod.setCarnet(Integer.parseInt(mnt.carnet.getText()));
            mod.setNombre(mnt.nombre.getText());
            mod.setApellido(mnt.apellido.getText());
            mod.setEmail(mnt.correo.getText());
            mod.setCiclo(Integer.parseInt(mnt.carnet.getText()));
            
            if (modC.registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if(e.getSource()==mnt.cambiar)
        {
            mod.setId(Integer.parseInt(mnt.txtid.getText()));
            mod.setCarnet(Integer.parseInt(mnt.carnet.getText()));
            mod.setNombre(mnt.nombre.getText());
            mod.setApellido(mnt.apellido.getText());
            mod.setEmail(mnt.correo.getText());
            mod.setCiclo(Integer.parseInt(mnt.carnet.getText()));
            
            if (modC.modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if(e.getSource()==mnt.eliminar)
        {
            mod.setId(Integer.parseInt(mnt.txtid.getText()));
            
            if (modC.eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if(e.getSource()==mnt.buscar)
        {
            mod.setCarnet(Integer.parseInt(mnt.carnet.getText()));
            
            if (modC.buscar(mod))
            {
                
                mnt.txtid.setText(String.valueOf(mod.getId()));
                mnt.carnet.setText(String.valueOf(mod.getCarnet()));
                mnt.nombre.setText(mod.getNombre());
                mnt.apellido.setText(mod.getApellido());
                mnt.correo.setText(mod.getEmail());
                mnt.ciclo.setText(String.valueOf(mod.getCiclo()));

            }else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros");
                limpiar();
            }
        }
        
         if(e.getSource()==mnt.limpiar)
         {
             limpiar();
         }
        
    }
    
    public void limpiar()
    {
        mnt.txtid.setText(null);
        mnt.nombre.setText(null);
        mnt.apellido.setText(null);
        mnt.correo.setText(null);
        mnt.ciclo.setText(null);
        mnt.carnet.setText(null);
    }
    
}
