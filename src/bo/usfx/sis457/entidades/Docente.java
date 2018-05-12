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
 * @author Marcelo
 */
public class Docente extends Persona {
    protected String[] Asignaturas;
    protected String Titulo;
    protected int AniosExp;
    
    public Docente(int exp, String asignaturas[], String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Asignaturas= asignaturas;
        this.Titulo = titulo;
        this.AniosExp = exp ;
    }

    public Docente(String asignaturas[], String titulo, int exp) {
        this.Asignaturas = asignaturas;
        this.Titulo = titulo;
        this.AniosExp=exp;
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String[] Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getExp() {
        return AniosExp;
    }

    public void setExp(int Exp) {
        this.AniosExp = Exp;
    }

    
    @Override
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", Anios de Experiecia=" + this.AniosExp 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Asignaturas=" + Asignaturas + ", Titulo=" + Titulo + '}';
    }
    
}
