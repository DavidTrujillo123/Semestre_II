/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adc.complementoa2;

/**
 *
 * @author Asus
 */
public class ADCComplementoA2 {

    public static void ComplementoA2(int[] num, int base){
        boolean comprobar = false;//lleno bits
        int[] res;
        for (int i = 0; i < num.length; i++) {
            if(num[i]!= base-1) comprobar= true;//no esta lleno de bases
        }
        
        if(comprobar){
            res = new int[num.length];
            int aux;
            aux = num[num.length-1]+1;
            
            for (int i = num.length-1; i >= 0 ; i--) {
                if(aux > base-1){
                    res[i]=0;
                    aux = num[i-1]+1;
                }
                else if(aux<= base-1 && aux!=0){
                    res[i] = aux;
                   aux=0;
                    
                }
                else{
                    res[i] = num[i];
                    
                }
            }
            for (int re : res) {
                System.out.print(re);
            }
        }
        else{
            res = new int[num.length+1];
            res[0] = 1;
            for (int re : res) {
                System.out.print(re);
            }
        }
        
    }
    public static int[] ComplementoA1(int[] partes, int base){
        
        int[] complemento = new int[partes.length];
        
        for (int i = 0; i < partes.length; i++) {
            complemento[i] = Math.abs((base-1) - partes[i]);
        }
        return complemento;
    }
    public static int[] Transformar(String num){
        int[] partes = new int[num.length()];
        
        for (int i = 0; i < num.length(); i++) {
            partes[i] = Integer.valueOf(num.charAt(i)+"");
        }
        return partes;
    }
    public static int[] TransformarHexa(String num){
        int[] partes = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == 'A'){
                partes[i] = 10;
            }
            else if (num.charAt(i) == 'B'){
                partes[i] = 11;
            }
            else if (num.charAt(i) == 'C'){
                partes[i] = 12;
            }
            else if (num.charAt(i) == 'D'){
                partes[i] = 13;
            }
            else if (num.charAt(i) == 'E'){
                partes[i] = 14;
            }
            else if (num.charAt(i) == 'F'){
                partes[i] = 15;
            }
            else{
                partes[i] = Integer.valueOf(num.charAt(i)+"");
            }
        }
        return partes;
    }
    public static void main(String[] args) {
        int base = 8;
        String num;
        num = "22";
        
        int[] n;
        if(base!=16){
            n = Transformar(num);
        }
        else{
            n = TransformarHexa(num);
        }
        n = ComplementoA1(n, base);
        ComplementoA2(n,base);
       
        
    }
    
}
