/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego_interfaces;

/**
 *
 * @author Asus
 */
public class Jugador implements Arma, Armadura, Herramienta{
//    private ArmaLigera a1;
//    private Escudo e1;
//    private Hacha h1;
    public Jugador(){
//        a1 = new ArmaLigera();
//        e1 = new Escudo();
//        h1 = new Hacha();
    }
    @Override
    public String Disparar() {
        //return "El jugador esta disparando con una arma que"+a1.Disparar();
        return "El jugador esta disparando";
    }

    @Override
    public String Recargar() {
        //return "El jugador esta recargando una arma que "+a1.Recargar();
        return "El jugador esta recargando";
    }

    @Override
    public String Dañar() {
        //return "El jugador esta dañando con un arma con un "+a1.Dañar();
        return"El jugador esta haciendo daño";
    }

    @Override
    public String Proteger() {
        //return "El jugador se esta protegiendo con una armadura con "+e1.Proteger();
        return "El jugador se esta protegiendo";
    }

    @Override
    public String Trabajar() {
        //return "El jugador esta trabajando con una herramienta que "+h1.Trabajar();
        return "El jugador esta trabajando";
    }
    
    
}
