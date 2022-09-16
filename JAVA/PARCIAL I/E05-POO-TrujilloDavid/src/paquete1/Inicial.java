
package paquete1;


public class Inicial {
    public static void main(String[] args) {
        Hora h1,h2,h3, h4, h5, h6, h7;
        h1 = new Hora(23, 59, 59);
        h2 = new Hora(0, 0, 0);
        h3 = new Hora(1, 1, 59);
        h4 = new Hora(0, 1, 30);
        h5 = new Hora(0, 0, 0);
        
        h6 = h1.Copia();
        
        System.out.println(h1.Imprimir12h());
        
        System.out.println(h1.Imprimir());
        h1.IncrementarSeg();
        System.out.println(h1.Imprimir());
        h2.DecrementarSeg();
        System.out.println(h2.Imprimir());
        
        System.out.println(h3.Comparar(1, 0, 59));
        System.out.println(h3.IgualQue(1, 1, 59));
        System.out.println(h3.MayorQue(2, 0, 0));
        
        h5.DesdeSegundos(3700);
        
        System.out.println(h4.TotalSegundos());
        System.out.println(h5.Imprimir());
        System.out.println(h6.Imprimir());
        
        h7 = new Hora(-1, -5, -23);
        System.out.println(h7.Imprimir());
        
    }
}
