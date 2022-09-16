/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoevamatrices;

/**
 *
 * @author Asus
 */
public class Vectores {
    int[] A;
    public Vectores(int tamanio){
        A = new int[tamanio];
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }
    public void setA(int i,int num) {
        this.A[i]= num;
    }
    public void Imprimir(){
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]+"  ");
        }
        
    }
  
    
            
}
