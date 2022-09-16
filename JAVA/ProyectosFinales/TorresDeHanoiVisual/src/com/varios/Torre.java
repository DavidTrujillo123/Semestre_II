/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;

import javax.swing.JPanel;

public class Torre {
    protected Bloque[] bloques;
    protected static int cont;
    //Constructor que recibe el tamanio
    public Torre(int tamanio) {
        this.bloques = new Bloque[tamanio];
    }
    
    //Obtener el bloque
    public Bloque getBloques(int i) {
        return bloques[i];
    }
    
    //Obtiene el panel
    public JPanel getPanel(int i){
        return bloques[i].getBloque();
    }
    
    //Indica cual es la posicion del primer bloque que extiste en la torre
    public int BuscarBloque(){
        int aux = -1;
        for (int i = 0; i < bloques.length; i++) {
            if(bloques[i] != null){
                aux = i;
                i = bloques.length;
            }
        }
        return aux;
    }
    
    //Aniade objetos tipo bloque, donde si esta vacio BuscarBloque() sera -1
    //y sino utiliza BuscarBloque() para saber cual es la posicion del primer bloque y resta -1 
    //para cambiar la posicion
    //Nota: se llena de atras hacia delante
    public void Aniadir(Bloque b){
        
        if(BuscarBloque() == -1){
            bloques[bloques.length-1] = b;
        }
        else{
            bloques[BuscarBloque()-1] = b;
        }
       
    }
    
    //Retorna el bloque que se pasará a la otra torre
    public Bloque Extraer(){
        int aux = BuscarBloque();
        
        if(aux >= 0){
            return bloques[aux];
        }
        else{
            return null;
        }
    }
    
    //Cumple la condicion de que un bloque de mayor tamanio no puede ir sobre uno de menor
    public boolean Comprobar(Torre t){
        int aux1;
        int aux2;
        boolean bandera;
        aux1 = t.BuscarBloque();
        aux2 = BuscarBloque();
        
        if(aux2 >= 0){
            if(aux1 == -1){//Significa que esta vacio
                return true;
            }
            else{
                bandera = this.getBloques(aux2).ComprobarAnterior(t.getBloques(aux1)); //Condicion
                if(bandera){
                    return true;
                }
            }
        }
        return false;
    }
    
    //Mueve el bloque
    //Apilará el bloque que se desapila en la torre del parametro
    //Situa el bloque en sus respectivas coordeandas
    public void Mover(Torre t){
        int x,y;
        int aux1 = t.BuscarBloque();
        Bloque aux = Extraer();
        x = aux.X();//Ubicacion x del mismo bloque
       // if(Comprobar(t)){
            //Bloque a mover
            
            //Pone la ubicacion correcta
            if(aux1 == -1){//torre vacia
                aux.bloque.setLocation(x,300);//posicion final
            }
            else{//torre con bloques
                y = t.bloques[aux1].Y()-50;//toma el primer bloque encontrado y aplicamos la escala
                aux.bloque.setLocation(x,y);
            }
            
            t.Aniadir(aux);//Mueve el bloque a la torre del parametro  
            cont++;//contador de movimientos
            
            //Vulelve null el objeto que retorno Extraer
            for (int i = 0; i < bloques.length; i++) {
                if(aux.equals(bloques[i])){
                    bloques[i] =null;
                }
            }
            System.gc();
        //}
    }
    
    //Vuelve todos los bloques a null
    public void Limpiar(){
        for (int i = 0; i < bloques.length; i++) {
            bloques[i]=null;
        }
        System.gc();
    }
    
    public void Seleccionar(){
        int iter = BuscarBloque();
        if(iter != -1){
            int x;
            //x = bloques[iter].getBloque().getX();
            x = bloques[iter].X();
            bloques[iter].getBloque().setLocation(x,10);//sube el bloque
        }
    }
    public void Regresar(){
        int x,y;
        int iter = BuscarBloque();//Busca un bloque si no lo encuentrad devuelve -1
        if(iter > -1){
            x = bloques[iter].X();    
            if(iter != bloques.length-1){
                y = bloques[iter+1].Y();//si existe un bloque anterior toma su Y
                bloques[iter].getBloque().setLocation(x,y-50);//aplica escala solo en Y
            }
            else
                bloques[iter].getBloque().setLocation(x,300);//lo regresa al final
        }
    }
    
    //Imprime por consola
    @Override
    public String toString(){
        String c = "";
        for (int i = 0; i < bloques.length; i++) {
            
            if(bloques[i]!=null){
                if(i != bloques.length-1){
                    c+= bloques[i].toString();
                }
                else c+= bloques[i].toString()+"s\n";
            }
            
        }
        return c;
    }
}
