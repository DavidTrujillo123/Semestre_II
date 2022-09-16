/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Burbuja extends Ordenar{

    public Burbuja(int[] A) {
        super(A);
    }
    
    @Override
    public void Ordenar() {
        long inicio = System.nanoTime();
        
        int aux;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j]>A[j+1]){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                    super.intercambios++;
                }
                super.ciclos++;
            }
//            super.ciclos++;
        }
        
        long fin = System.nanoTime() - inicio;
        super.tiempo = fin/1e6;
    }
    
}
