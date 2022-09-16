
package paquete1;


public abstract class Persona implements Imprimir{
    protected int id;
    protected String nombre;
    protected int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract String Concentrarse();
    public abstract String Viajar();
    
    @Override
    public String toString(){
        return "Id: "+id+" Nombre: "+nombre+" Edad: "+edad;
    }

}
