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
public class Docente extends Persona {

    public final String asignatura;

    public Docente(String asignatura, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.asignatura = asignatura;
    }

    @Override
    public String Hablar() {

        return "Docente: Hola me llamo " + this.getNombre();
    }

    @Override
    public String Calificar() {
        return "Docente: Calificando";
    }

    @Override
    public String toString() {
        
        return super.toString() + " Asignatura: " + asignatura;
    }

}
