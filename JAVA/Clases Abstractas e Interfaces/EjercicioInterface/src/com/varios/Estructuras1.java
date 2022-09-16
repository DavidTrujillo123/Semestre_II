/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public abstract class Estructuras1 {
    protected Object[] estructura;

    public Estructuras1(int tamanio) {
        this.estructura = new Object[tamanio];
    }

    public Object[] getEstructura() {
        return estructura;
    }
    
    public boolean EstaVacia(){
        for (int i = 0; i < estructura.length; i++) {
            if(estructura[i] != null) return false;
        }
        return true;
    }
    public abstract Object Extraer();
    public abstract Object Primero();
    public void Añadir(Object obj){
        int aux = -1;
        if(EstaVacia()){
            estructura[estructura.length-1] = obj;
        }
        else{
            for (int i = 0; i < estructura.length; i++) {
                if(estructura[i]!=null){
                    aux = i;
                    i = estructura.length;
                }
            }
            estructura[aux-1] = obj;
        }
    }
    public String toString(){
        String c="";
        for (Object object : estructura) {
            c+=object.toString()+"  ";
        }
        return c;
    }
}
