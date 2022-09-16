/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Inicial {
    public static void main(String[] args) {
        Turista t1 = new Turista(100);
        Preferente p1 = new Preferente("efectivo", 100);
        Granclase g1 = new Granclase(50, 100);
        
        System.out.println(t1.CalcularCoste() + "\n"+t1.CalcularImportancia()+"\n");
        System.out.println(p1.CalcularCoste() + "\n"+p1.CalcularImportancia()+"\n");
        System.out.println(g1.CalcularCoste() + "\n"+g1.CalcularImportancia()+"\n");
    }
}
