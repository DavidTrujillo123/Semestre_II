/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Entrenador extends Persona{
    protected String federacion;

    public Entrenador(int id, String nombre, int edad, String federacion) {
        super(id, nombre, edad);
        this.federacion = federacion;
    }
    
    public String DigirPartido(){
        return "El entenador "+super.nombre+" esta dirigiendo un partido";
    }
    public String DirigirEntrenamiento(){
        return "El entenador "+super.nombre+" esta dirigiendo un entrenamiento";
    }
    @Override
    public String Concentrarse() {
        return "El entrenador "+super.nombre+" se esta concentrando";
    }

    @Override
    public String Viajar() {
        return "El entrenador "+super.nombre+" esta viajando";
    }
    
    @Override
    public String toString(){
        return super.toString()+" Federacion: "+federacion;
    }
}
