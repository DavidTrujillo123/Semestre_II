
package Interfaces;

public class Interface3 implements Interface2,Interfaces {

    @Override
    public double MetodoDouble(double a) {
        return a;
    }

    @Override
    public String MetodoString(String h) {
        return h;
    }

    @Override
    public int MetodoInt(int a) {
        return a;
    }

    @Override
    public boolean MetodoBoolean(boolean a) {
        return a;
    }
    
}
