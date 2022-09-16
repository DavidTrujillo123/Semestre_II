
package repasoevamatrices;

import java.util.Random;

public class Matriz {
    private int[][] matriz;
    
    public Matriz(int fil, int col){
        matriz = new int[fil][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[col];
        }
    }
    public Matriz(){
        matriz = new int[3][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[3];
        }
    }
    public void LlenarMatriz(int inicio, int fin){
        int aux;
        if(inicio > fin){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        Random rn = new Random();
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                this.matriz[i][j] = rn.nextInt(inicio, fin+1);
            }
        }
    }
    public int NumMayor(){
        int num;
        int mayor = -999;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                if(matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
//    public int[] PosNumMayor(){
//        int mayor = NumMayor();
//        int fil = 0, col = 0;
//        for (int i = 0; i < this.matriz.length; i++) {
//            for (int j = 0; j < this.matriz[0].length; j++) {
//               if(mayor == matriz[i][j]) {
//                   fil = i;
//                   col = j;
//                   break;
//               }
//            }
//        }
//        int[] pos = {fil,col};
//        return pos;
//    }
    public String PosNumMayor(){
        int mayor = NumMayor();
        int fil = 0, col = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
               if(mayor == matriz[i][j]) {
                   fil = i;
                   col = j;
                   break;
               }
            }
        }
        return fil+","+col;
    }
    public int NumMenor(){
        int num;
        int menor = 999;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }
    public String PosNumMenor(){
        int menor = NumMenor();
        boolean res = false;
        int fil = 0, col = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                
               if(menor == matriz[i][j]) {
                   fil = i;
                   col = j;
                   res = true;
                   break;
               }
            }
            if(res) break;
        }
        return fil+","+col;
    }
    public String ImprimirMatriz(){
        String c = "";
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                c+= "   "+this.matriz[i][j];
            }
            c+="\n";
        }
        return c;
    }

}
