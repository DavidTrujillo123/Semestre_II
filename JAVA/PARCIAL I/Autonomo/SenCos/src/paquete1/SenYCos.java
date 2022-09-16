/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class SenYCos {
    private double angulo;
    
    public SenYCos(){
        this.angulo = 90;
    }
    public SenYCos(double angulo){
        this.angulo = angulo;
    }
    
    public double Potencia(double base, int exponente){
        double result = 1;
        for (int i = 0; i < exponente; i++) {
            result *= base;
        }
        return result;
    }
    public double Factorial(int num){
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
        }
        return result;
    }
    public double CalcularSeno(){
        double x = this.angulo;
        double result = 0;
        int aux = 1;
        for (int i = 0; i < 10; i++) {
            result = (Potencia(x, aux)) / (Factorial(aux)) * Potencia(-1, i) + result;
            aux+=2;
        }
        return result;
    }
    public double CalcularCoseno(){
        double x = this.angulo;
        double result = 0;
        for (int i = 0; i < 10; i++) {
            result += (Potencia(x, 2*i)) / (Factorial(2*i)) * Potencia(-1, i);
        }
        return result;
    }
    public double TransformarArad(){
        double rad;
        rad = this.angulo*3.1416/180;
        return rad;
    }
    
}
