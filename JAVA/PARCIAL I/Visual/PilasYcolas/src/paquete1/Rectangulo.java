package paquete1;

public class Rectangulo {

    private Punto vertice;
    private int ladoMayor;
    private int ladoMenor;

    /**
     *CONSTRUCTOR 
     * Si el lado mayor o lado menor es negativo se le asigna 1
     * @param x
     * @param y
     * @param ladoMayor
     * @param ladoMenor
     */
    public Rectangulo(int x, int y, int ladoMayor, int ladoMenor) {
        this.vertice = new Punto(x, y);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        
//        if(ladoMayor <0) this.ladoMayor = 2;
//        else{
//            this.ladoMayor = ladoMayor;
//        }
//        if (ladoMenor < 0) this.ladoMenor = 1;
//        else {
//            this.ladoMenor = ladoMenor; 
//        }
    }

    public Rectangulo() {
        this.vertice = new Punto();
        this.ladoMayor = 2;
        this.ladoMenor = 1;

    }

    public Rectangulo(int ladoMayor, int ladoMenor) {
        this.vertice = new Punto();
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        
//        if(ladoMayor <0) this.ladoMayor = 2;
//        else{
//            this.ladoMayor = ladoMayor;
//        }
//        if (ladoMenor < 0) this.ladoMenor = 1;
//        else {
//            this.ladoMenor = ladoMenor; 
//        }
    }

    //Getters and Setters
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

    public int getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(int ladoMayor) {
        if(this.ladoMayor > 0) this.ladoMayor = ladoMayor;
    }

    public int getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(int ladoMenor) {
        if(this.ladoMenor > 0) this.ladoMenor = ladoMenor;
    }
    
    /**
     * Método que calcula el area de un rectangulo
     *
     * @return Area de un rectangulo
     */
    public double CalcularArea() {
        return this.ladoMayor * this.ladoMenor;
    }

    /**
     * Método que calcula el perimetro de un rectangulo
     *
     * @return Perimetro de un rectangulo
     */
    public double CalcularPerimetro() {
        return 2 * this.ladoMayor + 2 * this.ladoMenor;
    }

    /**
     * Método que mueve la esquina inferior izquierda del rectangulo
     *
     * @param dx Valor del desplazamiento en x
     * @param dy Valor del desplazamiento en y
     */
    public void Mover(int dx, int dy) {
        this.vertice.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Punto esquina inferior izquierda: " + this.vertice.Imprimir() 
                + "\nLado Mayor: " + this.ladoMayor + "\nLado menor: " + this.ladoMenor;
    }

}
