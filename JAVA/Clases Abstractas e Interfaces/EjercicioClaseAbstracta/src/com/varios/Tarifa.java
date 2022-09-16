/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public abstract class Tarifa {
    protected double tarifa;
    
    public Tarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public abstract String CalcularCoste();
    public abstract String CalcularImportancia(); 
}
