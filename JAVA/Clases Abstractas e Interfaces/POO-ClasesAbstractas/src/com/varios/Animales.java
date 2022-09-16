/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public abstract class Animales extends SerVivo{

    public Animales(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public String Dormir(){
        return "Durmiendo";
    }
    
}
