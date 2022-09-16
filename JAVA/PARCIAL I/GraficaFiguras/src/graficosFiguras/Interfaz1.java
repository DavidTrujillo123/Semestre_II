/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficosFiguras;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class Interfaz1 extends JPanel{
    Punto p1, p2;
    
    @Override
    public void paint (Graphics g){
//        super.paint(g);
//        p1 = new Punto(100,350);
//        p2 = new Punto(600,350);
//        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());//linea horizontal
//        g.drawLine(p1.getY(), p1.getX(), p2.getY(), p2.getX());//linea vertical
//        int x1,y1,x2,y2;
//        x1 = 100;
//        y1 = 340;
//        x2 = 100;
//        y2 = 360;
//        int aux=-10;
//        String c;
//        while(true){
//           c = aux+"";
//           g.drawLine(x1, y1, x1, y2);
//           g.drawString(c,x1,y2+10);
//           g.drawLine(y1, x1, y2, x1);
//           g.drawString(c,y1+20,x1);
//           x1 +=25;
//           aux++;
//           if(x1 >= 625) break;
//        }
//        
//        
//        g.drawRect(350, 325, 25,25);
        
          Cuadrado c = new Cuadrado(10);
          c.setX(3);
          c.setY(2);
          c.paint(g);
          c.Mover(3, 3);
          c.paint(g);
    }
    
//    public static void main (String[] args){
//        JFrame ventana = new JFrame("Practica Graficos");
//        Interfaz1 obj = new Interfaz1();
//        ventana.add(obj);
//        ventana.setSize(700,700);
//        ventana.setLocationRelativeTo(null);
//        ventana.setVisible(true);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//    }
}
