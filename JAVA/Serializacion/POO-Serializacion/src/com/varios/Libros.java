/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.io.*;

public class Libros extends Tienda{
    private int pagina;
    public Libros(String titulo, String autor, int pagina) {
        super(titulo, autor);
        this.pagina = pagina;
    }

    public int getPagina() {
        return pagina;
    }

    @Override
    public String toString() {
        return super.toString()+"pagina ="+pagina;
    }   
}
