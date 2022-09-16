/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.serializacion;

/**
 *
 * @author HP
 */
public class Administrador extends Empleado {
    
  

    private double incentivo;

    public Administrador(String nombre, double sueldos, int año, int mes, int dia) {
        super(nombre, sueldos, año, mes, dia);
        incentivo = 0;
    }

    @Override
    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return super.toString() + " Incentivo = " + incentivo;
    }

}
