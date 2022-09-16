
package figuras;


public class Circunferencia {
    public int x;
    public int y;
    public double radio;
    
    /**
     * Método que calcula y retorna el área de la circunferencia
     * @return Area de la circunferencia
     */
    public double CalcularArea(){
        double area;
        area = Math.PI* radio*radio;
        return area;
    }
    
    /**
     * Método que calcula y retorna el perimetro de la circunferencia
     * @return Area de la circunferencia
     */
    public double CalcularPerimetro(){
        return 2* Math.PI * radio;
    }
    
    /**
     * Método que modifica cambia el centro de la circunferencia
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    @Override
    public String toString(){
        return "Punto centro: ("+x+","+y+")\nRadio: "+radio+"\nArea: "+CalcularArea()+"\nPerimetro: "+CalcularPerimetro();
    }
}
