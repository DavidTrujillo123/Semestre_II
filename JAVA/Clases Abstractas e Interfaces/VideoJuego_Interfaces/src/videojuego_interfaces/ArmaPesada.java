/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego_interfaces;

/**
 *
 * @author Asus
 */
public class ArmaPesada implements Arma{

    @Override
    public String Disparar() {
        return "Dispara lento";
    }

    @Override
    public String Recargar() {
        return "Recarga lento";
    }
    @Override
    public String Dañar() {
        return "Daño alto";
    }
    
}
