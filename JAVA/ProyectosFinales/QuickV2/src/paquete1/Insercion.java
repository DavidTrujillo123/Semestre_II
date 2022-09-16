
package paquete1;

public class Insercion extends Ordenar{

    public Insercion(int[] A) {
        super(A);
    }
  
    @Override
    public void Ordenar() {
        long inicio = System.nanoTime(); 
         
        int pos, aux;
        for (int i = 0; i < A.length; i++) {
            pos = i;
            aux = A[i];
            
            while(pos>0 && aux<A[pos-1]){
                A[pos] = A[pos-1];
                pos--;
                intercambios++;
                ciclos++;
            }
            ciclos++;
            A[pos] = aux;
        }
        
        long fin = System.nanoTime()-inicio;
        
        super.tiempo = fin/1e6; 
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
    
    
}
