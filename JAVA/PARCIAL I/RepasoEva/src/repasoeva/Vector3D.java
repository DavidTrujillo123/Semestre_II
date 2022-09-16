/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoeva;

public class Vector3D {
    private Punto p1;
    private Punto p2;
    
    public Vector3D(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2){
        p1 = new Punto(x1, y1, z1);
        p2 = new Punto(x2, y2, z2);
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
        
    public boolean Comparar(Punto p1, Punto p2){
        if(this.p1.Comparar(p1.getX(), p1.getY(), p1.getZ()))
            if(this.p2.Comparar(p2.getX(), p2.getY(), p2.getZ()))
                return true;
        return false;
    }
    public boolean Comparar(Vector3D v){
        return Comparar(v.p1, v.p2);
    }
    public Vector3D Sumar(Punto p1, Punto p2){
        
        Punto p1r = this.p1.Sumar(p1.getX(), p1.getY(), p1.getZ());
        Punto p2r = this.p2.Sumar(p2.getX(), p2.getY(), p2.getZ());
        
        return new Vector3D(p1r, p2r);
    }
    public Vector3D Sumar(Vector3D v){
        return Sumar(v.p1, v.p2);
    }
    public double CalcularNorma(){
        int x = this.p2.getX() - this.p1.getX();
        int y = this.p2.getY() - this.p1.getY();
        int z = this.p2.getZ() - this.p1.getZ();
        
        return Math.sqrt((x*x) + (y*y) + (z*z));
    }
    public String Imprimir(){
        return "P1: "+this.p1.Imprimir()+" P2: "+this.p2.Imprimir();
    }
}
