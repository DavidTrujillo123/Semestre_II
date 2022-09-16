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
public class Estudiante extends Persona {

    private String facultad;
    private int nivel;

 
    public Estudiante(String facultad, int nivel, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        
        this.facultad = facultad;
        this.nivel = nivel;
    }
    public int Suma(int x, int y, int z){
        return Suma(x, y)+z;
    }
    @Override
    public String Hablar() {
        return "Estudiante: hablando....." + this.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public String Calificar() {
       
        return super.Hablar() + " Estudiante: Calificando";
    }

    @Override
    public String toString() {
        return super.toString()+ "Facultad: " + this.facultad + " Nivel: " + this.nivel; //To change body of generated methods, choose Tools | Templates.
    }

   
   
   

}
