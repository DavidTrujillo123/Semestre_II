/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Plantas extends SerVivo{

    public Plantas(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public String Alimentarse() {
        return "Me alimento por medio de la fotosintesis";
    }
    
    
}
