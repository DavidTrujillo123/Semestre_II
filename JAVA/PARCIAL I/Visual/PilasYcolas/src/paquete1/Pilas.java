/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Pilas {
    private Object[] obj;
    private static int cont;
    
    public Pilas(int tamanio){
        obj = new Object[tamanio];
        cont = tamanio;
    }
    public Pilas(){
        obj = new Object[10];
        cont = obj.length;
    }

    public Object[] getObj() {
        return obj;
    }
    public void Apilar(Object obj){
        this.obj[cont-1] = obj;
        cont--;
    }
    public void DesApilar(int num){
        num = this.obj.length - num;
        int aux = 0;
        for (int i = 0; i < num; i++) {
            if(this.obj[i]!=null){
                aux++;
                this.obj[i] =null;
            }
        }
        cont+=aux;
    }
    public void DesApilar()
    {
        int aux = 0;
	for (int i = 0; i < this.obj.length; i++)
        {
            if (obj[i] != null)
            {
                aux = i;
                break;
            }
        }
        obj[aux] = null;
        if(cont < obj.length) cont++;
    }
    public String ImprimirObjeto(){
        String c = "";
        int aux = this.obj.length-1;
        for (int i = 0; i < this.obj.length; i++) {
            if (this.obj[i] != null){
                if(this.obj[i] instanceof Circunferencia)
                    c += aux+".-"+((Circunferencia)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Fecha)
                    c += aux+".-"+((Fecha)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Triangulo)
                    c += aux+".-"+((Triangulo)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Cuadrado)
                    c +=aux+".-"+((Cuadrado)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Punto)
                    c += aux+".-"+((Punto)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof SegmentoRecta)
                    c+= aux+".-"+((SegmentoRecta)this.obj[i]).Imprimir();
            }
            aux--;
        }
        return c;
    }
}
