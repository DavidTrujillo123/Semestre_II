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
    public Circunferencia(int radio){
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    
    @Override
    public String toString(){
        return "C: "+this.radio;
    }
}
