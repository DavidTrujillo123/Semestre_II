/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author Asus
 */

public class JavaApplication8 {

    public static void main(String[] args) {
        Vector3D vec1, vec2, vec3;
        vec1 = new Vector3D(new Punto(), new Punto(3, 3, 3));
        vec2 = new Vector3D(3, 3, 3);
        
        System.out.println("Vector 1 \n"+vec1.Imprimir());
        System.out.println("Norma: "+vec1.CalcularNorma());
        
        System.out.println("Vector 2 \n"+vec2.Imprimir());
        
        System.out.println(vec1.Comparar(vec2));
        
        vec3 = vec2.Sumar(vec1);
        System.out.println(vec3.Imprimir());
        
    }
    
}
