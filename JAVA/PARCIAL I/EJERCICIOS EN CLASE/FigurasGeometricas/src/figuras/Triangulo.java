
package figuras;

public class Triangulo {
    public int x1;
    public int y1;
    
    public int x2;
    public int y2;
    
    public int x3;
    public int y3;
    
    /**
     * Método que calcula el area de un triangulo con tres puntos
     * @return Area del triangulo
     */
    public double CalcularArea(){
        double a;
        double b;
        
        a = x1*y2 + x2*y3 + x3*y1;
        b = x1*y3 + x3*y2 + x2*y1;
        
        return Math.abs(0.5*(a-b));
    }
    /**
     * Método que calcula el perimetro del triangulo con tre puntos
     * @return Perimetro de triangulo
     */
    public double CalcularPerimetro(){
        double a;
        double b;
        double c;
        
        a = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        a = Math.sqrt(a);
        
        b = Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2);
        b = Math.sqrt(b);
        
        c = Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2);
        c = Math.sqrt(c);
        
        return a+b+c;
    }
    /**
     * Método que modifica los puntos del triangulo con tres puntos
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
        x3 += dx;
        y3 += dy;
    }
    @Override
    public String toString(){
        return "Punto 1: ("+x1+","+y1+")\nPunto 2: ("+x2+","+y2+")\nPunto 3: ("+x3+","+y3+")\nArea: "+CalcularArea()+"\nPerimetro: "+CalcularPerimetro();
    }
}
