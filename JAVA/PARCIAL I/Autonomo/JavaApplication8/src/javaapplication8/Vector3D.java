/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author Asus
 */
public class Vector3D {
    private Punto A;
    private Punto B;
    
    public Vector3D(Punto A, Punto B){
        this.A = A;
        this.B = B;
    }   
    
    public Vector3D(int x, int y, int z){
        this.A = new Punto();
        this.B = new Punto(x, y, z);
    }
    
    public boolean Comparar(Punto A, Punto B){
        if(this.A.getX() == A.getX() && this.B.getX() == B.getX()){
            if(this.A.getY() == A.getY() && this.B.getY() == B.getY()){
                if(this.A.getZ() == A.getZ() && this.B.getZ() == B.getZ()){
                    return true;
                } else return false;
            }else return false;
        }
        else return false;
    }
    public boolean Comparar(Vector3D vec1){
        if (Comparar(vec1.A, vec1.B)) return true;
        else return false;
    }
    
    public Vector3D Sumar(int sumX1, int sumY1, int sumZ1,int sumX2, int sumY2, int sumZ2){
        int x1 = this.A.getX();
        int y1 = this.A.getY();
        int z1 = this.A.getZ();
        
        int x2 = this.B.getX();
        int y2 = this.B.getY();
        int z2 = this.B.getZ();
        
        x1 += sumX1;
        y1 += sumY1;
        z1 += sumZ1;
        
        x2 += sumX2;
        y2 += sumY2;
        z2 += sumZ2;
        Vector3D vec1 = new Vector3D(new Punto(x1, y1, z1), new Punto(x2, y2, z2));
        return vec1;
    }
    public Vector3D Sumar(Punto A, Punto B){
        return Sumar(A.getX(), A.getY(), A.getZ(), B.getX(), B.getY(), B.getZ());
        
    }
    public Vector3D Sumar(Vector3D vec1){
        return Sumar(vec1.A, vec1.B);
    }
    private double Distancia2Puntos(Punto p1, Punto p2){
        return Math.sqrt( Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2) 
                + Math.pow(p2.getZ() - p1.getZ(), 2) );
    }
    public double CalcularNorma(){
        return  Distancia2Puntos(this.A, this.B);
    }
    public String Imprimir(){
        return "P1:"+A.Imprimir()+" P2:"+B.Imprimir();
    }
}
