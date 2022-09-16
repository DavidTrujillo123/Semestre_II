/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public abstract class Ordenar {
    protected double tiempo;
    protected int intercambios;
    protected int ciclos;
    protected int[] A;
        
    public Ordenar(int[] A){
        this.A = A.clone();
        
    }
    public abstract void Ordenar();
    
    public void Clonar(Object B){
        B = A.clone();
    }

    public int[] getArreglo() {
        return A;
    }
    
    public String ImprimirArreglo(){
        String c= "";
        for (int i = 0; i < A.length; i++) {
            c+=A[i]+" ; ";
        }
        return c;
    }
    
    @Override
    public String toString(){
        return "Tiempo: "+tiempo+"ms"
                +"\nIntercambios: "+intercambios
                +"\nCiclos: "+ciclos;
    }
}
