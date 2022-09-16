
package com.varios;

import Interfaces.TiposDeDatos;


public class Inicial {
    public static void main(String[] args) {
        Plantas p1 = new  Plantas("Girasol", 10);
        Carnivoros c1 = new Carnivoros("Leon", 2);
        Herbivoros h1 = new Herbivoros("Vaca", 1);
        
        System.out.println(p1.toString() + "\n"+p1.Alimentarse());
        
        SerVivo[] arreglo = {p1,c1,h1};
        for (SerVivo serVivo : arreglo) {
            System.out.println(serVivo);
        }
        
        
        TiposDeDatos ob1 = new TiposDeDatos();
        System.out.println(ob1.MetodoString("Hola"));
        System.out.println(ob1.MetodoInt(5));
        
    }
}
