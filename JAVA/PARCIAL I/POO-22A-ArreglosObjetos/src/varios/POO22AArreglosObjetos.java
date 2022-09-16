/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varios;

public class POO22AArreglosObjetos {


    public static void ImprimirArregloRef(Object[] A){
        for (int i = 0; i < A.length; i++) {
            
            System.out.println(i+".-"+A[i]);
        }
        System.out.println("");
    }
    public static void ImprimirArreglo(Object[] A){
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null){
                if(A[i] instanceof Circunferencia)
                    System.out.println(i+".-"+((Circunferencia)A[i]).Imprimir());
                else if(A[i] instanceof Fecha)
                    System.out.println(i+".-"+((Fecha)A[i]).Imprimir());
                else if(A[i] instanceof Triangulo)
                    System.out.println(i+".-"+((Triangulo)A[i]).Imprimir());
                else if(A[i] instanceof Cuadrado)
                    System.out.println(i+".-"+((Cuadrado)A[i]).Imprimir());
                else if(A[i] instanceof Punto)
                    System.out.println(i+".-"+((Punto)A[i]).Imprimir());
                else if(A[i] instanceof SegmentoRecta)
                    System.out.println(i+".-"+((SegmentoRecta)A[i]).Imprimir());
            }
        }
    }
    public static void main(String[] args) {
        
        Circunferencia[] listaCir;
        Circunferencia c1;
        Triangulo t;
        Fecha f;
        Punto p;
        
        listaCir = new Circunferencia[5];
        
        
        ImprimirArregloRef(listaCir);
        
        listaCir[1]= new Circunferencia(1, 2, 3);
        c1 = new Circunferencia(2, 1, 4);
        
        listaCir[0] = c1;
        
        ImprimirArregloRef(listaCir);
        ImprimirArreglo(listaCir);
        
        for (int i = 0; i < listaCir.length; i++) {
            if(listaCir[i]==null){
                listaCir[i] = new Circunferencia(i*2, i*3, i*4);
            }
        }
        
        ImprimirArreglo(listaCir);
        
        t = new Triangulo(1, 2, 3, 4, 5, 6);
        f = new Fecha();
        p = new Punto();
        
        Object[] listaObjetos = new Object[10];
         
        listaObjetos[0] = c1;
        listaObjetos[1] = t;
        listaObjetos[2] = f;
        listaObjetos[3] = p;
        listaObjetos[4] = new SegmentoRecta(1, 2);
        listaObjetos[5] = new Fecha(11, 12, 1973);
        listaObjetos[6] = listaCir[1];
        
        ImprimirArregloRef(listaObjetos);
           
        ImprimirArreglo(listaObjetos);
    }
    
}
