/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Inicial {
    public static void ImprimirTorres(Stack torre1, Stack torre2, Stack torre3){
        System.out.println("1."+torre1.Imprimir()+"\n2."+torre2.Imprimir()+"\n3."+torre3.Imprimir());
        System.out.println("-------------------------------------------------");
    }
    public static void Imprimir(Torre t1, Torre t2, Torre t3){
        System.out.println("1."+t1.toString()+"\n2."+t2.toString()+"\n3."+t3.toString());
        System.out.println("--------------------------------------------------");
    }
    public static void main(String[] args) {

//   
//        Bloque1 b1 = new Bloque1(60, 200, 85, 50);
//        Bloque1 b2 = new Bloque1(35, 250, 135, 50);
//        Bloque1 b3 = new Bloque1(10, 300, 185, 50);
//        Bloque1 aux;
//
//        Torre t1 = new Torre(3);
//        Torre t2 = new Torre(3);
//        Torre t3 = new Torre(3);
//
//        t1.Apilar(b3);
//        t1.Apilar(b2);
//        t1.Apilar(b1);
//            
//        Imprimir(t1, t2, t3);
//           
//        t1.Mover(t2);
//        Imprimir(t1, t2, t3);
//        
//        t1.Mover(t3);
//        Imprimir(t1, t2, t3);
//        
//        t2.Mover(t1);
//        Imprimir(t1, t2, t3);
//        
       
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
}
