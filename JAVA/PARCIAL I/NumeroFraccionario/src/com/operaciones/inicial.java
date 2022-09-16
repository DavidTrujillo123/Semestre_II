/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.operaciones;

/**
 *
 * @author Asus
 */
public class inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccionario f1, f2, f3, f4;
        f1 = new Fraccionario(3, 4);
        f2 = new Fraccionario(6);

        System.out.println("fr 1 :" + f1.Imprimir());
        System.out.println("fr 2 :" + f2.Imprimir());
        
        f3 = f1.Suma(2, 5);
        f4 = f1.Resta(1,2);
        System.out.println("fr 3 Suma: "+f3.Imprimir());
        System.out.println("fr 4 Suma: "+f4.Imprimir());
        
    }

}
