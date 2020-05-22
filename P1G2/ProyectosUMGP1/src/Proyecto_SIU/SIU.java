/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_SIU;

import controlador.ctrAlumno;
import modelo.Alumno;
import modelo.consultasAlumnos;
import vista.mantenimientoAlumnos;

/**
 *
 * @author EMMmr
 */
public class SIU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno mod=new Alumno();
        consultasAlumnos modC= new consultasAlumnos();
        mantenimientoAlumnos mnt=new mantenimientoAlumnos();
        
        ctrAlumno ctr=new ctrAlumno(mod, modC, mnt);
        ctr.iniciar();
        mnt.setVisible(true);
        
    }
    
}
