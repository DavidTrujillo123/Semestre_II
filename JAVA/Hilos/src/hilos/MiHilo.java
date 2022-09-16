/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Asus
 */
public class MiHilo implements Runnable{

    Thread hilo;
    boolean suspender; //Suspende un hilo cuando es true
    boolean pausar;    //Detiene un hilo cuando es true
    MiHilo (String nombre){
        hilo=new Thread(this,nombre);
        suspender=false;
        pausar=false;
    }
    public static MiHilo crearEIniciar(String nombre){
        MiHilo miHilo=new MiHilo(nombre);
        miHilo.hilo.start(); //Iniciar el hilo
        return miHilo;
    }
    
    @Override
    public void run() {
        System.out.println(hilo.getName()+ " iniciando.");
        System.out.println("aa");
        //System.out.println(hilo.getName()+ " finalizado.");
    }
    //Pausar el hilo
    synchronized void pausarhilo(){
        pausar=true;
        //lo siguiente garantiza que un hilo suspendido puede detenerse.
        suspender=false;
        notify();
    }
    //Suspender un hilo
    synchronized void suspenderhilo(){
        suspender=true;
    }
    //Renaudar un hilo
    synchronized void renaudarhilo(){
        suspender=false;
        notify();
    }
    
}
