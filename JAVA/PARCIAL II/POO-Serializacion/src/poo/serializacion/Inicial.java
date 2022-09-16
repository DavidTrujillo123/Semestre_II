/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HP
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Administrador jefe = new Administrador("Luis", 1500.50, 2000, 11, 30);

        jefe.setIncentivo(750.50);
        jefe.SubirSueldo(50);

        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;

        personal[1] = new Empleado("Maria", 1500.50, 2012, 12, 2);
        personal[2] = new Empleado("Jose", 950.50, 2021, 1, 23);

        try {
            ObjectOutputStream Fichero = new ObjectOutputStream
                        (new FileOutputStream("C:/Users/Asus/OneDrive/Escritorio/U/SEMETRE II/POO/JAVA/PARCIAL II/Empresa.txt"));
            Fichero.writeObject(personal);
            Fichero.close();

            ObjectInputStream abriendo_fichero = new ObjectInputStream
                         (new FileInputStream("C:/Users/Asus/OneDrive/Escritorio/U/SEMETRE II/POO/JAVA/PARCIAL II/Empresa.txt"));

            Empleado[] empleados = (Empleado[]) abriendo_fichero.readObject();
            abriendo_fichero.close();

            for (int i = 0; i < empleados.length; i++) {
                System.out.println(empleados[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

}
