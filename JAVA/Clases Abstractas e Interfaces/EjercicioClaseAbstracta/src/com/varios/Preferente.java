/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Preferente extends Tarifa{
    private String tipoDePago;

    public Preferente(String tipoDePago, double tarifa) {
        super(tarifa);
        this.tipoDePago = tipoDePago;
    }
 
    @Override
    public String CalcularCoste() {
        return "El tipo de pago es: "+tipoDePago+" el precio a pagar es "+tarifa
                +" mas un 30% de coste: " + tarifa*1.3;  
    }

    @Override
    public String CalcularImportancia() {
        return "Niver de importancia: "+30;
    }
    
}
