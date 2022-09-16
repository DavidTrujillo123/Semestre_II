/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;


public class Inicial {
    
    public static void main(String[] args) {
        Integer n1 = 5;
        Integer n2 = 6;
        Integer n3 = 7;
        Integer n4 = 8;
        Integer n5 = 9;
        
        Object aux;
        Pilas p1 = new Pilas(4);
        Pilas1 p12 = new Pilas1(4);
        
        System.out.println(p1.EstaVacia());
        p1.Añadir(n1);
        p1.Añadir(n2);
        p1.Añadir(n3);
        p1.Añadir(n4);
        
        p12.Añadir(n1);
        p12.Añadir(n2);
        p12.Añadir(n3);
        p12.Añadir(n4);
        
        System.out.println(p1.toString());
        System.out.println("\n"+p12.toString());
        //aux = p1.Extraer();
        aux = p1.Primero();
        System.out.println(aux);
        System.out.println(p1.toString());
        
    }
    
}
