
package figuras;

public class Cuadrado {
    public int x;
    public int y;
    public double lado;
    
    /**
     * Método que calcula el area de un cuadrado
     * @return Area de un cuadrado
     */
    public double CalcularArea(){
        return lado*lado;
    }
    
    /**
     * Método que calcula el perimetro de un cuadrado
     * @return Perimetro de un cuadrado
     */
    public double CalcularPerimetro(){
        return 4*lado;
    }
    /**
     * Método que modifica cambia la esquina inferior izquierda del cuadrado
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    @Override
    public String toString(){
        return "Punto esquina inferior izquierda: ("+x+","+y+")\nLado: "+lado+"\nArea: "+CalcularArea()+"\nPerimetro: "+CalcularPerimetro();
    }
    
}
