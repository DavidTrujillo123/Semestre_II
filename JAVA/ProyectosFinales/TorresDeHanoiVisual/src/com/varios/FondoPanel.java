/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class FondoPanel extends JPanel{
    private Image imagen;
    private int x,y,largo,alto;
    String ima;

    public FondoPanel(int x, int y, int largo, int alto, String ima) {
        this.x = x;
        this.y = y;
        this.largo = largo;
        this.alto = alto;
        this.ima = ima;
    }
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource(ima)).getImage();
        g.drawImage(imagen, x, y, largo, alto, this);
        setOpaque(false);
        super.paint(g);
    }
    
}
