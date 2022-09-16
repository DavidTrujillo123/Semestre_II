/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varios;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Inicial {

    public static void OrdenarCir(Circunferencia[] A){
        
        Circunferencia aux;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j].getRadio()>A[j+1].getRadio()){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1]=aux;
                }
            }
        }
    }
    public static void OrdenarFecha(Fecha[] A){
        Fecha aux;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j].Comparar(A[j+1]) >0){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1]=aux;
                }
            }
        }
        
    }
    public static int BusquedaCir(Circunferencia[] A, Circunferencia B, int m, int izq, int der){
        if(izq > der) return -1;
        if(A[m].getRadio()==B.getRadio()) return m;
        else{
            if(B.getRadio() > A[m].getRadio()){
                izq = m+1;
                m = (izq+der)/2;
                //return BusquedaCir(A, B,(izq+der)/2, m+1,der);
                return BusquedaCir(A, B, m, izq, der);
            }
            else{
                der = m-1;
                m = (izq + der)/2;
                //return BusquedaCir(A, B,(izq + der)/2 , izq, m-1);
                return BusquedaCir(A, B, m, izq, der);
            }
        }
    }
    public static void OrdenarObj(Object[] ob){
        Object aux;
        for (int i = 0; i < ob.length-1; i++) {
            for (int j = 0; j < ob.length-1; j++) {
                if(ob[j] instanceof Fecha && ob[j+1] instanceof Circunferencia ){
                    aux = ob[j];
                    ob[j] = ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static int[] ContarObj(Object[] ob){
        int contcir = 0;
        int contfecha = 0;
        for (int i = 0; i < ob.length; i++) {
            if(ob[i].getClass() == Circunferencia.class){
                contcir++;
            }
            else{
                contfecha++;
            }
        }
        
        int[] res = {contcir,contfecha};
        return res;
    }
    public static void OrdenarCirFecha(Object[] ob){
        Circunferencia[] cir = new Circunferencia[ContarObj(ob)[0]];
        Fecha[] fecha = new Fecha[ContarObj(ob)[1]];
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < ob.length; i++) {
            if(ob[i] instanceof Fecha){
                fecha[cont1] = (Fecha)ob[i];
                cont1++;
            }
            else{
                cir[cont2]= (Circunferencia)ob[i];
                cont2++;
            }
        }
        for (int i = 0; i < ob.length; i++) {
            if(ob[i] instanceof Fecha){
                OrdenarFecha(fecha);
            }
            else{
                OrdenarCir(cir);
            }
        }
        
    }
    public static void Imprimir(Object[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i].toString());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Circunferencia c1,c2,c3,c4;
        c1 = new Circunferencia(4);
        c2 = new Circunferencia(5);
        c3 = new Circunferencia(2);
        c4 = new Circunferencia(10);
        
        Circunferencia[] A = new Circunferencia[4];
        A[0]=c1;
        A[1]=c2;
        A[2]=c3;
        A[3]=c4;
        Imprimir(A);
        
        OrdenarCir(A);
        Imprimir(A);
        Circunferencia b = new Circunferencia(11);
      //  System.out.println(BusquedaCir(A, b, (A.length-1)/2, 0, A.length-1));
        
        
        Object[] lista = new Object[6];
        
        lista[0]=new Fecha(1, 12, 2011);
        lista[1]=new Circunferencia(22);
        lista[2]=new Fecha(2, 2, 2001);
        lista[3]=new Circunferencia(1);
        lista[4]=new Circunferencia(6);
        lista[5]=new Circunferencia(10);
        
        
        Imprimir(lista);
        OrdenarObj(lista);
        Imprimir(lista);
        
        OrdenarCirFecha(lista);
        Imprimir(lista);
        
        
    }
    
}
