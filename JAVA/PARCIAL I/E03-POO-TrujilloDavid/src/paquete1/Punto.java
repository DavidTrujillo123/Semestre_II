/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Punto {
    private int x,y,z;
    public Punto(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public boolean Comparar(int x, int y, int z){
        if(this.x == x)
            if(this.y == y)
                if(this.z == z)
                    return true;
        return false;
    }
    public boolean Comparar(Punto p){
        return Comparar(p.getX(), p.getY(), p.getZ());
    }
    public Punto Sumar(int x, int y, int z){
        int rx, ry, rz;
        rx = this.x+x;
        ry = this.y + y;
        rz = this.z + z;
        
        return new Punto(rx, ry, rz);
    }
    public Punto Sumar(Punto p){
        return Sumar(p.getX(),p.getY(),p.getZ());
    }
    public String Imprimir(){
        return "("+x+","+y+","+z+")";
    }
}
