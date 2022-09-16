
package com.varios;

/**
 *
 * @author Asus
 */
public class Pilas1 extends Estructuras1{
    public Pilas1(int tamanio) {
        super(tamanio);
    }

    @Override
    public Object Extraer() {
        if(EstaVacia()){
            return null;
        }
        else{
            Object aux;
            aux = estructura[0];
            for (int i = 1; i < estructura.length; i++) {
                estructura[i-1] = estructura[i];
            }
            estructura[estructura.length-1] = null;
            return aux;
        }
    }

    @Override
    public Object Primero() {
        if(EstaVacia()){
            return null;
        }
        else{
            Object aux = null;
            for (int i = estructura.length -1; i >= 0; i--) {
                if(estructura[i]!=null){
                    aux = estructura[i];
                    i = -1;
                }
            }
            return aux;
        }
    }
    
    
    
}
