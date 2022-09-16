
package com.varios;

public class Stack {
    private Bloque[] bloqueActual;
    private int cont;
    private boolean comprobar;
    public Stack(int tamanio){
        bloqueActual = new Bloque[tamanio];
        cont = tamanio;
    }

    public Bloque[] getBloqueActual() {
        return bloqueActual;
    }
    
    
    /***
     * 
     * Comprueba si el arreglo de bloques esta vacio
     * @return false -> si tiene almenos un elemento true-> si todos sus elementos son null
     */
    public boolean ComprobarStackVacio(Bloque[] torre){
        for (int i = 0; i < torre.length; i++) {
            if(torre[i] != null ) return false;
        }
        return true;
    }
    
    /***
     * Comprueba si el nuevo bloque a apilar es de mayor tamanio
     * @param nuevoBloque
     * @return false -> si el nuevo bloque a apilar es mayor  true -> si el nuevo bloque a apilar es menor  
     */
    public boolean ComprobarBloque(Bloque nuevoBloque){
        return (nuevoBloque.ComprobarAnterior(bloqueActual[cont]));
    }
    
    /***
     * Comprueba si la torre esta vacia o tiene algun elmento.
     * Si exite algun elemento entoces lo compara. 
     * @param torre
     * @param bloqueAmover
     * @return Si la comparacion es true significa que si es posible apilar
     */
    public boolean ComprobarStack(Stack torre, Bloque bloqueAmover){
        int iter=-1;
        if(ComprobarStackVacio(torre.bloqueActual))
            return false;
        else{
            for (int i = torre.bloqueActual.length-1; i >=0 ; i--) {
                if(torre.bloqueActual[i] !=null){
                    iter = i;   
                }
            }
            if((torre.bloqueActual[iter]).ComprobarAnterior(bloqueAmover))
                return true;
        }
        return false;
    }
    
    /***
     * Apila un nuevo elemento
     * @param nuevoBloque 
     */
    public void Apilar(Bloque nuevoBloque){
        if(cont == bloqueActual.length){
            this.bloqueActual[cont-1] = nuevoBloque;
            cont--;
            comprobar = true;
        }
        else if(ComprobarBloque(nuevoBloque)){
            this.bloqueActual[cont-1] = nuevoBloque;
            cont--;
            comprobar = true;
        }
    }
    /***
     * Busca un objeto bloque en la torre actual
     * Si es que es posible moverlo a cualquier torre ese bloque se volverá null
     * en esa torre
     * @param torre
     * @return 
     */
    public Bloque DesApilar(Stack torre)
    {
        
        Bloque bloqueDesapilado;
        int aux = 0;
        
	for (int i = 0; i < this.bloqueActual.length; i++)
        {
            if (bloqueActual[i] != null)
            {
                aux = i;
                break;
            }
        }
        bloqueDesapilado = bloqueActual[aux];
        
        if(ComprobarStack(torre, bloqueDesapilado) == false){
            bloqueActual[aux] = null;
            if(cont < bloqueActual.length) cont++;
        }
        return bloqueDesapilado;
    }
    public String Imprimir(){
        String c = "Torre: \n";
        
        for (int i = 0; i < bloqueActual.length; i++) {
            if(bloqueActual[i] != null)
                c+=bloqueActual[i].getLargo()+"\n";
            else{
                c+="null\n";
            }
        }
        return c;
    }
    
}
