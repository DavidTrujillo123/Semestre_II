/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoevamatrices;

import java.util.Vector;

/**
 *
 * @author Asus
 */
public class RepasoEvaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz m = new Matriz();
        m.LlenarMatriz(1, 10);
        System.out.println(m.ImprimirMatriz());
        System.out.println("Mayor: "+m.NumMayor());
        System.out.println("Pos: "+m.PosNumMayor());
        System.out.println("Menor: "+m.NumMenor());
        System.out.println("Pos: "+m.PosNumMenor());
        
        
        //v1.Imprimir();
        //v.set(1, 1);
        
    }
    
}
