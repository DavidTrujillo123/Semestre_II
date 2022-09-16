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
public class DocenteOcasional extends Docente {
    
    private int horas;
    
    public DocenteOcasional(String asignatura, String nombre, int edad, String cedula, int horas) {
        super(asignatura, nombre, edad, cedula);
        
            this.horas = horas;

    }
    @Override
    public String Hablar() {

        return "DocenteOcasional: Hola me llamo " + this.getNombre();
    }

    @Override
    public String Calificar() {
        return "DocenteOcasional: Calificando";
    }

    @Override
    public String toString() {
        
        return super.toString() + " Horas: " + this.horas;
    }

}