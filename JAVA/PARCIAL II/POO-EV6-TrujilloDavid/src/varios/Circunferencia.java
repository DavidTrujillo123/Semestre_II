/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varios;

/**
 *
 * @author Asus
 */
public class Circunferencia {
   
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    public Circunferencia(int radio) {
        this.radio = radio;
    }
    
    public double Area(){
        return Math.PI*radio;
    }
    
    @Override
    public String toString(){
        return "C: "+radio;
    }
}
