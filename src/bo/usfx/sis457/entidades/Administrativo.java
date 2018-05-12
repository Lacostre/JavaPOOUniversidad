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
public class Administrativo extends Persona {
    protected String Cargo;
    protected String Lugar_de_trabajo;
    protected Calendar FechaIngreso;
  
    
    public Administrativo(String cargo,String carnetIdentidad, String nombre, String Lugar_de_trabajo,Calendar fechaNacimiento, Calendar fechaIngreso) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.Lugar_de_trabajo = Lugar_de_trabajo;
        this.FechaIngreso = fechaIngreso;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugar_de_trabajo() {
        return Lugar_de_trabajo;
    }

    public void setLugar_de_trabajo(String Lugar_de_trabajo) {
        this.Lugar_de_trabajo = Lugar_de_trabajo;
    }
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", Fecha_de_Nacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Fecha_de_Ingreso=" + Utilitarios.getFechaCalendario(this.FechaIngreso)
                + ", Cargo=" + Cargo + ", Lugar_de_trabajo=" + Lugar_de_trabajo + '}';
    }
    
}