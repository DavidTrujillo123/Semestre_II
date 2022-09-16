/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class Torre {
    Bloque1[] bloques;
    int cont = 0;
    public Torre(int tamanio) {
        this.bloques = new Bloque1[tamanio];
        cont = tamanio-1;
    }
    public Bloque1 getBloques(int i) {
        return bloques[i];
    }
    public JPanel getPanel(int i){
        return bloques[i].getBloque();
    }
    public int BuscarBloque(){
        int aux = -1;
        for (int i = 0; i < bloques.length; i++) {
            if(bloques[i] != null){
                aux = i;
                i = bloques.length;
            }
        }
        return aux;
    }
    public void Apilar(Bloque1 b){
        
        if(BuscarBloque() == -1){
            bloques[bloques.length-1] = b;
        }
        else{
            bloques[BuscarBloque()-1] = b;
        }
       
    }
    public Bloque1 DesApilar(){
        //Bloque1 ob = null;
        int aux = BuscarBloque();
        
        if(aux >= 0){
            return bloques[aux];
        }
        else{
            return null;
        }
    }
    public boolean Comprobar(Torre t){
        int aux1;
        int aux2;
        boolean bandera;
        aux1 = t.BuscarBloque();
        aux2 = BuscarBloque();
        
        if(aux2 >= 0){
            if(aux1 == -1){
                return true;
            }
            else{
                bandera = this.getBloques(aux2).ComprobarAnterior(t.getBloques(aux1));
                if(bandera){
                    return true;
                }
            }
        }
        return false;
    }
    public void Mover(Torre t){
      
        int x,y;
        int aux1 = t.BuscarBloque();
        int aux2 = BuscarBloque();
        
        if(Comprobar(t)){
            Bloque1 aux = DesApilar();
 
            //Pone la ubicacion correcta
            if(aux1 == -1){
                aux.bloque.setLocation(10,300);
            }
            else{
                x = t.bloques[aux1].getx()+25;
                y = t.bloques[aux1].gety()-50;
                aux.bloque.setLocation(x,y);
                System.out.println(t.bloques[aux1].getx());
            }
            
            //cont = 0;
            t.Apilar(aux);  
            
            //Vulelve null el objeto que retorno DesApilar
            for (int i = 0; i < bloques.length; i++) {
                if(aux.equals(bloques[i])){
                    bloques[i] =null;
                }
            }
            
        }
        
    }
    public void Limpiar(){
        for (int i = 0; i < bloques.length; i++) {
            bloques[i]=null;
        }
    }
    @Override
    public String toString(){
        String c = "";
        for (int i = 0; i < bloques.length; i++) {
            if(bloques[i]!=null){
                if(i != bloques.length-1){
                    c+= bloques[i].toString();
                }
                else c+= bloques[i].toString()+"s\n";
            }
        }
        return c;
    }
}
