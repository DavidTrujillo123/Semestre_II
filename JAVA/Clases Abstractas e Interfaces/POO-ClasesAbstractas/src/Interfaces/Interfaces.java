/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Asus
 */
public interface Interfaces {
    public String MetodoString(String h);
    public int MetodoInt(int a);
    boolean MetodoBoolean(boolean a);
    
    public default int Num(){
        return 1;
    }
    
}
