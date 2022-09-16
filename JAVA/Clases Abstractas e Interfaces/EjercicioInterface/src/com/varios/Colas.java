/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

public class Colas implements Estructuras{
    private Object[] colas;

    public Colas(Object[] colas) {
        this.colas = colas;
    }
    
    @Override
    public boolean EstaVacia() {
        for (Object cola : colas) {
            if (cola != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object Extraer() {
        if(EstaVacia()){
            return null;
        }
        else{
            Object aux = null;
            for (int i = colas.length-1; i >= 0; i--) {
                if(colas[i]!=null){
                    aux = colas[i];
                    colas[i]=null;
                    i = -1;
                }
            }
            return aux;
        }
    }

    @Override
    public Object Primero() {
        if(EstaVacia()){
            return null;
        }
        return colas[0];
    }

    @Override
    public void Añadir(Object obj) {
        int aux = -1;
        if(EstaVacia()){
            colas[colas.length-1] = obj;
        }
        else{
            for (int i = 0; i < colas.length; i++) {
                if(colas[i]!=null){
                    aux = i;
                    i = colas.length;
                }
            }
            colas[aux-1] = obj;
        }
    }
    
}
