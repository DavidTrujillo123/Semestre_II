/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HP
 */
public class Empleado implements Serializable{
    
 

    private String nombre;
    protected double sueldos;
    private Date fechaContrato;

    public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
        this.nombre = nombre;
        this.sueldos = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
        fechaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldos;
    }

    public void setSueldo(double sueldo) {
        this.sueldos = sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public void SubirSueldo(double porcentaje) {
        double aumento = sueldos * porcentaje / 100;
        sueldos += aumento;
    }
    
@Override
    public String toString() {
        return " Mi nombre es " + nombre + " ,tengo un sueldo de " + sueldos + " , fecha de contrato: " + fechaContrato;
    }

}
