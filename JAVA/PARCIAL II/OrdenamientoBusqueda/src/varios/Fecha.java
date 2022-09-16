/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varios;

/**
 *
 * @author Asus
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int Comparar(Fecha f){
        if(this.anio > f.anio){
            return 1;
        }
        else if(this.anio < f.anio){
            return -1;
        }
        else{
            if(this.mes > f.mes){
                return 1;
            }
            else if(this.mes < f.mes){
                return -1;
            }
            else{
                if(this.dia > f.dia)
                    return 1;
                else if (this.dia < f.dia)
                    return -1;
                else return 0;
            }
        }
    }
    @Override
    public String toString(){
        return this.dia+"-"+this.mes+"-"+this.anio;
    }
}
