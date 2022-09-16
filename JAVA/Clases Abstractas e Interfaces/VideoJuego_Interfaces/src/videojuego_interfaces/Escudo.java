/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego_interfaces;

/**
 *
 * @author Asus
 */
public class Escudo implements Armadura{

    @Override
    public String Proteger() {
        return "Proteccion baja";
    }

    @Override
    public String Recargar() {
        return "Recarga rapida";
    }
    
}
