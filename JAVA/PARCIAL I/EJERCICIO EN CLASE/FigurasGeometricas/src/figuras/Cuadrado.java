package figuras;

public class Cuadrado {

    private Punto vertice;
    private double lado;

    /**
     * CONTRUCTOR 
     * Si su lado es negativo se colocará 1
     * @param x
     * @param y
     * @param lado
     */
    public Cuadrado(int x, int y, double lado) {
        this.vertice = new Punto(x, y);
        this.lado = lado;

        if (lado > 0) this.lado = lado;
        else this.lado = 1;
    }

    public Cuadrado() {
        this.vertice = new Punto();
        this.lado = 1;
    }

    public Cuadrado(int lado) {
        this.vertice = new Punto();
        this.lado = lado;
        if (lado > 0) this.lado = lado;
        else this.lado = 1;
    }
    
    //Getters and setters
    public int getX() {
        return this.vertice.getX();
    }

    public void setX(int x) {
        this.vertice.setX(x);
    }

    public int getY() {
        return this.vertice.getY();
    }

    public void setY(int y) {
        this.vertice.setY(y);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea(){
        return CalcularArea();
    }
    public double getPerimetro(){
        return CalcularPerimetro();
    }
    
    /**
     * Método que calcula el area de un cuadrado
     *
     * @return Area de un cuadrado
     */
    public double CalcularArea() {
        return this.lado * this.lado;
    }

    /**
     * Método que calcula el perimetro de un cuadrado
     *
     * @return Perimetro de un cuadrado
     */
    public double CalcularPerimetro() {
        return 4 * this.lado;
    }

    /**
     * Método que mueve el cuadrado
     *
     * @param dx Valor del desplazamiento en x
     * @param dy Valor del desplazamiento en y
     */
    public void Mover(int dx, int dy) {
        this.vertice.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Punto esquina inferior izquierda: " + this.vertice.Imprimir() + "\nLado: " + this.lado;
    }

}
