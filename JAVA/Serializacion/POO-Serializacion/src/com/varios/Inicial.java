/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.io.*;

public class Inicial implements Serializable{

    public static void main(String[] args) {
        Tienda[] tienda = new Tienda[2];
        tienda[0]= new Libros("HOLA BOLA", "ELVA LASO", 69);
        tienda[1]=new Discos("JUAN FEO", "PORQUE SOY FEO", 99.6);
        
        try{
            //Escribir
            ObjectOutputStream escribirFichero = new ObjectOutputStream(
                    new FileOutputStream("C:/Users/Asus/OneDrive/Escritorio/U/java_ser/tienda1.dat"));
            escribirFichero.writeObject(tienda);
            escribirFichero.close();
            
            //Recuperar
            ObjectInputStream recuperarFichero = new ObjectInputStream(
                    (new FileInputStream("C:/Users/Asus/OneDrive/Escritorio/U/java_ser/tienda1.dat"))); 
            
            Tienda[] objetosRecuperados = (Tienda[])recuperarFichero.readObject();
            recuperarFichero.close();
            
            for (Tienda objetosRecuperado : objetosRecuperados) {
                System.out.println(objetosRecuperado);
            }
            
        }catch(Exception e){
            
        }
    }
}
