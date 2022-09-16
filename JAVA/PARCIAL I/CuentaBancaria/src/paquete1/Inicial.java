
package paquete1;



public class Inicial {
   
    public static void main(String[] args) {
        Cuenta c1,c2,c3;
        c1 = new Cuenta("Marco Pérez", 1, 12, 1981, 125);
        c2 = new Cuenta("MARIA PEREZ", 1, 1, 2001, 500);
        
        System.out.println(c1.ImprimirDatos()+"\n"+c1.ImprimirSaldo());
        
    }
}
