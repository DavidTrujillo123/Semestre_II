/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appvisual;


public class AppVisual {

    public static void main(String[] args) {
        System.out.println("Hola");
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialFormulario().setVisible(true);
            }
        });
    }
    
}
