/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appvisual;

/**
 *
 * @author Asus
 */
public class Fraccionario {
    private int num;
    private int den;
    public static int cont = 0;
    public Fraccionario(int num, int den) {
        this.num = num;
        this.den = den;
        if(den == 0 || num == 0){
            this.num = 0;
            this.den = 0;
        }
        //Fraccionario.cont++;
        //System.out.println(cont);
    }
    public Fraccionario(int num){
        this.num = num;
        this.den = 1;
        //Fraccionario.cont++;
        //System.out.println(cont);
    }
    public Fraccionario(){
        this.num = 0;
        this.den = 1;
        //Fraccionario.cont++;
        //System.out.println(cont);
    }

    public void setNum(int num) {
        if(num == 0){
            this.num = 0;
            this.den = 0;
        }else this.num = num;
    }

    public void setDen(int den) {
        if(den == 0 || this.num == 0){
           this.num = 0;
           this.den = 0;
        }else this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
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
        
        if(num == 0) return new Fraccionario(this.num, this.den);
        else if(this.num == 0) return new Fraccionario(num, den);
        
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
               
        if(num == 0) return new Fraccionario(this.num, this.den);
        else if(this.num == 0) return new Fraccionario((-1)*num, den);
        
        rden = this.den * den;
        rnum = this.num * den - this.den * num;
               
        return new Fraccionario(rnum, rden);
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
    public Fraccionario Multiplicacion(Fraccionario f){
        return Multiplicacion(f.num, f.den);
    }
    //Division
    public Fraccionario Division(int num, int den)
    {
        int rnum, rden, aux;

        aux = num;
        num = den;
        den = aux;

        rnum = this.num * num;
        rden = this.den * den;
        return new Fraccionario(rnum, rden);
    }
    public Fraccionario Division(int num)
    {
        return Division(num, 1);
    }
    public Fraccionario Division(Fraccionario f)
    {
        return Division(f.num, f.den);
    }
    public String Imprimir(){
        if(this.den > 0 ) return "("+this.num+"/"+this.den+")";
        else return "("+this.num*(-1) + "/" +this.den*(-1)+")";
    }
    
}
