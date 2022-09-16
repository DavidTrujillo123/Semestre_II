/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Orden {
   // private int[] A;
    private double timeBurbuja;
        private int intercambiosBurbuja;
        public int ciclosBurbuja;
    private double timeInsercion;
        private int intercambiosInsercion;
        public int ciclosInsercion;
    private double timeQuick;
        private int intercambiosQuick;
        public int ciclosQuick;
        private long inicio;
        private long fin;
    
    
    public void LlenarArreglo(int A[]){
        for (int i = 0; i < A.length; i++) {
            A[i]= (int)(Math.random()*10000)+1;
        }
    }
    
    //
    //Burbuja
    //
     public void Burbuja(int[] A){
        long inicio = System.nanoTime();
          
        int aux;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j]>A[j+1]){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                    intercambiosBurbuja++;
                }
                ciclosBurbuja++;
            }
            ciclosBurbuja++;
        }
        
        long fin = System.nanoTime();
         
        timeBurbuja = ((double) ((fin - inicio)))/Math.pow(10, 6);
        //timeBurbuja = ((double) ((fin - inicio)));
        System.out.println("Burbuja\nTiempo: "+timeBurbuja+"\nCiclos: "+ciclosBurbuja
                +"\nIntercambios:"+intercambiosBurbuja+"\n");
         
    }
     
    //
    //Insercion
    //
     public void Insercion(int[] A){
        long inicio = System.nanoTime(); 
         
        int pos, aux;
        for (int i = 0; i < A.length; i++) {
            pos = i;
            aux = A[i];
            
            while(pos>0 && aux<A[pos-1]){
                A[pos] = A[pos-1];
                pos--;
                intercambiosInsercion++;
                ciclosInsercion++;
            }
            ciclosInsercion++;
            A[pos] = aux;
        }
        
        long fin = System.nanoTime();
        timeInsercion = ((double) ((fin - inicio)))/Math.pow(10, 6);
        //timeInsercion = ((double)(fin - inicio));
        System.out.println("Insercion\nTiempo: "+timeInsercion+"\nCiclos: "+ciclosInsercion
                +"\nIntercambios:"+intercambiosInsercion+"\n");
    }
     
    //
    //QuickSort
    //
    public void DatosQuick(){
        System.out.println("Quick\nTiempo: "+timeQuick+"\nCiclos: "
                +"\nIntercambios:");
    }
    public void Cambio(int[] A,int index1,int index2){
        int aux;
        aux = A[index1];
        A[index1] = A[index2];
        A[index2] = aux;
        intercambiosQuick++;
    }

    public void QuickSort(int [] A, int indexLow, int indexHigh){
        inicio = System.nanoTime();
        
        if(indexLow >= indexHigh){
            return;
        }
        int pivote, izq, der;
        pivote = A[indexHigh];
        
        izq = indexLow;
        der = indexHigh;
        
        while(izq<der){
            while(A[izq] <= pivote && izq < der){
                izq++;
                //ciclosQuick++;
            }
            while(A[der] >= pivote && izq < der){
                der--;
                //ciclosQuick++;
            }
            Cambio(A, izq, der);
            //ciclosQuick++;
        }
        Cambio(A, izq, indexHigh);
        
        QuickSort(A, indexLow, izq-1);
        QuickSort(A, der+1, indexHigh);
        
        ciclosQuick++;
        
        fin = System.nanoTime();
         
        timeQuick += ((double) ((fin - inicio)))/Math.pow(10, 6);
        //timeQuick += ((double)(fin - inicio));
    }
    //
    //Borrar Todo
    //
    public void BorrarTodo(){
        timeBurbuja = 0;
            intercambiosBurbuja=0;
            ciclosBurbuja = 0;
        timeInsercion = 0;
            intercambiosInsercion = 0;
            ciclosInsercion = 0;
        timeQuick = 0;
            intercambiosQuick = 0;
            ciclosQuick=0;
        inicio = 0;
        fin = 0;
    }
    
    //
    //Impresiones
    //
    public String Imprimir(double tiempo, int ciclos, int inter){
        return "Tiempo: "+tiempo+"\nNúmero de Ciclos: "+ciclos
                +"\nNúmero de Intercambios:"+inter;
    }
    public String ImprimirBurbuja(){
        return Imprimir(timeBurbuja, ciclosBurbuja, intercambiosBurbuja);
    }
    public String ImprimirInsercion(){
        return Imprimir(timeInsercion, ciclosInsercion, intercambiosInsercion);
    }
    public String ImprimirQuick(){
        return Imprimir(timeQuick, ciclosQuick, intercambiosQuick);
    }
    public String Imprimir3primerosYultimos(int A[]){
        String c = "";
        c+=(A[0]+" ; "+A[2]+" ; "+A[3]+"...."
                +A[A.length-3]+" ; "+A[A.length-2]+" ; "+A[A.length-1]);
        return c;
    }
}
