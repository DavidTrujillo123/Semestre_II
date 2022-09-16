package varios;

public class Triangulo {

    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3){
       this.p1 = p1;
       this.p2 = p2;
       this.p3 = p3;
       
    }
    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        p1 = new Punto(x1, y1);
        p2 = new Punto(x2, y2);
        p3 = new Punto(x3, y3);
    }

    
    //Getters and Setters
    public int getX1(){
        return this.p1.getX();
    }
    public void setX1(int x1){
        this.p1.setX(x1);
    }

    public int getY1() {
        return this.p1.getY();
    }

    public void setY1(int y1) {
        this.p1.setY(y1);
    }

    public int getX2() {
        return this.p2.getX();
    }

    public void setX2(int x2) {
        this.p2.setX(x2);
    }

    public int getY2() {
        return this.p2.getY();
    }

    public void setY2(int y2) {
        this.p2.setY(y2);
    }

    public int getX3() {
        return this.p3.getX();
    }

    public void setX3(int x3) {
        this.p3.setX(x3);
    }

    public int getY3() {
        return this.p3.getY();
    }

    public void setY3(int y3) {
        this.p3.setY(y3);
    }
    
    private double Distancia2Puntos(int x1, int y1, int x2, int y2){
        return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    private double Distancia2Puntos(Punto p1, Punto p2){
        return Math.sqrt( Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
    /**
     * Método que calcula el perimetro del triangulo con tre puntos
     *
     * @return Perimetro de triangulo
     */
    public double CalcularPerimetro() {
        double a;
        double b;
        double c;
        
        a = Distancia2Puntos(p1.getX(), p2.getY(), p3.getX(), p3.getY());
        b = Distancia2Puntos(p2, p3);
        c = Distancia2Puntos(p3, p1);
        
        return (a + b + c);
    }
    /**
     * Método que calcula el area de un triangulo con tres puntos
     *
     * @return Area del triangulo
     */
    public double CalcularArea() {
        double a;
        double b;
        double c;
        double s;
        
        a = Distancia2Puntos(p1.getX(), p2.getY(), p3.getX(), p3.getY());
        b = Distancia2Puntos(p2, p3);
        c = Distancia2Puntos(p3, p1);
        
        s = CalcularPerimetro()/2;
        
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    /**
     * Método que modifica los puntos del triangulo con tres puntos
     *
     * @param dx Aumentará en x
     * @param dy Aumentará en y
     */
    public void Mover(int dx, int dy) {
        this.p1.Mover(dx, dy);
        this.p2.Mover(dx, dy);
        this.p3.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Punto 1: " + p1.Imprimir() + "\nPunto 2: " + this.p2.Imprimir() + "\nPunto 3: " + this.p3.Imprimir();
    }
}
