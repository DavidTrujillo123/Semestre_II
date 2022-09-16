package varios;

public class SegmentoRecta {

    private Punto p1;
    private Punto p2;

    //Constructores
    public SegmentoRecta(int x1, int y1, int x2, int y2) {
        p1 = new Punto(x1, y1);
        p2 = new Punto(x2, y2);
    }

    public SegmentoRecta(int x, int y) {
        p1 = new Punto();
        p2 = new Punto(x, y);
    }
    //Gettes and Setters
    public void setX1(int x1){
        this.p1.setX(x1);
    }
    
    public int getX1(){
        return this.p1.getX();
    } 
    
    public void setY1(int y1){
        this.p1.setY(y1);
    }
    
    public int getY1(){
        return this.p1.getY();
    }
    
    public void setX2(int x2){
        this.p2.setX(x2);
    }
    public int getX2(){
        return this.p2.getX();
    } 
    
    public void setY2(int y2){
        this.p2.setY(y2);
    }
    
    public int getY2(){
        return this.p2.getY();
    }
    
    /**
     * Método que calcula la longitud de una recta con dos puntos en el plano
     *
     * @return Longitud de un segmento de recta
     */
    public double CalcularLongitud() {
        double a = Math.pow((this.p2.getX() - this.p1.getX()), 2);
        double b = Math.pow((this.p2.getY() - this.p1.getY()), 2);
        return Math.sqrt(a + b);
    }

    /**
     * Método que modifica los puntos del segmento de recta
     *
     * @param dx Dezplamiento en x
     * @param dy Dezplamiento en y
     */

    public void Mover(int dx, int dy) {
        this.p1.Mover(dx, dy);
        this.p2.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Punto 1: " + this.p1.Imprimir() + "\nPunto 2: " 
                + this.p2.Imprimir();
    }
}
