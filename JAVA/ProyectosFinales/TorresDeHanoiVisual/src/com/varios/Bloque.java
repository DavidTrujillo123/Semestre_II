
package com.varios;

import javax.swing.JPanel;


public class Bloque extends JPanel{//Heredamos de JPanel para usarla como nuestros bloques
    protected JPanel bloque;
    
    //Constructor, pasamos x,y,largo y alto respectivamente
    public Bloque(int x, int y, int largo, int alto){
        //bloque = new JPanel();
        bloque = new FondoPanel(0, 0, largo, alto, "/imagenes/Imagen4.png");
        bloque.setBounds(x,y,largo,alto);
        
        //bloque.setBorder(new LineBorder(Color.yellow));//dar formato al panel
        //bloque.setBackground(Color.red);
        bloque.setVisible(true);
    }
    
    //Obtenermos el JPanel
    public JPanel getBloque() {
        return bloque;
    }
    
    //Obtener x
    public int X(){
        return bloque.getX();
    }
    
    //Obtener y
    public int Y(){
        return bloque.getY();
    }
    
    /***
     * 
     * @param b -> bloque anterior
     * @return true si el bloque anterior es mayor al actual
     */
    public boolean ComprobarAnterior(Bloque b){
        return b.getBloque().getWidth() > this.getBloque().getWidth();
    }
    
    //Imprimir por consola
    @Override
    public String toString(){
        return "Largo: "+this.getBloque().getWidth()+" x:"+this.getBloque().getX()+" y: "
                +this.getBloque().getY()+" | ";
    }
    
}
