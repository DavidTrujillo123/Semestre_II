/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoeva;

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
    public Punto(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
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
    public Punto Sumar(int x, int y, int z){
        x += this.x;
        y += this.y;
        z += this.z;
        
        return new Punto(x, y, z);
    }
    public String Imprimir(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
    
}
