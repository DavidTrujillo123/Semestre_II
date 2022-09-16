/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Fraccionario {
    private int num;
    private int den;
    
    public Fraccionario(int num, int den) {
        this.num = num;
        this.den = den;
    }
    public Fraccionario(int num){
        this.num = num;
        this.den = 1;
    }
    public Fraccionario(){
        this.num = 0;
        this.den = 1;
    }
    /**
     * Suma dos fraccionarios 
     * @param num
     * @param den
     * @return Direccion de memoria de un objeto
     */
    public Fraccionario Suma(int num, int den){
        int rnum, rden;
        Fraccionario f;
        rden = this.den * den;
        rnum = this.num * den + this.den * num;
        
        f = new Fraccionario(rnum, rden);
        return f;
    }
    public Fraccionario Suma(){
        return Suma(1, 1);
    }
    public Fraccionario Suma(int num){
        return Suma(num, 1);
    }
    public Fraccionario Suma(Fraccionario f1){
        return Suma(f1.num, f1.den);
    }
    //Resta
    public Fraccionario Resta(int num, int den){
        int rnum, rden;
        Fraccionario f;
        rden = this.den * den;
        rnum = this.num * den - this.den * num;
        
        f = new Fraccionario(rnum, rden);
        return f;
    }
    public Fraccionario Resta(){
        return Resta(1, 1);
    }
    public Fraccionario Resta(int num){
        return Resta(num, 1);
    }
    public Fraccionario Resta(Fraccionario f){
        return Resta(f.num, f.den);
    }
    //Multiplicacion
    public Fraccionario Multiplicacion(int num, int den){
        int rnum, rden;
        rnum = this.num*num;
        rden = this.den*den;
        Fraccionario f = new Fraccionario(rnum, rden);
        return f;
    }
    public Fraccionario Multiplicacion(){
        return Multiplicacion(1,1);
    }
    
    public String Imprimir(){
        return this.num+"/"+this.den;
    }
    
}
