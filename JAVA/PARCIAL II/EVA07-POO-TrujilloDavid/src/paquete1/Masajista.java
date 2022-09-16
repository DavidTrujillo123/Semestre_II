/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Masajista extends Persona{
    protected String titulo;
    protected int aniosExp;

    public Masajista(int aniosExp, int id, String nombre, int edad, String titulo) {
        super(id, nombre, edad);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }
    
    public String DarMasaje(){
        return "El masajista "+super.nombre+" esta dando un masaje";
    }
    @Override
    public String Concentrarse() {
        return "El masajista "+super.nombre+" se esta concentrando";
    }

    @Override
    public String Viajar() {
        return "El entrenador "+super.nombre+" esta viajando";
    }

    @Override
    public String toString() {
        return super.toString() + " Titulo: "+titulo+" Años Experiencia: "+aniosExp;
    }
    
    
    
}
