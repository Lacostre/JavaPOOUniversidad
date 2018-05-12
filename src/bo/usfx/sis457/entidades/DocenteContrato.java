/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author pablo
 */
public class DocenteContrato extends Docente{
    protected String NumContrato;
    public DocenteContrato(String numContrato, int exp, String[] asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(exp, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.NumContrato = numContrato;
    }

    public String getNumContrato() {
        return NumContrato;
    }

    public void setNumContrato(String NumContrato) {
        this.NumContrato = NumContrato;
    }
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre
                + ", Numero de Contrato=" + this.NumContrato
                + ", Anios de Experiecia=" + this.AniosExp 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Contrato=" + Asignaturas + ", Titulo=" + Titulo + '}';
    }
}
