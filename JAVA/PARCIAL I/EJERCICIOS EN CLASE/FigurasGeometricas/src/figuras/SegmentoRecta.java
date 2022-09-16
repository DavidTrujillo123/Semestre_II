
package figuras;

public class SegmentoRecta {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
    /**
     * Método que calcula la longitud de una recta con dos puntos en el plano
     * @return Longitud de un segmento de recta
     */
    public double CalcularLongitud(){
        double a = Math.pow((x2-x1), 2);
        double b = Math.pow((y2-y1), 2);
        return Math.sqrt(a+b);
    }
    /**
     * Método que modifica los puntos del segmento de recta
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
    }
    
    @Override
    public String toString(){
        return "Punto 1: ("+x1+","+y1+")\nPunto 2: ("+x2+","+y2+")\nLongitud: "+CalcularLongitud();
    }
}
