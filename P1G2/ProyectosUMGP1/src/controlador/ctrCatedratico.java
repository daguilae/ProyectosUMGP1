
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Catedratico;
import modelo.consultasCatedratico;
import vista.mantenimientoCatedraticos;


public class ctrCatedratico implements ActionListener {
    
    private Catedratico mod;
    private consultasCatedratico modC;
    private mantenimientoCatedraticos mnt;
    
    public ctrCatedratico(Catedratico mod, consultasCatedratico modC, mantenimientoCatedraticos mnt)
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
        mnt.setTitle("Catedraticos");
        mnt.setLocationRelativeTo(null);
        mnt.txtid.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mnt.guardar)
        {
            mod.setCodigo(Integer.parseInt(mnt.codigo.getText()));
            mod.setNombre(mnt.nombre.getText());
            mod.setApellido(mnt.apellido.getText());
            mod.setEmail(mnt.correo.getText());
            mod.setCurso(mnt.curso.getText());
            
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
            mod.setCodigo(Integer.parseInt(mnt.codigo.getText()));
            mod.setNombre(mnt.nombre.getText());
            mod.setApellido(mnt.apellido.getText());
            mod.setEmail(mnt.correo.getText());
            mod.setCurso(mnt.curso.getText());
            
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
            mod.setCodigo(Integer.parseInt(mnt.codigo.getText()));
            
            if (modC.buscar(mod))
            {
                
                mnt.txtid.setText(String.valueOf(mod.getId()));
                mnt.codigo.setText(String.valueOf(mod.getCodigo()));
                mnt.nombre.setText(mod.getNombre());
                mnt.apellido.setText(mod.getApellido());
                mnt.correo.setText(mod.getEmail());
                mnt.curso.setText(String.valueOf(mod.getCurso()));

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
        mnt.curso.setText(null);
        mnt.codigo.setText(null);
    }
    
}
