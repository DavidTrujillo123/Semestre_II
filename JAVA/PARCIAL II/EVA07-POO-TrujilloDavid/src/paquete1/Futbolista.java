/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Futbolista extends Persona{
    protected double peso;
    protected String puesto;

    public Futbolista(int id, String nombre, int edad, double peso, String puesto) {
        super(id, nombre, edad);
        this.peso = peso;
        this.puesto = puesto;
    }
    
    public String JugarPartido(){
        return "El jugador "+super.nombre+" esta jugando un partido";
    }
    public String Entrenar(){
        return "El jugador "+super.nombre+" esta entrenando";
    }
    @Override
    public String Concentrarse() {
        return "El futbolista "+super.nombre+" se esta concentrando";
    }

    @Override
    public String Viajar() {
        return "El futbolista "+super.nombre+" esta viajando";
    }
    
    @Override
    public String toString(){
        return super.toString()+" Peso: "+peso+" Puesto: "+puesto;
    }
    
}
