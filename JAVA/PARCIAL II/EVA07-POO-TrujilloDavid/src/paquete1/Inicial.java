/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;


public class Inicial {
    public static void main(String[] args) {
        System.out.println("NOMBRE: DAVID TRUJILLO\n-------------------------------------");
        
        Futbolista f1 = new Futbolista(101, "MATEO PEREZ", 18, 11.3, "DELANTERO");
        Futbolista f2 = new Futbolista(101, "LEO MESSI", 18, 33.3, "DELANTERO");
        Futbolista f3 = new Futbolista(101, "ARMANDO CASAS", 18, 33.3, "PORTERO");
        Entrenador e1 = new Entrenador(1111, "MARIO NETA", 33, "IMBABURA");
        Entrenador e2 = new Entrenador(1111, "SUSAS ORIA", 33, "PICHINCHA");
        Masajista m1 = new Masajista(5, 100181, "ALAN SANDOVAL", 45, "FISIOTERAPEUTA");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(m1.toString());
        
        System.out.println("\n-----------------Concentrarse---------------");
        System.out.println(f1.Concentrarse());
        System.out.println(f2.Concentrarse());
        System.out.println(f3.Concentrarse());
        System.out.println(e1.Concentrarse());
        System.out.println(e2.Concentrarse());
        System.out.println(m1.Concentrarse());
        
        System.out.println("\n-----------------Viajar---------------");
        System.out.println(f1.Viajar());
        System.out.println(f2.Viajar());
        System.out.println(f3.Viajar());
        System.out.println(e1.Viajar());
        System.out.println(e2.Viajar());
        System.out.println(m1.Viajar());
        
        
    }
}
