/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Nota {
    public int nota;

    public Nota(int nota) throws ExcepcionPersonalizada
    {
        if((nota >=0) && (nota <=10))
            this.nota = nota;
        else{
            throw new ExcepcionPersonalizada("Ingrese una nota valida");
        }
    }
    public boolean Longitud(String str) throws ExcepcionPersonalizada{
        if(str.length()<=10){
            return true;
        }
        else{
            throw  new ExcepcionPersonalizada("Longitud fuera de rango");
        }
    }
}
