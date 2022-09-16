/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Bloque1 extends javax.swing.JFrame{
    public JPanel bloque;
    public Bloque1(int x, int y, int largo, int alto){
        bloque = new JPanel();
        bloque.setBounds(x,y,largo,alto);
        bloque.setBorder(new LineBorder(Color.yellow));
        bloque.setBackground(Color.red);
        bloque.setVisible(true);
    }

    public JPanel getBloque() {
        return bloque;
    }
    public int getx(){
        return bloque.getX();
    }
    public int gety(){
        return bloque.getY();
    }
    /***
     * 
     * @param b -> bloque anterior
     * @return true si el bloque anterior es mayor al actual
     */
    public boolean ComprobarAnterior(Bloque1 b){
        return b.getBloque().getWidth() > this.getBloque().getWidth();
    }
    
    @Override
    public String toString(){
        return "Largo: "+this.getBloque().getWidth()+" x:"+this.getBloque().getX()+" y: "
                +this.getBloque().getY()+" | ";
    }
}
