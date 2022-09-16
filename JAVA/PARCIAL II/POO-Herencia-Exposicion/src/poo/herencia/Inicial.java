/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

/**
 *
 * @author Jeremy
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Estudiante estudiante = new Estudiante("FICA", 2, "Pedro", 20, "1005129435");
//        Docente docente = new Docente("POO", "A", 30, "10076547382");
//        
//       
//        Persona []p= new Persona [2];
//        
//        p[0] = estudiante;
//        p[1] = docente;
//        
//        for (Persona persona : p) {
//            
//            System.out.println(persona.Hablar());
//            
//        }
//        
        Persona p1 = new Persona("JULIO", 11, "1111");
            
        Dato<Integer> dato = new Dato(2.1);
        Dato<Double> dato1 = new Dato(4.2);
        Dato<Persona> dato2 = new Dato(p1);
        System.out.println("Valor: "+dato.getValor());
        System.out.println("Valor: "+dato1.getValor());
        System.out.println("Valor: "+dato2.getValor());
    }
    
}
