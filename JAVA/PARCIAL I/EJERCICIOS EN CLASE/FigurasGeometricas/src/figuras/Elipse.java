
package figuras;


public class Elipse {
    public int x;
    public int y;
    public int ejeMayor;
    public int ejeMenor;
    
    /**
     * Método que calcula el area de una elipse
     * @return Area de la elipse
     */
    public double CalcularArea(){
        double a = ejeMayor/2;
        double b = ejeMenor/2;
        return Math.PI*a*b;
    }
    public double CalcularPerimetro(){
        return Math.PI*(ejeMayor+ejeMenor);
    }
    /**
     * Método que modifica el centro de la elipse
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    @Override
    public String toString(){
        return "Punto esquina inferior izquierda: ("+x+","+y+")\nEje Mayor: "+ejeMayor+"\nEje Menor: "+ejeMenor+"\nArea: "+CalcularArea()+"\nPerimetro: "+CalcularPerimetro();
    }
}
