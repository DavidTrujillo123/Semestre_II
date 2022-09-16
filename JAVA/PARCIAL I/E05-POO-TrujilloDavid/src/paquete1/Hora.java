/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    public Hora(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        
        if(hora < 0 || hora > 23){
            this.hora = 1;
        }
        if(min<0 || min > 59){
            this.min = 1;
        }
        if (seg < 0 || seg > 59){
            this.seg = 1;
        }
    }
    public Hora(){
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }
    public int TotalSegundos(){
        int segTotales = 0;
        segTotales += this.hora * 3600;
        segTotales += this.min * 60;
        segTotales += this.seg;
        return segTotales;
    }
    public void DesdeSegundos(int seg){
        this.hora = seg/3600;
        seg = seg%3600;
        this.min = seg/60;
        seg = seg%3600;
        this.seg = seg%60;
    }
    public int SegundosDesde(int hora, int min, int seg){
        return Math.abs((this.hora - hora)*3600)+Math.abs((this.min-min)*60)
                + Math.abs(this.seg - seg);
    }
    public int SegundosDesde(Hora h){
        return SegundosDesde(h.hora,h.min,h.seg);
    }
    public void IncrementarSeg(){
        if(this.seg == 59){
            this.seg = 0;
            if(this.min == 59){
                this.min = 0;
                if(this.hora == 23){
                    this.hora = 0;
                }
                else this.hora++;
            }else this.min++;
            
        }else this.seg++;
    }
    public void DecrementarSeg(){
        if(this.seg == 0){
            this.seg = 59;
            if(this.min == 0){
                this.min = 59;
                if(this.hora == 0){
                    this.hora = 23;
                }
                else this.hora--;
            }else this.min--;
            
        }else this.seg--;
    }
    public int Comparar(int hora, int min, int seg){
        if(this.hora > hora){
            return 1;
        }
        else if(this.hora == hora){
            if(this.min > min){
                return 1;
            }
            else if(this.min == min){
                if(this.seg > seg){
                    return 1;
                }
                else if(this.seg == seg){
                    return 0;
                }
                else {
                    return -1;
                }
            }
            else {
                return -1;
            }
        }
        else{
            return -1;
        }
    }
    public int Comparar(Hora h){
        return Comparar(h.hora, h.min, h.seg);
    }
    public boolean IgualQue(int hora, int min, int seg){
        int res = Comparar(hora, min, seg);
        return res == 0;
    }
    public boolean IgualQue(Hora h){
        return IgualQue(h.hora, h.min, h.seg);
    }
    public boolean MayorQue(int hora, int min, int seg){
        int res = Comparar(hora, min, seg);
        return res == 1;
    }
    public boolean MayorQue(Hora h){
        return MayorQue(h.hora, h.min, h.seg);
    }
    public boolean MenorQue(int hora, int min, int seg){
        int res = Comparar(hora, min, seg);
        return res == -1;
    }
    public boolean MenorQue(Hora h){
        return MenorQue(h.hora, h.min, h.seg);
    }
    public Hora Copia(){
        
        return new Hora(this.hora, this.min, this.seg);
    }
    public String Imprimir(){
        return this.hora+": "+this.min+": "+this.seg;
    }
    public String Imprimir12h(){
        String c;   
        if(this.hora < 12){
            c = this.hora+":"+this.min+":"+this.seg+"am";
        }
        else{
            if(this.hora == 12) c = this.hora+":"+this.min+":"+this.seg+"pm";
            else{
                hora = this.hora - 12;
                c = hora+":"+this.min+":"+this.seg+"pm";
            }
        }
        return c;
    }
    
}
