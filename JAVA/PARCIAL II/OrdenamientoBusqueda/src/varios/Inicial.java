/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varios;

/**
 *
 * @author Asus
 */
public class Inicial {
    public static void OrdenarLista(Object[] ob){
        Object aux;
        for (int i = 0; i < ob.length-1; i++) {
            for (int j = 0; j < ob.length-1; j++) {
                if(ob[j] instanceof Fecha && ob[j+1] instanceof Circunferencia){
                    aux = ob[j];
                    ob[j] = ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static int nCir(Object[] ob){
        int cont = 0;
        for (int i = 0; i < ob.length; i++) {
            if(ob[i] instanceof Circunferencia)
                cont++;
        }
        return cont;
    }
    public static void OrdenarCir(Object[] ob){
        Object aux;
        Circunferencia elem1;
        Circunferencia elem2;
        for (int i = 0; i < nCir(ob)-1; i++) {
            for (int j = 0; j < nCir(ob)-1; j++) {
                elem1 = (Circunferencia)ob[j];
                elem2 = (Circunferencia)ob[j+1];
                if(elem1.getRadio() > elem2.getRadio()){
                    aux = ob[j];
                    ob[j] = ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static void OrdenarFecha(Object[] ob){
        Object aux;
        Fecha elem1;
        Fecha elem2;
        for (int i = nCir(ob); i < ob.length-1; i++) {
            for (int j = nCir(ob); j < ob.length-1; j++) {
                elem1 = (Fecha)ob[j];
                elem2 = (Fecha)ob[j+1];
                if(elem1.Comparar(elem2) > 0){
                    aux = ob[j];
                    ob[j] = ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static void Ordenar(Object[] ob){
        OrdenarLista(ob);
        OrdenarCir(ob);
        OrdenarFecha(ob);
    }
    public static int BusquedaCir(Object[] ob, Circunferencia c, int m, int izq, int der){
        if(izq > der) return -1;
        Circunferencia aux;
        aux = (Circunferencia)ob[m];
        if(c.getRadio() == aux.getRadio()) return m;
        else if(c.getRadio() > aux.getRadio()){
            izq = m+1;
            m = (izq + der)/2;
            return BusquedaCir(ob, c, m, izq, der);
        }
        else {
            der = m-1;
            m = (izq + der)/2;
            return BusquedaCir(ob, c, m, izq, der);
        }
    }
    public static int BusquedaFecha(Object[] ob, Fecha f, int m, int izq, int der){
        if(izq > der) return -1;
        Fecha aux;
        aux = (Fecha)ob[m];
        if(f.Comparar(aux) == 0) return m;
        else if(f.Comparar(aux) > 0){
            izq = m+1;
            m = (izq + der)/2;
            return BusquedaFecha(ob, f, m, izq, der);
        }
        else {
            der = m-1;
            m = (izq + der)/2;
            return BusquedaFecha(ob, f, m, izq, der);
        }
    }
    public static int BusquedaBinaria(Object[] ob, Object n){
        if(n instanceof Circunferencia){
            Circunferencia c;
            c = (Circunferencia)n;
            return BusquedaCir(ob, c, (nCir(ob)-1)/2, 0, nCir(ob)-1);
        }
        else{
            Fecha f;
            f = (Fecha)n;
            return BusquedaFecha(ob, f, (nCir(ob) + (ob.length-1))/2, nCir(ob) ,ob.length-1);
        }
    }
    public static void Imprimir(Object[] ob){
        for (Object obj : ob) {
            System.out.println(obj);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Object[] lista = new Object[13];
        lista[0] = new Fecha(2, 5, 2022);
        lista[1] = new Circunferencia(2) ;
        lista[2] = new Fecha(12, 12, 2012) ;
        lista[3] = new Circunferencia(1) ;
        lista[4] = new Circunferencia(11);
        lista[5] = new Fecha(1, 1, 2001);
        lista[6] = new Circunferencia(10);
        lista[7] = new Fecha(21, 9, 2021);
        lista[8] = new Fecha(6, 11, 2000);
        lista[9] = new Circunferencia(5);
        lista[10] = new Fecha(1, 1, 1990);
        lista[11] = new Circunferencia(3);
        lista[12] = new Fecha(12, 21, 2012);
        Imprimir(lista);
        Ordenar(lista);
        Imprimir(lista);
        System.out.println(BusquedaBinaria(lista, new Fecha(1, 1, 1999)));
    }
}
