
package com.varios;

public abstract class SerVivo {
    private String nombre;
    private int edad;

    public SerVivo(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Edad:"+edad;
    }
    
    
    protected abstract String Alimentarse();
    
}
