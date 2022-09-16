/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class Recursividad {
    public static int contI=0;
    public static int contR=0;
    public static boolean Comprobar(String A, int inicio, int fin){
        if(inicio >= fin) return true;
        else{
            if(A.charAt(inicio) == A.charAt(fin)){
                return Comprobar(A, inicio+1, fin-1);
            }
            else return false;
        }
       // return false;
    }
    public static String CambiarOrden(String A, int longitud){
        if(longitud == 0){
            return A.charAt(longitud)+"";
        }
        else return A.charAt(longitud) + CambiarOrden(A, longitud-1);
    }
    public static int CambiarOrdenNum(int num, int pos){
        if(num < 10) return num;
        else{
            return (num % 10) * (int)(Math.pow(10, pos)) + CambiarOrdenNum(num/10, pos-1);
        }

    }
    public static int Potencia(int base, int exponente){
        if(exponente == 1) return base;
        else{
            return Potencia(base, exponente-1)*base;
        }
    }
    public static int PotenciaSecuencial(int base, int exp){
        int r = 1;
        for (int i = 1; i <= exp; i++) {
            r = r*base;
        }
        return r;
    }
    public static int Factorial(int num){
        contR++;
        if(num == 1 || num == 0) return 1;
        else{
            return Factorial(num-1)*num;
        }
    }
    public static int FactorialIterativo(int num){
        
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i ;
            contI++;
        }
        return fac;
    }
    public static String Fibonacci(int n, int a, int b){
        int aux;
        String r = "";
        if( a == 1 && b== 1) r += a+" "+b+" ";
        if(n>=2){
            aux = a;
            a = b;
            b = aux+b;
            r += b+" "+Fibonacci(n-1, a, b);
        }
        return r;
    }
    public static void main(String[] args) {
//        System.out.println(Potencia(2, 3));
//        System.out.println(Factorial(5));
//        System.out.println(FactorialIterativo(5));
//        System.out.println(PotenciaSecuencial(2, 3));
        System.out.println(Fibonacci(10, 1, 1));
        
//        long iniTiempo = System.nanoTime();
//        long finTiempo = System.nanoTime();
//        //relacion = tiempo1/tiempo2
//        String A = "ANITALAVALATINA";
//        A = A.replace(" ", "");
//        
//        int num = 311451;
//        System.out.println(CambiarOrdenNum(num, 5));
        
    }
    
}
