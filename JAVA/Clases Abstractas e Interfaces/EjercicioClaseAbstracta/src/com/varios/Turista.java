/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Turista extends Tarifa{

    public Turista(double tarifa) {
        super(tarifa);
    }
    
    @Override
    public String CalcularCoste() {
        return "El precio a pagar es "+tarifa+" mas un 12% de coste: "+tarifa*1.12;
    }

    @Override
    public String CalcularImportancia() {
        return "Nivel de importancia: "+10;
    }
}
