
package paquete1;

public class Main {
    
    
    public static void main(String[] args) {
        
        Fecha f1,f2,f3,f4,f5, f6;
        f1 = new Fecha(30,12,2006);
        f2 = new Fecha(27,8,2022);
        
        System.out.println(f1.Imprimir());
        System.out.println(f2.Imprimir());
        f3 = f1.Edad(f2);
        System.out.println(f3.Imprimir());
    }
}
