/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Jacky
 */
public class Carreras extends javax.swing.JInternalFrame {
FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Carreras
     */
    public Carreras() {
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcarrera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfacultad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtestatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        bus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Codigo Carrera");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Carrera");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Codigo Facultad");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Estatus Carrera");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bus.setBackground(new java.awt.Color(255, 204, 204));
        bus.setText("Buscar");
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("MANTENIMIENTO DE CARRERAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(bus))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bus)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //MANTENIMINETO DE CARRERA REALIZADO POR LUIS SOSA A LAS 12:30 PM
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto1", "root", "");//conecta a MYSQL
            PreparedStatement pst = cn.prepareStatement("insert into carreras1 values(?,?,?,?)");//Inserta los datos en la tabla
           
            pst.setString(1, txtcodigo.getText().trim());//Codigo
            pst.setString(2, txtcarrera.getText().trim());//Nombre
            pst.setString(3, txtfacultad.getText().trim());//Facultad
            pst.setString(4, txtestatus.getText().trim());//Estatus
            pst.executeUpdate();
            
            txtcodigo.setText("");//Se limpia el txt
            txtcarrera.setText("");//Se limpia el txt
            txtfacultad.setText("");//Se limpia el txt
            txtestatus.setText("");//Se limpia el txt
           
            label1.setText("La carrera se registró");//Mensaje que aparecera en pantalla al momento de que ingrese datos a la base de datos

        }catch (Exception e){
            //e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto1", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from carreras1 where codigo_carrera = ?");

            pst.setString(1, Buscar.getText().trim());
            pst.executeUpdate();

            txtcodigo.setText("");
            txtcarrera.setText("");
            txtfacultad.setText("");
            txtestatus.setText("");
            label1.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from carreras1 where codigo_carrera = ?");
            pst.setString(1, Buscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcodigo.setText(rs.getString("codigo_carrera"));//Se unen los campos de la tabla(MYSQL) a los de JAVA
                txtcarrera.setText(rs.getString("nombre_carrera"));
                txtfacultad.setText(rs.getString("codigo_facultad"));
                txtestatus.setText(rs.getString("estatus_carrera"));

            } else {
                JOptionPane.showMessageDialog(null, "Carrera no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_busActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       try {
            String Codigo = Buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto1", "root", "");
            PreparedStatement pst = cn.prepareStatement("update carreras1 set codigo_carrera= ?,nombre_carrera = ?,codigo_facultad = ?,estatus_carrera=? where codigo_carrera = "+ Codigo);

           pst.setString(1, txtcodigo.getText().trim());//Codigo
            pst.setString(2, txtcarrera.getText().trim());//Nombre
            pst.setString(3, txtfacultad.getText().trim());//Facultad
            pst.setString(4, txtestatus.getText().trim());//Estatus
           label1.setText("La carrera se modifico");
            pst.executeUpdate();
           
           
        }catch (Exception e) {
            
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton bus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestatus;
    private javax.swing.JTextField txtfacultad;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/CONTENEDORMDI/fondonaranja.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        
    }
}
}
