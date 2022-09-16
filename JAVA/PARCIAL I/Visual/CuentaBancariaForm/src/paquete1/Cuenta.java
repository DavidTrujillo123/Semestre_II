/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Cuenta {
    private String nombre;
    private Fecha fechaCreacion;
    private Fecha fechaNacimiento;
    private double saldo;
    private static double saldoMinimo = 20;
    
    public void FechaCreacion(){
        int dia = LocalDate.now().getDayOfMonth();
        int mes = LocalDate.now().getMonthValue();
        int anio = LocalDate.now().getYear();
        if(fechaCreacion == null) fechaCreacion = new Fecha(dia, mes, anio);
        else {
            this.fechaCreacion.setDia(dia);
            this.fechaCreacion.setMes(mes);
            this.fechaCreacion.setAnio(anio);
        }
    }
    public Cuenta(String nombre, int diaNacimiento, int mesNacimiento, int anioNacimiento, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        fechaNacimiento = new Fecha(diaNacimiento, mesNacimiento, anioNacimiento);
        FechaCreacion();
        
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaNacimiento(int dia, int mes, int anio){
        this.fechaNacimiento.setDia(dia);
        this.fechaNacimiento.setMes(mes);
        this.fechaNacimiento.setAnio(anio);
    }
    public Fecha getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getSaldo(){
        return this.saldo+"";
    }
    public void Depositar(double cantidad){
        if (cantidad > 0) this.saldo += cantidad;
    }
    public boolean Retirar(double cantidad){
        if(this.saldo >= Cuenta.saldoMinimo + cantidad && cantidad>0){
            this.saldo-=cantidad;
            return true;
        }      
        else return false;
    }
    
    public String ImprimirDatos(){
        return "Fecha de creacion: "+fechaCreacion.Imprimir()
                +"\nNombre: "+this.nombre
                +"\nFecha de nacimiento: "+fechaNacimiento.Imprimir();        
    }
    public String ImprimirSaldo(){
        return "Saldo disponible: "+this.saldo+"$\n";
    }
}
