/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Inicial {
    public static void main(String[] args) {
        Ecuaciones c1 = new Ecuaciones(1, -4, 4);
        Ecuaciones c2 = new Ecuaciones(1, 3, 2);
        Ecuaciones c3 = new Ecuaciones(1, 2, 5);
        Raiz r1;
        r1 = c1.Evaluar();
        
        System.out.println(c1.Imprimir() + "\t Raices " + r1.Imprimir());
        
        r1 = c2.Evaluar();
        
        System.out.println(c2.Imprimir() + "\t Raices " + r1.Imprimir());
        //System.out.println(c3.Imprimir());
                
    }
}
