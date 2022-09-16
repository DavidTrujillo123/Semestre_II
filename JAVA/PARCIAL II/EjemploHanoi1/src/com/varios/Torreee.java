/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Torreee {
    public ArrayList<Bloque> bloqueActual;
    public Torreee(int tamanio){
        bloqueActual = new ArrayList(tamanio);
    }
    
//    public int EncontrarBloque(Torreee t){
//        int aux = -1;
//        
//	for (int i = 0; i < t.bloqueActual.size(); i++)
//        {
//            if (t.bloqueActual.get(i) != null)
//            {
//                aux = i;
//                break;
//            }
//        }
//        return aux;
//    }
    public boolean Comprobar(Torreee t, Bloque nuevoBloque){
        
        if(t.bloqueActual.isEmpty()){
            return true;
        }
        else{
            //iter = EncontrarBloque(t);
            //if(((Bloque)t.bloqueActual.get(iter)).ComprobarAnterior(nuevoBloque)){
            if(nuevoBloque.ComprobarAnterior(((Bloque)t.bloqueActual.get(0)))){
                return true;
            }
        }
        return false;
    }
    
    public void Apilar(Bloque nuevoBloque){
        bloqueActual.add(nuevoBloque);
    }
    public Bloque DesApilar(Torreee torre){
        Bloque bloqueDesapilado;
        int aux = 0;
        bloqueDesapilado = (Bloque)bloqueActual.get(aux);
     
        return bloqueDesapilado;
    }
    public void Mover(Torreee t){
        int x,y;
        int aux = 0;
        if(Comprobar(t, DesApilar(t))){
            if(t.bloqueActual.isEmpty()){
                x = this.bloqueActual.get(this.bloqueActual.size()-1).x;
                y = this.bloqueActual.get(this.bloqueActual.size()-1).y;
                
                t.Apilar(DesApilar(this));
                
                t.bloqueActual.get(0).x = x;
                t.bloqueActual.get(0).y = y;
            }else{
                for (Bloque bloque : t.bloqueActual) {
                    if(bloque != null)
                        aux++;
                }
                
                x = t.bloqueActual.get(aux-1).getX()+25;
                y = t.bloqueActual.get(aux-1).y - 50;
                
                t.Apilar(DesApilar(this));
                
                t.bloqueActual.get(aux).x = x;
                t.bloqueActual.get(aux).y = y;
     
            }
            t.Invertir();
            this.bloqueActual.remove(DesApilar(t));
        }
    }
    public void Invertir(){
        Bloque obj;
        int cont = bloqueActual.size()-1;
        for (int i = 0; i < bloqueActual.size()/2; i++) {
            obj = bloqueActual.get(i);
            bloqueActual.set(i, bloqueActual.get(cont));
            bloqueActual.set(cont,obj);
            cont--;
        }
    }
    @Override
    public String toString(){
        return bloqueActual.toString()+"\n";
    }
   
}
