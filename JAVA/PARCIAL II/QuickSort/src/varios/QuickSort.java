/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varios;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class QuickSort {

    public static void LlenarArreglo(int[] A){
        Random r = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i]=r.nextInt(1, 11);
        }
    }
    public static void QuickSort(int [] A, int indexLow, int indexHigh){
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
            }
            while(A[der] >= pivote && izq < der){
                der--;
            }
            Cambio(A, izq, der);
        }
        Cambio(A, izq, indexHigh);
        
        QuickSort(A, indexLow, izq-1);
        QuickSort(A, der+1, indexHigh);
    }
    public static void Cambio(int[] A,int index1,int index2){
        int aux;
        aux = A[index1];
        A[index1] = A[index2];
        A[index2] = aux;
    }
    public static void Imprimir(int[] A){
        for (int i : A) {
            System.out.print(i+"   ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] A = new int[10];
        LlenarArreglo(A);
        Imprimir(A);
        QuickSort(A, 0, A.length-1);
        Imprimir(A);
    }
    
}
