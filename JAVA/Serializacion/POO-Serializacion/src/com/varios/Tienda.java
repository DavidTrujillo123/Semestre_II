/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Tienda implements Serializable{
    private String titulo;
    private String autor;
    
    public Tienda(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor;
    }
  
}
