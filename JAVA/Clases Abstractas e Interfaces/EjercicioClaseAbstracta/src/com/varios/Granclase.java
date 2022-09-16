/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Granclase extends Tarifa{
    protected double propina;

    public Granclase(double propina, double tarifa) {
        super(tarifa);
        this.propina = propina;
    }
    
    @Override
    public String CalcularCoste() {
        return "Su tipo de pago es tarjeta el precio a pagar es "+tarifa
                +" mas un 50% de coste y propina: " + ((tarifa*1.5)+propina); 
    }

    @Override
    public String CalcularImportancia() {
        return "Niver de importancia: "+75;
    }
}
