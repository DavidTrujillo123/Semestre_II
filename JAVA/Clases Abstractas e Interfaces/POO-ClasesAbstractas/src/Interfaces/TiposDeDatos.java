/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Asus
 */
public class TiposDeDatos implements Interfaces,Interface2{

    @Override
    public String MetodoString(String h) {
        return "String "+h;
    }

    @Override
    public int MetodoInt(int a) {
        return a;
    }

    @Override
    public boolean MetodoBoolean(boolean a) {
        return a;
    }

    @Override
    public double MetodoDouble(double a) {
        return a;
    }
    
}
