/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

/**
 *
 * @author Jeremy
 */
public class Persona {

    public String nombre;
    protected int edad;
    private String cedula;

    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    
    public String Hablar() {
        return "Persona: Hola, mi nombre es " + this.getNombre();
    }

    public String Calificar() {
        return "Persona: Calificando";
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + '}';
    }
     public int Suma(int x, int y){
        return x+y;
    }

}
