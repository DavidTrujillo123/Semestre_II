/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;


public class Rectangulo {
    public int x;
    public int y;
    public int ladoMayor;
    public int ladoMenor;
    
    /**
     * Método que calcula el area de un rectangulo
     * @return Area de un rectangulo
     */
    public double CalcularArea(){
        return ladoMayor*ladoMenor;
    }
    
    /**
     * Método que calcula el perimetro de un rectangulo
     * @return Perimetro de un rectangulo
     */
    public double CalcularPerimetro(){
        return 2*ladoMayor+2*ladoMenor;
    }
    /**
     * Método que modifica cambia la esquina inferior izquierda del rectangulo
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x += dx;
        y += dy;
    }
    @Override
    public String toString(){
        return "Punto esquina inferior izquierda: ("+x+","+y+")\nLado Mayor: "+ladoMayor+"\nLado menor: "+ladoMenor+"\nArea: "+CalcularArea()+"\nPerimetro: "+CalcularPerimetro();
    }
    
}
