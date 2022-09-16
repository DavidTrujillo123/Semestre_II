
package javaapplication7;

public class NumeroComplejo {
    private int real;
    private int imaginario;

    public NumeroComplejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public NumeroComplejo(){
        this.real = 1;
        this.imaginario = 1;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
    
    
    public NumeroComplejo Sumar(int real1, int imaginario1){
        int a = this.real;
        int b = this.imaginario;
        a += real1;
        b += imaginario1;
        
        NumeroComplejo n1 = new NumeroComplejo(a, b);
        
        return n1;
    }
    public NumeroComplejo Sumar(NumeroComplejo num){
        return Sumar(num.real, num.imaginario);
    }
    public NumeroComplejo Restar(int real1, int imaginario1){
        int a = this.real;
        int b = this.imaginario;
        a -= real1;
        b -= imaginario1;
        
        NumeroComplejo n1 = new NumeroComplejo(a, b);
        
        return n1;
    }
    public NumeroComplejo Restar(NumeroComplejo num){
        
        return Restar(num.real, num.imaginario);
    }
    public NumeroComplejo Multiplicacion(int real, int imaginario){
        int a = this.real;
        int b = this.imaginario;
        int imag, rea;
        
        a = this.real*real;
        imag = this.real*imaginario;
        
        b = this.imaginario*real;
        rea = this.imaginario * imaginario *(-1);
        
        a += rea;
        b += imag;
        
        NumeroComplejo n1 = new NumeroComplejo(a, b);
        return n1;
    }
    public NumeroComplejo Multiplicacion(NumeroComplejo num){
        return Multiplicacion(num.real, num.imaginario);
        
    }
    public String Imprimir(){
        if(this.imaginario >= 0) return "("+this.real+" + "+this.imaginario+"i)";
        else return "("+this.real+" "+this.imaginario+"i)";
    }
    
    
}
