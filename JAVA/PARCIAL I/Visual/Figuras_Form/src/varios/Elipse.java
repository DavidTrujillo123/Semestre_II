package varios;

public class Elipse {

    private Punto centro;
    private int ejeMayor;
    private int ejeMenor;

    /**
     *CONSTRUCTOR
     * Si el eje mayor o eje menor es negativo se le asigna 1
     * @param x
     * @param y
     * @param ejeMayor
     * @param ejeMenor
     */
    public Elipse(int x, int y, int ejeMayor, int ejeMenor) {
        this.centro = new Punto(x, y);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
        
//        if (ejeMayor<0) this.ejeMayor = 3;
//        else this.ejeMayor = ejeMayor;
//        if(ejeMenor <0) this.ejeMenor = 2;
//        else this.ejeMenor = ejeMenor;
    }
    public Elipse() {
        this.centro = new Punto();
//        this.ejeMayor = 3;
//        this.ejeMenor = 2;
    }

    public Elipse(int ejeMayor, int ejeMenor) {
        this.centro = new Punto();
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
//        if (ejeMayor<0) this.ejeMayor = 3;
//        else this.ejeMayor = ejeMayor;
//        if(ejeMenor <0) this.ejeMenor = 2;
//        else this.ejeMenor = ejeMenor;
    }

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

    public int getEjeMayor() {
        return ejeMayor;
    }

    public void setEjeMayor(int ejeMayor) {
        if (this.ejeMayor > 0) this.ejeMayor = ejeMayor;
    }

    public int getEjeMenor() {
        return ejeMenor;
    }

    public void setEjeMenor(int ejeMenor) {
        if (this.ejeMenor>0)this.ejeMenor = ejeMenor;
    }
//    public double Area(){
//        return CalcularArea();
//    }
    
    /**
     * Método que calcula el area de una elipse
     *
     * @return Area de la elipse
     */
    public double CalcularArea() {
        double a = this.ejeMayor / 2;
        double b = this.ejeMenor / 2;
        return Math.PI * a * b;
    }

    public double CalcularPerimetro() {
        return Math.PI * (this.ejeMayor + this.ejeMenor);
    }

    /**
     * Método que mueve la elipse
     *
     * @param dx Valor del desplazamiento en x
     * @param dy Valor del desplazamiento en y
     */
    public void Mover(int dx, int dy) {
        this.centro.Mover(dx, dy);
    }

    /**
     * Método para tranformar a string los datos obtenidos
     *
     * @return Transformar a string
     */
    public String Imprimir() {
        return "Punto centro: " + this.centro.Imprimir()+ "\nEje A: " 
                + this.ejeMayor + "\nEje B: " + this.ejeMenor;
    }
}
