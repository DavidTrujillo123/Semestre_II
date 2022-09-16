
package varios;

import java.time.LocalDate;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    /**
     * Contructor
     * Si el dia es mayor a 31 o negativo lo convierte en uno
     * Si el mes es mayor a 12 o negativo lo convierto en uno
     * Si el anio es negativo lo convierte en uno
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
//        if(dia > 31 || dia < 1){
//            this.dia = 1;
//        }else this.dia = dia;
//        
//        if(mes > 12 || mes < 1){
//            this.mes = 1;
//        }else this.mes = mes;
        
//        if (anio < 1) this.anio = 1;
//        else this.anio = anio;
    }
    public Fecha(){
        dia = LocalDate.now().getDayOfMonth();
        mes = LocalDate.now().getMonthValue();
        anio = LocalDate.now().getYear();
    }
    //Gettes and Setters
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        if(dia>=1 && dia <= 31)this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        if(mes >=1 && mes <= 12)this.mes = mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        if(anio > 0) this.anio = anio;
    }
    
    /**
     * Metodo que calcula si es anio es biciesto o no
     * @return True -> bisiesto False -> No bisiesto
     * 
     */
    public boolean AnioBisiesto(){
        return (this.anio % 4 == 0) && (this.anio % 400 == 0 || this.anio % 100 != 0);
    } 
    private int DiaMes(int mes){
        if(mes == 2){
            if(this.AnioBisiesto()) return 29;
            else return 28;
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }
        else return 31;
    }
    public int DiaMes(){
        return DiaMes(this.mes);
    }
    public void IncrementarDia(){
        if (this.dia == DiaMes()){
            this.dia = 1;
            if(mes == 12){
                mes = 1;
                anio++;
            }
            else mes++;
        }
        else{
            this.dia++;
        }
    }
    public void IncrementarDia(int n){
        for (int i = 0; i < n; i++) {
            IncrementarDia();
        }
    }
    public void DecrementarDia(){
        if (this.dia == 1){
            if(mes == 1){
                mes = 12;
                anio--;
            }else mes--;
            this.dia = DiaMes();
        }
        else{ 
            this.dia--;
        }
    }
    public void DecrementarDia(int n){
        for (int i = 0; i < n; i++) {
            DecrementarDia();
        }   
    }
    /**
     * Compara el dia, mes y anio dado 
     * @param dia
     * @param mes
     * @param anio
     * @return String de los dias, meses y anio de diferencia
     */
    public int Comparar(int dia, int mes, int anio){
        
        if(this.anio > anio) return 1;
        else{ 
            if(this.anio < anio) return -1;
            else {
                if (this.mes > mes) return 1;
                else{ 
                    if(this.mes < mes) return -1;
                    else{ 
                        if(this.dia > dia) return 1;
                        else{ 
                            if(this.dia< dia) return -1;
                            else return 0;
                        }
                    }
                }    
            }    
        }                   
    }
    public int Comparar(){
        int dia = LocalDate.now().getDayOfMonth();
        int mes = LocalDate.now().getMonthValue();
        int anio = LocalDate.now().getYear();
          
        return Comparar(dia,mes,anio);
    }
    public int Comparar(Fecha fn){
        //fn.dia = 30;//modifica el objeto
        //fn = new Fecha();//no modifica el objeto
        return Comparar(fn.dia, fn.mes, fn.anio);
    }
        public Fecha Edad(int dia, int mes, int anio){
            int diaM, mesM, anioM, diam,mesm, aniom;
            int aux = Comparar(dia, mes, anio);
            if (aux == 1){
                diaM = this.dia;
                mesM = this.mes;
                anioM = this.anio;

                diam = dia;
                mesm = mes;
                aniom=anio;
            }else if(aux == -1){
                diaM = dia;
                mesM = mes;
                anioM = anio;

                diam = this.dia;
                mesm = this.mes;
                aniom = this.anio;
            }else{
                Fecha f = new Fecha(0, 0, 0);
                return f;
            }

            if(diaM < diam){
                mesM --;
                diaM += DiaMes(mesM);
            }
            if(mesM < mesm){
                anioM--;
                mesM += 12;
            }
            int rdia, rmes, ranio;

            rdia = diaM-diam;
            rmes = mesM - mesm;
            ranio = anioM - aniom;

            Fecha f = new Fecha(rdia, rmes, ranio);
            return f;
        }
        public Fecha Edad(){
            int dia = LocalDate.now().getDayOfMonth();
            int mes = LocalDate.now().getMonthValue();
            int anio = LocalDate.now().getYear();

            return Edad(dia, mes, anio);
        }
        public Fecha Edad(Fecha f){
            return Edad(f.dia, f.mes, f.anio);
        }
    public String Imprimir(){
        return this.dia+"dd "+this.mes+"mm "+this.anio+"aa";
    }
    public void Imprimir(boolean condicion){
        if (condicion) System.out.println(this.dia+"dd "+this.mes+"mm "+this.anio+"aa");
        else System.out.println("");;
    }
}
