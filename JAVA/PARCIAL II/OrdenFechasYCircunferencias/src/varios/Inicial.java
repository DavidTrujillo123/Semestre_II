/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varios;

public class Inicial {
    public static int nCir;
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
    public static void OrdenarLista1(Object[] ob){
        Object aux;
        int pos;
        int cont = 0;
        int cont1 = 0;
        for (int i = 0; i < ob.length-1; i++) {
            pos = i;
            for (int j = i+1; j < ob.length; j++) {
                if(ob[pos] instanceof Fecha && ob[j] instanceof Circunferencia){
                    pos = j;
                    j = ob.length;
                }
                
                cont1++;
            }
            if(pos != i){
                aux = ob[pos];
                ob[pos] = ob[i];
                ob[i]=aux;
                cont++;
            }
            
        }
        System.out.println(cont+"  "+cont1);
    }
    public static void nCir(Object[] ob){
        int cont = 0;
        for (int i = 0; i < ob.length; i++) {
            if(ob[i] instanceof Circunferencia)
                cont++;
        }
        nCir = cont;
        //return cont;
    }
    public static void OrdenarCir(Object[] ob){
        Object aux;
        Circunferencia elm1;
        Circunferencia elm2;
        for (int i = 0; i < nCir-1; i++) {
            for (int j = 0; j < nCir-1; j++) {
                elm1 = (Circunferencia)ob[j];
                elm2 = (Circunferencia)ob[j+1];
                if(elm1.getRadio() > elm2.getRadio()){
                    aux = ob[j];
                    ob[j] = ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static void OrdenarCir1(Object[] ob){
        Object aux;
        Circunferencia elm1;
        Circunferencia elm2;
        int pos;
        for (int i = 0; i < nCir-1; i++) {
            pos = i;
            for (int j = i+1; j < nCir; j++) {
                elm1 = (Circunferencia)ob[pos];
                elm2 = (Circunferencia)ob[j];
                if(elm1.getRadio() > elm2.getRadio()){
                    pos = j;
                }
            }
            if(pos!=i){
                aux = ob[i];
                ob[i] = ob[pos];
                ob[pos]=aux;
            }
        }
    }
    public static void OrdenarFecha(Object[] ob){
        int pos = nCir;
        Fecha elm1;
        Fecha elm2;
        Object aux;
        for (int i = pos; i < ob.length-1; i++) {
            for (int j = pos; j < ob.length-1; j++) {
                elm1 = (Fecha)ob[j];
                elm2 = (Fecha)ob[j+1];
                if(elm1.Comparar(elm2) > 0){
                    aux = ob[j];
                    ob[j]=ob[j+1];
                    ob[j+1]=aux;
                }
            }
        }
    }
    public static void OrdenarFecha1(Object[] ob){
        int pos = nCir;
        
        int pos_aux;
        Fecha elm1;
        Fecha elm2;
        Object aux;
        for (int i = pos; i < ob.length-1; i++) {
            pos_aux = i;
            for (int j = i+1; j < ob.length; j++) {
                elm1 = (Fecha)ob[pos_aux];
                elm2 = (Fecha)ob[j];
                if(elm1.Comparar(elm2) > 0){
                    pos_aux = j;
                }
            }
            if(pos_aux != i){
                aux = ob[i];
                ob[i]=ob[pos_aux];
                ob[pos_aux]=aux;
            }
        }
    }    
    public static void Ordenar(Object[] ob){
        OrdenarLista(ob);
        nCir(ob);
        OrdenarCir1(ob);
        OrdenarFecha1(ob);
    }
    public static int BusquedaCir(Object[] ob, Circunferencia c, int m, int izq, int der){
        if(izq > der) return -1;
        Circunferencia aux;
        aux = (Circunferencia)ob[m];
        
        if(c.getRadio() == aux.getRadio()){
            return m;
        }
        else if(c.getRadio() > aux.getRadio()){
            izq = m+1;
            m = (izq+der)/2;
            return BusquedaCir(ob, c, m, izq, der);
        }
        else {
            der = m-1;
            m = (izq+der)/2;
            return BusquedaCir(ob, c, m, izq, der);
        }
    }
    public static int BusquedaFecha(Object[] ob, Fecha f, int m, int izq, int der){
        if(izq > der) return -1;
        Fecha aux;
        aux = (Fecha)ob[m];
        
        if(f.Comparar(aux) == 0){
            return m;
        }
        
        if(f.Comparar(aux) > 0){
            izq = m+1;
            m = (izq+der)/2;
            return BusquedaFecha(ob, f, m, izq, der);
        }
        else{
            der = m-1;
            m = (izq+der)/2;
            return BusquedaFecha(ob, f, m, izq, der);
        }
    }
    public static int BusquedaBinaria(Object[] ob, Object n){
        if(n instanceof Circunferencia){
            Circunferencia c = (Circunferencia)n;
            return BusquedaCir(ob, c, (nCir-1)/2, 0, nCir-1);
        }
        else{
            Fecha f = (Fecha)n;
            return BusquedaFecha(ob, f, (nCir+(ob.length-1))/2, nCir, ob.length-1);
        }
    }
    public static void Imprimir(Object[] ob){
        for (Object obj : ob) {
            System.out.println(obj.toString());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Object[] lista = new Object[12];
        lista[0] = new Fecha(2, 5, 2022);
        lista[1] = new Circunferencia(2) ;
        lista[2] = new Fecha(12, 12, 2012);
        lista[3] = new Circunferencia(1);
        lista[4] = new Circunferencia(11);
        lista[5] = new Fecha(1, 1, 2001);
        lista[6] = new Circunferencia(10);
        lista[7] = new Fecha(21, 9, 2021);
        lista[8] = new Fecha(6, 11, 2000);
        lista[9] = new Circunferencia(5);
        lista[10] = new Fecha(1, 1, 1990);
        lista[11] = new Circunferencia(2);
                
        Imprimir(lista);
        Ordenar(lista);
        Imprimir(lista);
        System.out.println(BusquedaBinaria(lista, new Fecha(1, 1, 211002)));

    }
}
