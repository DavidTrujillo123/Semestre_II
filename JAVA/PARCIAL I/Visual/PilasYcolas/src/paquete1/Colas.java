/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class Colas {
    private Object[] obj;
    private static int cont = 0;
    
    public Colas(){
        obj = new Object[10];
    }
    public Colas(int tamanio){
        obj = new Object[tamanio];
    }
    public void Colar(Object obj){
        this.obj[cont] = obj;
        Colas.cont++;
    }
    public void DesColar(int num){
        int aux=0;
        for (int i = 0; i <= num; i++) {
            if(this.obj[i] != null){
                obj[i] = null;
                aux++;
            }
        }

        //Para mover la pos
        for (int j = 0; j < obj.length; j++) {
            if(obj[j]!=null){
                obj[j-aux] = obj[j];
                obj[j]=null;
            }
        }
        cont-=aux;
    }
    public void DesColar(){
        obj[0] = null;
        for (int j = 0; j < obj.length; j++) {
            if(obj[j]!=null){
                obj[j-1] = obj[j];
                obj[j]=null;
            }
        }
        cont--;
    }
    public String ImprimirObjeto(){
        String c = "";
        for (int i = 0; i < this.obj.length; i++) {
            if (this.obj[i] != null){
                if(this.obj[i] instanceof Circunferencia)
                    c += i+".-"+((Circunferencia)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Fecha)
                    c += i+".-"+((Fecha)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Triangulo)
                    c += i+".-"+((Triangulo)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Cuadrado)
                    c +=i+".-"+((Cuadrado)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof Punto)
                    c += i+".-"+((Punto)this.obj[i]).Imprimir();
                else if(this.obj[i] instanceof SegmentoRecta)
                    c+= i+".-"+((SegmentoRecta)this.obj[i]).Imprimir();
            }
        }
        return c;
    }
}
