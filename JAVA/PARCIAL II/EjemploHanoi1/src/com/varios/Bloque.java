
package com.varios;

public class Bloque {
    private int largo;
    public int x,y;
    
    public Bloque(int largo, int x, int y){
        this.largo = largo;
        this.x = x;
        this.y = y;
    }
    public int getLargo() {
        return largo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    /***
     * 
     * @param b -> bloque anterior
     * @return true si el bloque anterior es mayor al actual
     */
    public boolean ComprobarAnterior(Bloque b){
        return b.largo > this.largo;
    }
    @Override
    public String toString(){
        return "B: "+this.largo+" x:"+x+" y: "+y+"\n";
    }
}
