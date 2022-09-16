package varios;

public class Circunferencia {
    private Punto centro;
    private double radio;

    /**
     * CONSTRUTOR 
     * Si el radio es negativo, se colocará el radio = 1
     * @param x
     * @param y
     * @param radio
     */
    public Circunferencia(int x, int y, double radio) {
        this.centro = new Punto(x, y);
        
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
    }

    public Circunferencia() {
        this.centro = new Punto();
        this.radio = 1;
    }
    public Circunferencia(double radio) {
        this.centro = new Punto();
        
        this.radio = radio;
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
    }

    //Getters and Setters
    public int getX() {
        return this.centro.getX();
    }

    public void setX(int x) {
        this.centro.setX(x);
    }

    public int getY() {
        return this.centro.getY();
    }

    public void setY(int y) {
        this.centro.setY(y);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio > 0) this.radio = radio;
    }
    public double getArea(){
        return CalcularArea();
    }
    
    /**
     * Método que calcula y retorna el área de la circunferencia
     *
     * @return Area de la circunferencia
     */
    public double CalcularArea() {
        double area;
        area = Math.PI * this.radio * this.radio;
        return area;
    }

    /**
     * Método que calcula y retorna el perimetro de la circunferencia
     *
     * @return Area de la circunferencia
     */
    public double CalcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    /**
     * Método que mueve la circunferencia
     *
     * @param dx Valor del desplazamiento en x
     * @param dy Valor del desplazamiento en y
     */
    public void Mover(int dx, int dy) {
        this.centro.Mover(dx, dy);
    }

    /**
     *
     * @return Imprimir los datos
     */
    public String Imprimir() {
        return "Punto centro: " + this.centro.Imprimir() + " Radio: " + this.radio+"\n";
    }
}
