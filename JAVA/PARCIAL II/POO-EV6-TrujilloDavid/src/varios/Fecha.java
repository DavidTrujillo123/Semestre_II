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
    private int dia,mes,anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int Comparar(int dia,int  mes , int anio){
        if(this.anio >anio){
            return 1;
        }
        else if (this.anio == anio){
            if(this.mes>mes)
                return 1;
            else if(this.mes == mes){
                if(this.dia > dia)
                    return 1;
                else if(this.dia < dia)
                    return -1;
                else return 0;
            }
            else{
                return -1;
            }
        }
        else return -1;
    }
    public int Comparar(Fecha f){
        return Comparar(f.dia, f.mes, f.anio);
    }
    @Override
    public String toString(){
        return dia+"-"+mes+"-"+anio;
    }
}
