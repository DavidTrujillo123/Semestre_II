/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiacevanumcomplejo;

/**
 *
 * @author Asus
 */
public class PractiacEvaNumComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroComplejo n1, n2, n3;
        n1 = new NumeroComplejo(10,80);
        n2 = new  NumeroComplejo(8, 3);
        
        n3 = n1.Restar(8, -10);
        
        System.out.println(n3.Imprimir());
        
        n3 = n1.Dividir(5, 2);
        System.out.println(n3.Imprimir());
    }
    
}
