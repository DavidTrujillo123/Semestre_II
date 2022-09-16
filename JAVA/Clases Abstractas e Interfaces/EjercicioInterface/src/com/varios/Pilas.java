/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

public class Pilas implements Estructuras{
    private Object[] pila;

    public Pilas(int tamanio) {
        this.pila = new Object[tamanio];
    }
    
    @Override
    public boolean EstaVacia() {
        for (int i = 0; i < pila.length; i++) {
            if(pila[i] != null) return false;
        }
        return true;
    }

    @Override
    public Object Extraer(){
        if(EstaVacia()){
            return null;
        }
        else{
            Object aux;
            aux = pila[0];
            for (int i = 1; i < pila.length; i++) {
                pila[i-1] = pila[i];
            }
            pila[pila.length-1] = null;
            return aux;
        }
    }
    
    @Override
    public Object Primero() {
        if(EstaVacia()){
            return null;
        }
        else{
            Object aux = null;
            for (int i = pila.length -1; i >= 0; i--) {
                if(pila[i]!=null){
                    aux = pila[i];
                    i = -1;
                }
            }
            return aux;
        }
    }

    @Override
    public void Añadir(Object obj) {
        int aux = -1;
        if(EstaVacia()){
            pila[pila.length-1] = obj;
        }
        else{
            for (int i = 0; i < pila.length; i++) {
                if(pila[i]!=null){
                    aux = i;
                    i = pila.length;
                }
            }
            pila[aux-1] = obj;
        }
    }
    
    @Override
    public String toString(){
        String c = "";
        for (Object object : pila) {
            c+= "  "+object;
        }
        return c;
    }
}
