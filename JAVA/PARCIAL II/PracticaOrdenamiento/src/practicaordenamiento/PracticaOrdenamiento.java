/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaordenamiento;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class PracticaOrdenamiento {

    
    public static void Burbuja(int [] A){
        int aux;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j] > A[j+1]){
                    aux = A[j];
                    A[j]=A[j+1];
                    A[j+1] = aux;
                }
            }
        }
    }
    public static void Seleccion(int [] A){
        int pos;
        int aux;
        for (int i = 0; i < A.length-1; i++) {
            pos = i;
            for (int j = i+1; j < A.length; j++) {
                if(A[pos] > A[j]){
                    pos = j;
                }
            }
            if(pos!=i){
                aux = A[i];
                A[i]=A[pos];
                A[pos] = aux;
            }
        }
    }
    
    public static void Llenar(int [] A){
        Random rn = new Random();
        int aux;
        int k;
        for (int i = 0; i < A.length; i++) {
            k=i;
            A[i] = rn.nextInt(1, 15);
            while(k>0){
                if(A[k-1] == A[i]){
                    i--;
                }
                k--;
            }
        }
    }
    public static void Imprimir(int[] A){
        for (int i : A) {
            System.out.print(" "+i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] A = new int[10];
        Llenar(A);
        Imprimir(A);
        //Burbuja(A);
        Seleccion(A);
        Imprimir(A);
    }
    
}
