/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Ecuaciones {
    private double a;
    private double b;
    private double c;
    
    public Ecuaciones(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Raiz Evaluar(){
        double x1, x2;
        boolean img = false;
        double raiz;
        raiz = (b*b) - (4*a*c);
        
        if(raiz >= 0){
            img = false;
        }
        else{
            img = true;
            raiz *= -1;
        }
        
        x1 = (-b + Math.sqrt(raiz))/2*a;
        x2 = -(-b + Math.sqrt(raiz))/2*a;
        
        return new Raiz(x1, x2, img);
    }
    public String Imprimir(){
        return this.a+"x² + "+this.b+"x+"+this.c+"= 0";
    }
}
