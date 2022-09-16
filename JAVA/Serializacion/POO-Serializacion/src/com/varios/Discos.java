/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.io.*;
import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Discos extends Tienda{

    private transient double precio;

    public Discos(String artista, String titulo,double precio) {
        super(titulo, titulo);
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return super.toString()+" precio="+precio;
    }

}
