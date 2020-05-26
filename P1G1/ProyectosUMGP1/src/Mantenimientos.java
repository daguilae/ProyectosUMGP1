
/**
 *
 * @author Tobar Arèvalo
 */

import Modelo.UsuariosU;
public class Mantenimientos extends javax.swing.JFrame {
UsuariosU mod;


    //JinternalFran para registros
    private RegistroA NuevaVentana;//se declaran variables para la visibilidad de los JinternalFran
    private RegistroMaestro ventana;
    private RegistroFacultades ventanafac;
    private RegistroCarreras ventanacarr;
    private RegistroCursos ventanacur;

    private RegistroSedes ventanasede;
    private RegistroAula ventanaaula;
    private RegistroJornadas ventanajor;
    private RegistroSecciones ventanasec;
    //JinternalFran para modificaciones
    private ModificacionAlumnos ventanaModAlum;
    private ModificacionMaestro ventanaModMaes;
    private ModificacionFacultades ventanaModFacul;
    private ModificacionCarreras ventanaModCarr;
    private ModificacionCursos ventanaModcur;
    private ModificacionSedes ventanaModSede;
    private ModificacionAulas ventanaModAula;
    private ModificacionJornadas ventanaModJornada;
    private ModificacionSecciones ventanaModSec;

    //JInternalFrame para asignacion de cursos a alumnos
    private ADCA ventanaasignacion;

   
  public Mantenimientos() {
  initComponents();
  
   
    }
    Mantenimientos(UsuariosU mod) {
    initComponents();
    //* creado por Nayre
    
    ///* aqui se declaran ventanas de mantenimiento se veran en cada usuario y administrador 
    setLocationRelativeTo(null);
    this.mod = mod;


    if (mod.getIdTipo() == 2) {   //* se declaran la llamada de las ventanas al Admin
     jMenu1.setVisible(true);
    ModificarAlumno.setVisible(true);
    jMenu5.setVisible(true);
    jMenu3.setVisible(true);
    }else{
         jMenu1.setVisible(true);     //* creado por Nayre
    ModificarAlumno.setVisible(true);
    jMenu5.setVisible(true);
    jMenu3.setVisible(true);
    }
       if (mod.getIdTipo() == 1) {   //* se declaran la llamada de las ventanas al Admnin
     jMenu1.setVisible(true);
    ModificarAlumno.setVisible(true);
    jMenu5.setVisible(true);
    jMenu3.setVisible(true);
    }else{
         jMenu1.setVisible(false);
    ModificarAlumno.setVisible(false);
    jMenu5.setVisible(true);
    jMenu3.setVisible(true);
    }
           if (mod.getIdTipo() == 3) {   //* se declaran la llamada de las ventanas al usuario 2
     jMenu1.setVisible(false);
    jMenu3.setVisible(false);
    }else{
         jMenu1.setVisible(true);
    jMenu3.setVisible(true);
    }

    if (mod.getIdTipo() == 1) {   //* se declaran la llamada de las ventanas al Admnin
    NuevaVentana.setVisible(true);
    ventana.setVisible(true);
    ventanafac.setVisible(true);
    ventanacarr.setVisible(true);
    ventanacur.setVisible(true);  ///* Creado por Nayre
    ventanasede.setVisible(true);
     
            ventanaaula.setVisible(true);
            ventanajor.setVisible(true);
            ventanasec.setVisible(true); 
            
            ventanaModAlum.setVisible(true);
            ventanaModMaes.setVisible(true);
            ventanaModFacul.setVisible(true);
            ventanaModCarr.setVisible(true);
            ventanaModcur.setVisible(true);
            ventanaModSede.setVisible(true);
            ventanaModAula.setVisible(true);
            ventanaModJornada.setVisible(true);
            ventanaModSec.setVisible(true);
            
           
            
        } 
      else {
            NuevaVentana.setVisible(false);
           ventana.setVisible(false);
           ventanafac.setVisible(false);
           ventanacarr.setVisible(false);
           ventanacur.setVisible(false);
           
         ventanasede.setVisible(false);
           ventanaaula.setVisible(false);
           ventanajor.setVisible(false);
           ventanasec.setVisible(false);   
           
           ventanaModAlum.setVisible(false);
            ventanaModMaes.setVisible(false);
            ventanaModFacul.setVisible(false);
            ventanaModCarr.setVisible(false);
            ventanaModcur.setVisible(false);
            ventanaModSede.setVisible(false);
            ventanaModAula.setVisible(false);
            ventanaModJornada.setVisible(false);
            ventanaModSec.setVisible(false);
        }  
       if (mod.getIdTipo() == 2) {
            ventanasede.setVisible(true);
            ventanaaula.setVisible(true);
            ventanajor.setVisible(true);
            ventanasec.setVisible(true);  
            
              } 
      else {
            ventanasede.setVisible(false);
           ventanaaula.setVisible(false);
           ventanajor.setVisible(false);
           ventanasec.setVisible(false);
           
        }  
              
        
        if (mod.getIdTipo() == 3) {
            ventanaModAlum.setVisible(true);
            ventanaModMaes.setVisible(true);
            ventanaModFacul.setVisible(true);
            ventanaModCarr.setVisible(true);
            ventanaModcur.setVisible(true);
            ventanaModSede.setVisible(true);
            ventanaModAula.setVisible(true);
            ventanaModJornada.setVisible(true);
            ventanaModSec.setVisible(true);
            } 
      else {
           ventanaModAlum.setVisible(false);
            ventanaModMaes.setVisible(false);
            ventanaModFacul.setVisible(false);
            ventanaModCarr.setVisible(false);
            ventanaModcur.setVisible(false);
            ventanaModSede.setVisible(false);
            ventanaModAula.setVisible(false);
            ventanaModJornada.setVisible(false);
            ventanaModSec.setVisible(false);
        }  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RegistroAlumno = new javax.swing.JMenuItem();
        RegistroMaestro = new javax.swing.JMenuItem();
        RegistrarFacultad = new javax.swing.JMenuItem();
        RegistrarCarrera = new javax.swing.JMenuItem();
        RegistroCurso = new javax.swing.JMenuItem();
        RegistrarSede = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        ModificarAlumno = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        ModificarMaestro = new javax.swing.JMenuItem();
        ModiificarFacultad = new javax.swing.JMenuItem();
        ModificarCarrera = new javax.swing.JMenuItem();
        ModificarCurso = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Asignacion = new javax.swing.JMenuItem();
        EliminarMaestro1 = new javax.swing.JMenuItem();
        EliminarFacultad1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        SalirPrograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 0));

        jMenu1.setBackground(new java.awt.Color(0, 255, 204));
        jMenu1.setText("Registrar");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        RegistroAlumno.setText("Registrar Alumno");
        RegistroAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroAlumno);

        RegistroMaestro.setText("Registrar Maestro");
        RegistroMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroMaestroActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroMaestro);

        RegistrarFacultad.setText("Registrar Facultad");
        RegistrarFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarFacultadActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarFacultad);

        RegistrarCarrera.setText("Registrar Carrera");
        RegistrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarCarreraActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarCarrera);

        RegistroCurso.setText("Registrar Curso");
        RegistroCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroCursoActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroCurso);

        RegistrarSede.setText("Registrar Sede");
        RegistrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSedeActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarSede);

        jMenuItem1.setText("Registrar Aula");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Registrar Secciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Registrar Jornada");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        ModificarAlumno.setBackground(new java.awt.Color(51, 255, 204));
        ModificarAlumno.setText("Modificar");
        ModificarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setText("Modificar Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ModificarAlumno.add(jMenuItem2);

        ModificarMaestro.setText("Modificar Maestro");
        ModificarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMaestroActionPerformed(evt);
            }
        });
        ModificarAlumno.add(ModificarMaestro);

        ModiificarFacultad.setText("Modificar Facultad");
        ModiificarFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModiificarFacultadActionPerformed(evt);
            }
        });
        ModificarAlumno.add(ModiificarFacultad);

        ModificarCarrera.setText("Modificar Carrera");
        ModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCarreraActionPerformed(evt);
            }
        });
        ModificarAlumno.add(ModificarCarrera);

        ModificarCurso.setText("Modificar Curso");
        ModificarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCursoActionPerformed(evt);
            }
        });
        ModificarAlumno.add(ModificarCurso);

        jMenuItem5.setText("Modificar Sede");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        ModificarAlumno.add(jMenuItem5);

        jMenuItem6.setText("Modificar Aula");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        ModificarAlumno.add(jMenuItem6);

        jMenuItem7.setText("Modificar Seccion");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        ModificarAlumno.add(jMenuItem7);

        jMenuItem8.setText("Modificar Jornadas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        ModificarAlumno.add(jMenuItem8);

        jMenuBar1.add(ModificarAlumno);

        jMenu5.setBackground(new java.awt.Color(51, 255, 204));
        jMenu5.setText("Asignacion");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Asignacion.setText("Asignar Alumno");
        Asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionActionPerformed(evt);
            }
        });
        jMenu5.add(Asignacion);

        EliminarMaestro1.setText("Asignar Maestro");
        EliminarMaestro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarMaestro1ActionPerformed(evt);
            }
        });
        jMenu5.add(EliminarMaestro1);

        EliminarFacultad1.setText("Asignar Nota");
        jMenu5.add(EliminarFacultad1);

        jMenuBar1.add(jMenu5);

        jMenu3.setForeground(new java.awt.Color(204, 0, 0));
        jMenu3.setText("Salir");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        SalirPrograma.setText("Salir");
        SalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirProgramaActionPerformed(evt);
            }
        });
        jMenu3.add(SalirPrograma);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //los registros, modificaciones y bajas de las tablas alumnos, maestros, facultad, carrera, curso fueron creados
    //por Fernando Tobar
    private void RegistroAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroAlumnoActionPerformed
        // TODO add your handling code here:
        NuevaVentana = new RegistroA();
        jDesktopPane1.add(NuevaVentana);//Codigo para hacer visible JinternalFrame(RegistroA Alumno)
    }//GEN-LAST:event_RegistroAlumnoActionPerformed

    private void ModificarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCursoActionPerformed
        // TODO add your handling code here:
        ventanaModCarr = new ModificacionCarreras();
        jDesktopPane1.add(ventanaModCarr);//Codigo para hacer visible JinternalFrame(Modificacion Cursos)
    }//GEN-LAST:event_ModificarCursoActionPerformed

    private void SalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirProgramaActionPerformed
         // TODO add your handling code here:
         dispose();//Codigo  para  salir del Programa
    }//GEN-LAST:event_SalirProgramaActionPerformed

    private void RegistroMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroMaestroActionPerformed
        // TODO add your handling code here:
        ventana = new RegistroMaestro();
        jDesktopPane1.add(ventana);//Codigo para hacer visible JinternalFrame(RegistroA Maestro)
    }//GEN-LAST:event_RegistroMaestroActionPerformed

    private void RegistrarFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarFacultadActionPerformed
        // TODO add your handling code here:
         ventanafac = new RegistroFacultades();
        jDesktopPane1.add(ventanafac);//Codigo para hacer visible JinternalFrame(RegistroA Maestro)
        
    }//GEN-LAST:event_RegistrarFacultadActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void RegistrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCarreraActionPerformed
        // TODO add your handling code here:
        ventanacarr = new RegistroCarreras();
        jDesktopPane1.add(ventanacarr);//Codigo para hacer visible JinternalFrame(RegistroA Maestro)
    }//GEN-LAST:event_RegistrarCarreraActionPerformed

    private void ModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCarreraActionPerformed
        // TODO add your handling code here:
        ventanaModCarr = new ModificacionCarreras();
        jDesktopPane1.add(ventanaModCarr);//Codigo para hacer visible JinternalFrame(Modificacion Carreras)
    }//GEN-LAST:event_ModificarCarreraActionPerformed

    private void RegistroCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroCursoActionPerformed
        // TODO add your handling code here:
        ventanacur = new RegistroCursos();
        jDesktopPane1.add(ventanacur);//Codigo para hacer visible JinternalFrame(RegistroA Maestro)
    }//GEN-LAST:event_RegistroCursoActionPerformed

    private void EliminarMaestro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarMaestro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarMaestro1ActionPerformed

    private void AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionActionPerformed
        ventanaasignacion = new ADCA();
        jDesktopPane1.add(ventanaasignacion);
    }//GEN-LAST:event_AsignacionActionPerformed

    private void RegistrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSedeActionPerformed
        // TODO add your handling code here:
        ventanasede = new RegistroSedes();
        jDesktopPane1.add(ventanasede);
    }//GEN-LAST:event_RegistrarSedeActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
          ventanajor = new RegistroJornadas();
        jDesktopPane1.add(ventanajor);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          ventanasec = new RegistroSecciones();
        jDesktopPane1.add(ventanasec);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          ventanaaula = new RegistroAula();
        jDesktopPane1.add(ventanaaula);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ventanaModAlum = new ModificacionAlumnos();
        jDesktopPane1.add(ventanaModAlum);//Codigo para hacer visible JinternalFrame(Modificacion Alumnos)
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ventanaModSede = new ModificacionSedes();
        jDesktopPane1.add(ventanaModSede);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        ventanaModSec = new ModificacionSecciones();
        jDesktopPane1.add(ventanaModSec);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ventanaModAula = new ModificacionAulas();
        jDesktopPane1.add(ventanaModAula);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ventanaModJornada = new ModificacionJornadas();
        jDesktopPane1.add(ventanaModJornada);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void ModificarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMaestroActionPerformed
        // TODO add your handling code here:
        ventanaModMaes = new ModificacionMaestro();
        jDesktopPane1.add(ventanaModMaes);//Codigo para hacer visible JinternalFrame(Modificacion Maestros)
    }//GEN-LAST:event_ModificarMaestroActionPerformed

    private void ModiificarFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModiificarFacultadActionPerformed
        // TODO add your handling code here:
        ventanaModFacul = new ModificacionFacultades();
        jDesktopPane1.add(ventanaModFacul);//Codigo para hacer visible JinternalFrame(Modificacion Facultades)
    }//GEN-LAST:event_ModiificarFacultadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asignacion;
    private javax.swing.JMenuItem EliminarFacultad1;
    private javax.swing.JMenuItem EliminarMaestro1;
    private javax.swing.JMenu ModificarAlumno;
    private javax.swing.JMenuItem ModificarCarrera;
    private javax.swing.JMenuItem ModificarCurso;
    private javax.swing.JMenuItem ModificarMaestro;
    private javax.swing.JMenuItem ModiificarFacultad;
    private javax.swing.JMenuItem RegistrarCarrera;
    private javax.swing.JMenuItem RegistrarFacultad;
    private javax.swing.JMenuItem RegistrarSede;
    private javax.swing.JMenuItem RegistroAlumno;
    private javax.swing.JMenuItem RegistroCurso;
    private javax.swing.JMenuItem RegistroMaestro;
    private javax.swing.JMenuItem SalirPrograma;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
