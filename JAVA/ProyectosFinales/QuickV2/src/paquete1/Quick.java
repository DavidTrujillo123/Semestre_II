/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;


public class Quick extends Ordenar{
    
    public Quick(int[] A) {
        super(A);
    }
  
    public void Cambio(int[] A,int index1,int index2){
        int aux;
        aux = A[index1];
        A[index1] = A[index2];
        A[index2] = aux;
        intercambios++;
    }

    public void QuickSort(int [] A, int indexLow, int indexHigh){
               
        if(indexLow >= indexHigh){
            return;
        }
        int pivote, izq, der;
        pivote = A[indexHigh];
        
        izq = indexLow;
        der = indexHigh;
        
        while(izq<der){
            while(A[izq] <= pivote && izq < der){
                izq++;
                ciclos++;
            }
            while(A[der] >= pivote && izq < der){
                der--;
                ciclos++;
            }
            Cambio(A, izq, der);
            ciclos++;
        }
        Cambio(A, izq, indexHigh);
        
        QuickSort(A, indexLow, izq-1);
        QuickSort(A, der+1, indexHigh);
        
        ciclos++;

    }
    @Override
    public void Ordenar() {
        long inicio = System.nanoTime();
        QuickSort(A, 0, A.length-1);
        long fin = System.nanoTime() - inicio;
        tiempo = fin/1e6;
    }
    
}
