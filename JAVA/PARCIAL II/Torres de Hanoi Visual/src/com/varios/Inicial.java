/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Inicial {

    public static String Hanoi(int n, String origen, String aux, String destino){
        String r = "";
        if(n==1) r+= origen+"--->"+destino+"";
        else{
            r +=Hanoi(n-1, origen, destino, aux)+"\n";
            r+=origen+"--->"+destino+"\n";
            r+= Hanoi(n-1, aux, origen, destino)+"";
        }
        return r;
    }
    public static String Hanoi(int n, int origen, int aux, int destino){
        String r = "";
        if(n==1) r+= origen+"--->"+destino+"";
        else{
            r +=Hanoi(n-1, origen, destino, aux)+"\n";
            r+=origen+"--->"+destino+"\n";
            r+= Hanoi(n-1, aux, origen, destino)+"";
        }
        return r;
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });     
        
        
        
        
       // System.out.println(Hanoi(5, "origen", "aux", "destino"));
        System.out.println("");
        System.out.println(Hanoi(3, 1, 2, 3));
    }
    
}
