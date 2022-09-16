/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiacevanumcomplejo;

/**
 *
 * @author Asus
 */
public class NumeroComplejo {
    private int real;
    private int imag;
    
    public NumeroComplejo(int real, int imag){
        this.real = real;
        this.imag = imag;    
    }
    public NumeroComplejo(){
        this.real = 1;
        this.imag = 1;    
    }
   
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }
    
    public NumeroComplejo Sumar(int real, int imag){
        int realr, imagr;
        realr = this.real + real;
        imagr = this.imag + imag;
        
        return new NumeroComplejo(realr, imagr);
    }
    public NumeroComplejo Sumar(NumeroComplejo n){
        return Sumar(n.getReal(), n.getImag());
    }
    public NumeroComplejo Restar(int real, int imag){
        return Sumar(real*(-1),imag*(-1));
    }
    public NumeroComplejo Restar(NumeroComplejo n){
        return Restar(n.getReal(), n.getImag());
    }
    public NumeroComplejo Multiplicar(int real1, int imag1, int real2, int imag2){
        int realr, imagr;
        realr = (real1 * real2)+(imag1*imag2*(-1));
        imagr = (real1*imag2)+(imag1*real2);
        return new NumeroComplejo(realr, imagr);
    }
    public NumeroComplejo Multiplicar(int real, int imag){
        return Multiplicar(this.real, this.imag, real, imag);
    }
    public NumeroComplejo Multiplicar(NumeroComplejo n){
        return Multiplicar(n.getReal(), n.getImag());
    }
    public NumeroComplejo Dividir(int real, int imag){
        NumeroComplejo num = Multiplicar(real, imag*(-1));
        NumeroComplejo den = Multiplicar(real, imag, real, imag*(-1));
              
        int realr =num.getReal() / den.getReal();
        int imagr = num.getImag() / den.getReal();
        
        return new NumeroComplejo(realr, imagr);
    }
    public String Imprimir(){
        if(imag>=0){
            return this.real+" + "+this.imag+"i";
        }
        else
            return this.real+" "+this.imag+"i";
    }
}
