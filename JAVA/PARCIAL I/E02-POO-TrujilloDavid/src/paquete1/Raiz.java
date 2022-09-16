/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Raiz {
    private double x2;
    private double x1;
    private boolean im;
    
    public Raiz(double x1, double x2, boolean img){
        this.x1 = x1;
        this.x2 = x2;
        this.im = img;
    }
    
    public String Imprimir(){
        if(x1 == x2){
            return "x1 = "+x1;
        }
        else {
            if(this.im){
                return "x1 = "+x1 + " x2 ="+x2+"i" ;
            }
            else {
                return "x1 ="+x1+"\nx2 =" + x2;
            }
        }
    }
}
