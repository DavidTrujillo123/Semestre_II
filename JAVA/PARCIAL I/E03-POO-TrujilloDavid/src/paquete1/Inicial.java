
package paquete1;

/**
 *
 * @author Asus
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vectores3D v1 = new Vectores3D(0,0,0,3,4,5);
        Vectores3D v2 = new Vectores3D(0,0,0,1,2,3);
        Vectores3D v3;
        
        
        System.out.println(v1.Comparar(v2));
        
        System.out.println(v1.Imprimir());
        System.out.println(v2.Imprimir());
        
        v3 = v1.Sumar(v2);
        System.out.println(v3.Imprimir());
        
        System.out.println(v1.CalcularNorma());
        
    }
    
}
