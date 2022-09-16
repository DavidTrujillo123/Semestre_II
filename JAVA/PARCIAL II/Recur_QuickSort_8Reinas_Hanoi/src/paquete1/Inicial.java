/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Random;

public class Inicial {
    static int cont;
    public static boolean Comprobar(int[] tablero, int n, int k) {
        for (int i = 0; i < k; i++) {
            if (tablero[i] == tablero[k] || (Math.abs(k - i) == Math.abs(tablero[k] - tablero[i]))) {
                return false;
            }
        }
        return true;
    }
    public static void Nreinas(int tablero[], int n, int k) {
        if (k == n) {
            cont++;
            System.out.print("[ ");
            for (int i = 0; i < n; i++) {
                if(i != n - 1)
                    System.out.print(tablero[i] + " , ");
                else
                    System.out.print(tablero[i] + " ");
                    
            }
            System.out.print("]\n");
        } 
        else{
            for (tablero[k] = 0; tablero[k] < n; tablero[k]++) {
                if (Comprobar(tablero, n, k)) {
                    Nreinas(tablero, n, k + 1);
                }
            }
        }
    }
    public static String Hanoi(int n, String origen, String aux, String destino){
        String r = "";
        if(n==1) r+= origen+"--->"+destino+"";
        else{
            r +=Hanoi(n-1, origen, destino, aux)+"\n";
            r+=origen+"--->"+destino+"\n";
            r+= Hanoi(n-1, aux, origen, destino)+"";
        }
        return r;
    }
    public static void QuickSort(int[] A, int lowIndex, int highIndex){
        if(lowIndex >= highIndex) return;
        int izq, der, pivote;
        izq = lowIndex;
        der = highIndex;
        pivote = A[der];
        
        while(izq < der){
            while(A[izq] <= pivote && izq < der){
                izq++;
            }
            while(A[der] >= pivote && izq < der){
                der--;
            }
            Cambio(A, izq, der);
        }
        Cambio(A, der, highIndex);
        
        QuickSort(A, lowIndex, izq -1);
        QuickSort(A, izq + 1, highIndex);
    }
    public static void Cambio(int[] A, int index1, int index2){
        int aux;
        aux = A[index1];
        A[index1] = A[index2];
        A[index2] = aux;
    }
    public static int Factorial(int n){
        if(n==1) return 1;
        return Factorial(n-1)*n;
    }
    public static void Imprimir(int[] A){
        for (Object obj : A) {
            System.out.println(obj);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] A = new int[10];
        Random rn = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rn.nextInt(1, 11);
        }
        Imprimir(A);
        QuickSort(A, 0, A.length-1);
        Imprimir(A);
        System.out.println(Hanoi(3, "origen", "aux", "destino"));
        
        int n = 4;
        int k = 0;
        int[] B = new int[n*n];
        Nreinas(B, n, k);
    }
}
