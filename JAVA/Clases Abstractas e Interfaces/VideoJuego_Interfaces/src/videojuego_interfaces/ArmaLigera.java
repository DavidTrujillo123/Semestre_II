/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego_interfaces;

/**
 *
 * @author Asus
 */
public class ArmaLigera implements Arma{
    
    @Override
    public String Disparar() {
        return "Dispara rapido";
    }

    @Override
    public String Recargar() {
        return "Recarga rapido";
    }
    @Override
    public String Dañar() {
        return "Daño bajo";
    }
}
