
package figuras;


public class Main {
    public static void FigCircunferencia(int x, int y, double radio){
        Circunferencia c1 = new Circunferencia();
        Circunferencia c2 = new Circunferencia();
        c1.x = x;
        c1.y = y;
        c1.radio = radio;
        
        System.out.println("Circulo 1 \n"+c1.toString()); 
        //System.out.println("Circulo 1 \n"+"Punto centro: "+c1.x+","+c1.y+"\nRadio: "+c1.radio+"\nArea: "+c1.CalcularArea()+"\nPerimetro: "+c1.CalcularPerimetro());
        System.out.println("");
        
        int dx = 2;
        int dy = 3;
        c1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+c1.x+","+c1.y+")");
        
        c2.x = x;
        c2.y = y;
        c2.radio = 5.2;
        
        System.out.println("");
        System.out.println("Circulo 2 \n"+c2.toString()); 
        System.out.println("");      
        
        dx = 3;
        dy = 4;
        c2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+c2.x+","+c2.y+")");
    }
    public static void FigCuadrado(int x, int y, double lado){
        Cuadrado cua1 = new Cuadrado();
        Cuadrado cua2 = new Cuadrado();
        
        cua1.x = x;
        cua1.y = y;
        cua1.lado = lado;
        
        System.out.println("Cuadrado 1\n"+cua1.toString());
        System.out.println("");
        
        int dx,dy;
        dx = -3; dy = 6;
        cua1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+cua1.x+","+cua1.y+")");
        System.out.println("");
        
        cua2.x = 2;
        cua2.y = 8;
        cua2.lado = 5;
        
        System.out.println("Cuadrado 2\n"+cua2.toString());
        System.out.println("");
        
        dx = 3;
        dy = 3;
        cua2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+cua2.x+","+cua2.y+")");
    }
    public static void FigRectangulo(int x, int y, int ladoMayor, int ladoMenor){
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo();
        
        rec1.x = x;
        rec1.y = y;
        rec1.ladoMayor = ladoMayor;
        rec1.ladoMenor = ladoMenor;
        
        System.out.println("Rectangulo 1\n"+rec1.toString());
        System.out.println("");
        
        int dx,dy;
        dx = 5; dy = 5;
        rec1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+rec1.x+","+rec1.y+")"); 
        System.out.println("");
        
        rec2.x = x;
        rec2.y = y;
        rec2.ladoMayor = ladoMayor;
        rec2.ladoMenor = ladoMenor;
        
        System.out.println("Rectangulo 2\n"+rec2.toString());
        System.out.println("");
        
        dx = 1;
        dy = 7;
        rec2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+rec2.x+","+rec2.y+")");
        
    }
    public static void FigElipse(int x, int y, int ejeMayor, int ejeMenor){
        Elipse eli1 = new Elipse();
        Elipse eli2 = new Elipse();
        
        eli1.x = x;
        eli1.y = y;
        eli1.ejeMayor = ejeMayor;
        eli1.ejeMenor = ejeMenor;
        
        System.out.println("Elipse 1\n"+eli1.toString());
        System.out.println("");
        
        int dx, dy;
        dx = 3; 
        dy = 1;
        eli1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+eli1.x+","+eli1.y+")");
        System.out.println("");
        
        eli2.x = y;
        eli2.y = x;
        eli2.ejeMayor = ejeMenor;
        eli2.ejeMenor = ejeMayor;
        
        System.out.println("Elipse 2\n"+eli2.toString());
        System.out.println("");
        
        dx = 3; 
        dy =4;
        eli2.Mover(3, 4);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+eli2.x+","+eli2.y+")");
        
    }
    public static void FigSegmentoRecta(int x1, int y1, int x2, int y2){
        SegmentoRecta sr1 = new SegmentoRecta();
        SegmentoRecta sr2 = new SegmentoRecta();
        
        sr1.x1 = x1;
        sr1.y1 = y1;
        sr1.x2 = x2;
        sr1.y2 = y2;
        
        System.out.println("Segmento 1\n"+sr1.toString());
        System.out.println("");
        
        int dx, dy;
        dx = 3;
        dy = 10;
        sr1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+sr1.x1+","+sr1.y1+")\nPunto 2: ("+sr1.x2+","+sr1.y2+")");
        
        sr2.x1 = x2;
        sr2.y1 = y2;
        sr2.x2 = x1;
        sr2.y2 = y1;
        
        System.out.println("");
        System.out.println("Segmento 2\n"+sr2.toString());
        System.out.println("");
        
        dx = 5;
        dy = 7;
        sr2.Mover(5, 7);
         System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+sr2.x1+","+sr2.y1+")\nPunto 2: ("+sr2.x2+","+sr2.y2+")");
    }
    public static void FigTriangulo(int x1, int y1, int x2, int y2, int x3, int y3){
        Triangulo tr1 = new Triangulo();
        Triangulo tr2 = new Triangulo();
        
        tr1.x1 = x1;
        tr1.y1 = y1;
        
        tr1.x2 = x2;
        tr1.y2 = y2;
        
        tr1.x3 = x3;
        tr1.y3 = y3;
        
        System.out.println("Triangulo 1:\n"+tr1.toString());
        System.out.println("");
        
        int dx,dy;
        dx = 5;
        dy = 6;
        tr1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+tr1.x1+","+tr1.y1+")\nPunto 2: ("+tr1.x2+","+tr1.y2+")\nPunto 3: ("+tr1.x3+","+tr1.y3+")");
        System.out.println("");
        
        tr2.x1 = x2;
        tr2.y1 = y2;
        
        tr2.x2 = x3;
        tr2.y2 = y3;
        
        tr2.x3 = x1;
        tr2.y3 = y1;
        
        System.out.println("Triangulo 2: \n"+tr2.toString());
        System.out.println("");
        
        dx = 2;
        dy = 4;
        tr1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+tr2.x1+","+tr2.y1+")\nPunto 2: ("+tr2.x2+","+tr2.y2+")\nPunto 3: ("+tr2.x3+","+tr2.y3+")");
        System.out.println("");
        
    }
    public static void main(String [] args){
        int x= 1;
        int y = 2;
        int radio = 3;
        System.out.println("        Circunferencia      ");
        FigCircunferencia(x, y, radio);
        System.out.println("");
        
        System.out.println("            Cuadrado");
        int lado = 12;
        FigCuadrado(x, y, lado);
        System.out.println("");      
        
        System.out.println("            Rectangulo");
        int ladoMayor = 8;
        int ladoMenor = 3;
        FigRectangulo(x, y, ladoMayor, ladoMenor);
        System.out.println("");
        
        System.out.println("            Elipse");
        FigElipse(x, y, ladoMayor, ladoMenor);
        System.out.println("");
        
        System.out.println("        Segmento de recta");
        int x2 = 5;
        int y2 = 6;
        FigSegmentoRecta(x, y, x2, y2);
        System.out.println("");
        
        System.out.println("            Triangulo");
        int x3 , y3;
        x = 1; y = 1;
        x2 = 3; y2 = 5;
        x3 = 4; y3 = 2;
        FigTriangulo(x, y, x2, y2, x3, y3);
    }
}
