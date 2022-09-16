/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Hilos {

    public static void Hanoi(int t1, int t2, int t3, int n){
        try {
            
            if(n == 1){
                System.out.println("disco: "+t1+"-->"+t3);
                Thread.sleep(5000);
            }
            else{
                Hanoi(t1, t3, t2, n-1);
                System.out.println("disco: "+t1+"-->"+t3);
                Thread.sleep(5000);
                Hanoi(t2, t1, t3, n-1);
            }
        } catch (InterruptedException ex) {
           
        }
        
    }
    
    public static int Restar(int num){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
           
        }
        System.out.println(num);
        if(num == 1){
            return num;
        }
        else{
            return Restar(num-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       // Hanoi(1, 2, 3, 2);
//        JOptionPane panel = new JOptionPane("");
//        JDialog d = panel.createDialog(null,"PASOS");
//        panel.setMessage("hola bola");
//        d.setLocation(10,10);
//        d.setVisible(true);
        
       // JOptionPane.showMessageDialog(null, "HOla");
        int resp = JOptionPane.showConfirmDialog(null, "¿CONTINUAR?", "PASOS", JOptionPane.YES_NO_OPTION);
        System.out.println(resp);
//        Thread th = new Thread();
//        try {
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(1000);
//                System.out.println(i+1);
//            }
//            
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
