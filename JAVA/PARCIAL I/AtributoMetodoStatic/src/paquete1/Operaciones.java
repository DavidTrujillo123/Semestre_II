
package paquete1;

public class Operaciones {
   
    public  static int Suma(int x, int y){
        return x + y;
    }
    public static int Resta(int x, int y){
        return x - y;
    }
    public static int Factorial(int x){
        int fact = 1;
        while(x>1){
            fact = fact*x;
            x--;
        }
        return fact;
    }
}
