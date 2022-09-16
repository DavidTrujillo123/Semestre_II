
package figuras;


public class Main {
    public static void FigCircunferencia(int x, int y, double radio){
        Circunferencia c1 = new Circunferencia();
        Circunferencia c2 = new Circunferencia(2);
        
        System.out.println(c1.Imprimir()+"\n"+c2.Imprimir()+"\n");
                
        c1.setX(x);
        c1.setY(y);
        c1.setRadio(radio);
        
        System.out.println("Circulo 1 \n"+c1.Imprimir()+"\n"); 
        
        int dx = 2;
        int dy = 3;
        c1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+c1.getX()+","+c1.getY()+")\n");
        
        c2.setX(x);
        c2.setY(y);
        c2.setRadio(radio);
            
        System.out.println("Circulo 2 \n"+c2.Imprimir()+"\n"); 
        
        dx = 3;
        dy = 4;
        c2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+c2.getX()+","+c2.getY()+")");
        System.out.println("\nDirecion de memoria c1: "+c1+"\nDireccionn de memoria c2: "+c2);
        
    }
    public static void FigCuadrado(int x, int y, double lado){
        Cuadrado cua1 = new Cuadrado(1,1,-1);
        Cuadrado cua2 = new Cuadrado(1,1,2);
        
        System.out.println("Constructores:\n"+cua1.Imprimir()+"\n"+cua2.Imprimir()+"\n");
        
        cua1.setX(x);
        cua1.setY(y);
        cua1.setLado(lado);
        
        System.out.println("Cuadrado 1\n"+cua1.Imprimir()+"\n");
        
        int dx,dy;
        dx = -3; dy = 6;
        cua1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+cua1.getX()+","+cua1.getY()+")\n");
        
        cua2.setX(2);
        cua2.setY(5);
        cua2.setLado(8);
        
        System.out.println("Cuadrado 2\n"+cua2.Imprimir()+"\n");
        
        dx = 3;
        dy = 3;
        cua2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+cua2.getX()+","+cua2.getY()+")");
        
        System.out.println("\nDirecion de memoria cua1: "+cua1+"\nDireccionn de memoria cua2: "+cua2+"\n");
    }
    public static void FigRectangulo(int x, int y, int ladoMayor, int ladoMenor){
        Rectangulo rec1 = new Rectangulo(-8,0,-1,-1);
        Rectangulo rec2 = new Rectangulo(10,12);
        
        System.out.println("Constructores: \n"+rec1.Imprimir()+"\n"+rec2.Imprimir()+"\n");
        
        rec1.setX(x);
        rec1.setY(y);
        rec1.setLadoMayor(ladoMayor);
        rec1.setLadoMenor(ladoMenor);
        
        System.out.println("Rectangulo 1\n"+rec1.Imprimir()+"\n");
        
        int dx,dy;
        dx = 5; dy = 5;
        rec1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+rec1.getX()+","+rec1.getY()+")\n"); 
                
        rec2.setX(x);
        rec2.setY(y);
        rec2.setLadoMayor(ladoMayor);
        rec2.setLadoMenor(ladoMenor);
        
        System.out.println("Rectangulo 2\n"+rec2.Imprimir()+"\n");
        
        dx = 1;
        dy = 7;
        rec2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNueva esquina inferior izquierda: ("+rec2.getX()+","+rec2.getY()+")");
        
        System.out.println("\nDirecion de memoria rec1: "+rec1+"\nDireccionn de memoria rec2: "+rec2 + "\n");
        
    }
    public static void FigElipse(int x, int y, int ejeMayor, int ejeMenor){
        Elipse eli1 = new Elipse();
        Elipse eli2 = new Elipse();

        System.out.println("Constructores: \n"+eli1.Imprimir()+"\n"+eli2.Imprimir()+"\n");

        eli1.setX(x);
        eli1.setY(y);
        eli1.setEjeMayor(ejeMayor);
        eli1.setEjeMenor(ejeMenor);
        
        System.out.println("Elipse 1\n"+eli1.Imprimir()+"\n");
        
        int dx, dy;
        dx = 3; 
        dy = 1;
        eli1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+eli1.getX()+","+eli1.getY()+")\n");
                
        eli2.setX(y);
        eli2.setY(x);
        eli2.setEjeMayor(ejeMayor);
        eli2.setEjeMenor(ejeMenor);
        
        System.out.println("Elipse 2\n"+eli2.Imprimir()+"\n");
        
        dx = 3; 
        dy =4;
        eli2.Mover(3, 4);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevo centro: ("+eli2.getY()+","+eli2.getY()+")");
        
        System.out.println("\nDirecion de memoria eli1: "+eli1+"\nDireccionn de memoria eli2: "+eli2 + "\n");
    }
    public static void FigSegmentoRecta(int x1, int y1, int x2, int y2){
        SegmentoRecta sr1 = new SegmentoRecta(x1, y1);
        SegmentoRecta sr2 = new SegmentoRecta(x1, y1, x2, y2);
        
        System.out.println("Constructores: \n"+sr1.Imprimir()+"\n"+sr2.Imprimir()+"\n");
        
        sr1.setX1(x1);
        sr1.setY1(y1);
        sr1.setX2(x2);
        sr1.setY2(y2);
        
        System.out.println("Segmento 1\n"+sr1.Imprimir()+"\n");
        
        int dx, dy;
        dx = 3;
        dy = 10;
        sr1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+sr1.getX1()+","+sr1.getY1()+")\nPunto 2: ("+sr1.getX2()+","+sr1.getY2()+")\n");
        
        sr2.setX1(x2);
        sr2.setY1(y2);
        sr2.setX2(x1);
        sr2.setY2(y1);
      
        System.out.println("Segmento 2\n"+sr2.Imprimir()+"\n");
        
        dx = 5;
        dy = 7;
        sr2.Mover(5, 7);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+sr2.getX1()+","+sr2.getY1()+")\nPunto 2: ("+sr2.getX2()+","+sr2.getY2()+")");
        System.out.println("\nDirecion de memoria sr1: "+sr1+"\nDireccionn de memoria sr2: "+sr2+"\n");
        
    }
    public static void FigTriangulo(int x1, int y1, int x2, int y2, int x3, int y3){
        Triangulo tr1 = new Triangulo(1,1,3,7,3,10);
        Triangulo tr2 = new Triangulo(new Punto(x1, x2), new Punto(x2, y3), new Punto());
        
        System.out.println("Constructores: \n"+tr1.Imprimir()+"\n"+tr2.Imprimir()+"\n");
        
        tr1.setX1(x1);
        tr1.setY1(y1);
        
        tr1.setX2(x2);
        tr1.setY2(y2);
        
        tr1.setX3(x3);
        tr1.setY3(y3);
        
        System.out.println("Triangulo 1:\n"+tr1.Imprimir()+"\n");
        
        int dx,dy;
        dx = 5;
        dy = 6;
        tr1.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+tr1.getX1()+","+tr1.getY1()+")\nPunto 2: ("+tr1.getX2()+","+tr1.getY2()+")\nPunto 3: ("+tr1.getX3()+","+tr1.getY3()+")\n");
        System.out.println("Area: "+tr1.CalcularArea());        
        
        
        tr2.setX1(1);
        tr2.setY1(1);
        
        tr2.setX2(3);
        tr2.setY2(5);
        
        tr2.setX3(7);
        tr2.setY3(3);
        
        System.out.println("Triangulo 2: \n"+tr2.Imprimir()+"\n");
        
        dx = 2;
        dy = 4;
        tr2.Mover(dx, dy);
        System.out.println("Desplazamiento x:"+dx+" y:"+dy+"\nNuevos puntos:\nPunto 1: ("+tr2.getX1()+","+tr2.getY1()+")\nPunto 2: ("+tr2.getX2()+","+tr2.getY2()+")\nPunto 3: ("+tr2.getX3()+","+tr2.getY3()+")\n");
        System.out.println("Direcion de memoria tr1: "+tr1+"\nDireccionn de memoria tr2: "+tr2+"\n");
    }
    public static void main(String [] args){
        int x= -1;
        int y = 2;
        int radio = -3;
        System.out.println("------------|Circunferencia|---------------");
        FigCircunferencia(x, y, radio);
        
        System.out.println("----------------|Cuadrado|------------------");
        int lado = 12;
        FigCuadrado(x, y, lado);
        
        System.out.println("---------------|Rectangulo|-------------------");
        int ladoMayor = 8;
        int ladoMenor = 3;
        FigRectangulo(x, y, ladoMayor, ladoMenor);
        
        System.out.println("-----------------|Elipse|---------------------");
        FigElipse(x, y, ladoMayor, ladoMenor);
        
        System.out.println("--------------|Segmento de recta|-------------");
        int x2 = 5;
        int y2 = 6;
        FigSegmentoRecta(x, y, x2, y2);
        
        System.out.println("----------------|Triangulo|-------------------");
        int x3 , y3;
        x = 1; y = 1;
        x2 = 3; y2 = 5;
        x3 = 4; y3 = 2;
        FigTriangulo(x, y, x2, y2, x3, y3);
        
    }
}
