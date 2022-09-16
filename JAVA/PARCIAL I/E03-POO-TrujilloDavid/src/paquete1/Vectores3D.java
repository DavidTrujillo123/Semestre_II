/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Vectores3D {
    private Punto p1;
    private Punto p2;
    
    public Vectores3D(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Vectores3D(int x1, int y1, int z1, int x2, int y2, int z2){
        p1 = new Punto(x1, y1, z1);
        p2 = new Punto(x2, y2, z2);
        
    }
    public boolean Comparar(Punto p1, Punto p2){
        if(this.p1.Comparar(p1))
            if(this.p2.Comparar(p2))
                return true;
        return false;
    }
    public boolean Comparar(Vectores3D v){
        return Comparar(v.p1, v.p2);
    }
    public Vectores3D Sumar(Punto p1, Punto p2){
        Punto p1r, p2r;
        p1r = this.p1.Sumar(p1);
        p2r = this.p2.Sumar(p2);
        return new Vectores3D(p1r, p2r);
    }
    public Vectores3D Sumar(Vectores3D v){
        return Sumar(v.p1, v.p2);
    }
    public double CalcularNorma(){
        int x = this.p2.getX() - this.p1.getX();
        int y = this.p2.getY() - this.p1.getY();
        int z = this.p2.getZ() - this.p1.getZ();
        
        return Math.sqrt(x*x + y*y + z+z);
    }
    public String Imprimir(){
        return "P1: "+p1.Imprimir()+" P2: "+p2.Imprimir();
    }
}
