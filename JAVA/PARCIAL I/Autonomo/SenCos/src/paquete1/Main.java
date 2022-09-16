/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Main {
  
    public static void main(String[] args) {
        double grados = 60;
        double rad = grados*3.1416/180;
        
        SenYCos ob1 = new SenYCos(rad);
      
        System.out.println("Sen("+grados+") = "+ob1.CalcularSeno());
        System.out.println("Cos("+grados+") = "+ob1.CalcularCoseno());
        System.out.println(grados+"° = " + rad + "rad");
        
    }
}
