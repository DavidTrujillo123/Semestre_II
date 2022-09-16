/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

public class NumComplejoMain {

    public static int Sumar(int a, int b){
        int r = 0;
        if(a == b){
            r = a;
        }else{
            r = Sumar(a+1,b) + a;
        }
        return r;
    }
    public static void main(String[] args) {
        NumeroComplejo n1, n2, suma, resta , mult ;
        int numReal= 11;
        int numImaginario = 12;
        n1 = new NumeroComplejo();
        n2 = new NumeroComplejo(4, -11);
        System.out.println("n1: "+n1.Imprimir());
        System.out.println("n2: "+n2.Imprimir());
        
        suma = n1.Sumar(n2);
        System.out.println("Suma: "+n1.Imprimir()+" + "+n2.Imprimir()+" = "+suma.Imprimir());
        
        resta = n2.Restar(n1);
        System.out.println("Resta: "+n2.Imprimir()+" - "+n1.Imprimir()+ " = " +resta.Imprimir());
        
        mult = n1.Multiplicacion(n2);
        System.out.println("Multiplicacion: "+n1.Imprimir()+" * "+n2.Imprimir()+" = "+mult.Imprimir());
        
        int a = 4;
        int b = 9;
        System.out.println(Sumar(a, b));
    }
}