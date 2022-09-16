/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoeva;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class RepasoEva {

    
    public static void main(String[] args) {
        Vector3D v1,v2,v3;
        v1 = new Vector3D(0, -2, 0, 1, 1, 3);
        v2 = new Vector3D(new Punto(), new Punto(1, 1, 3));
       
        System.out.println(v1.Comparar(v2));
        
        v3 = v1.Sumar(v2);
        
        System.out.println(v3.Imprimir());
        System.out.println(v2.Imprimir());
        
    }
    
}
