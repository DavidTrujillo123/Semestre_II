using System;

namespace FigurasGeometricas
{
	class Principal
	{
        public static void FigCircunferencia(int x, int y, double radio)
        {
            Circunferencia c1 = new Circunferencia(4, 3, -8);
            Circunferencia c2 = new Circunferencia(2);
            Circunferencia c3 = new Circunferencia(5);
            
			Console.WriteLine(c1.Imprimir() + "\n" + c2.Imprimir() + "\n");


			c1.X = x;
			c1.Y = y;
			c1.Radio = radio;

			Console.WriteLine("Circulo 1 \n" + c1.Imprimir()+"\n");
			
            int dx = 2;
            int dy = 3;
            c1.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevo centro: " + c1.Centro.Imprimir() + "\n");

            c2.X = 1;
            c2.Y = 1;
            c2.Radio = 12;
            double r = c1.Radio;
            c1.Radio = 3;

			Console.WriteLine("Circulo 2 \n" + c2.Imprimir()+"\n");
			

            dx = 3;
            dy = 4;
            c2.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevo centro: " + c2.Centro.Imprimir());
			Console.WriteLine("\nDirecion de memoria c1: " + c1 + "\nDireccionn de memoria c2: " + c2 + "\n");

        }
        public static void FigCuadrado(int x, int y, double lado)
        {
            Cuadrado cua1 = new Cuadrado(1, -7, 8);
            Cuadrado cua2 = new Cuadrado(1, 1, 2);

			Console.WriteLine("Constructores:\n" + cua1.Imprimir() + "\n" + cua2.Imprimir() + "\n");

            cua1.X = x;
            cua1.Y = y;
            cua1.Lado = lado;

			Console.WriteLine("Cuadrado 1\n" + cua1.Imprimir() + "\n");

            int dx, dy;
            dx = -3; dy = 6;
            cua1.Mover(dx, dy);
            Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNueva esquina inferior izquierda: " + cua1.Vertice.Imprimir() + "\n");

            cua2.X = 2;
            cua2.Y = 8;
            cua2.Lado = 5;

			Console.WriteLine("Cuadrado 2\n" + cua2.Imprimir()+"\n");

            dx = 3;
            dy = 3;
            cua2.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNueva esquina inferior izquierda: " + cua2.Vertice.Imprimir());

			Console.WriteLine("\nDirecion de memoria cua1: " + cua1 + "\nDireccionn de memoria cua2: " + cua2 + "\n");
        }
        public static void FigRectangulo(int x, int y, int ladoMayor, int ladoMenor)
        {
            Rectangulo rec1 = new Rectangulo(-8, 0, -1, -1);
            Rectangulo rec2 = new Rectangulo(10, 12);

			Console.WriteLine("Constructores: \n" + rec1.Imprimir() + "\n" + rec2.Imprimir() + "\n");

            rec1.X = x;
            rec1.Y = y;
            rec1.LadoMayor = ladoMayor;
            rec1.LadoMenor = ladoMenor;

			Console.WriteLine("Rectangulo 1\n" + rec1.Imprimir()+"\n");

            int dx, dy;
            dx = 5; dy = 5;
            rec1.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNueva esquina inferior izquierda: " + rec1.Verice.Imprimir() +  "\n");

            rec2.X = x;
            rec2.Y = y;
            rec2.LadoMayor = ladoMayor;
            rec2.LadoMenor = ladoMenor;

			Console.WriteLine("Rectangulo 2\n" + rec2.Imprimir()+"\n");

            dx = 1;
            dy = 7;
            rec2.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNueva esquina inferior izquierda: "+ rec2.Verice.Imprimir());

			Console.WriteLine("\nDirecion de memoria rec1: " + rec1 + "\nDireccionn de memoria rec2: " + rec2+"\n");

        }
        public static void FigElipse(int x, int y, int ejeMayor, int ejeMenor)
        {
            Elipse eli1 = new Elipse();
            Elipse eli2 = new Elipse();

            Console.WriteLine("Constructores: \n" +eli1.Imprimir() + "\n" + eli2.Imprimir() + "\n");

            eli1.X = x;
            eli1.Y = y;
            eli1.EjeMayor = ejeMayor;
            eli1.EjeMenor = ejeMenor;

			Console.WriteLine("Elipse 1\n" + eli1.Imprimir()+"\n");

            int dx, dy;
            dx = 3;
            dy = 1;
            eli1.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevo centro: " + eli1.Centro.Imprimir() + "\n");

            eli2.X = y;
            eli2.Y = x;
            eli2.EjeMayor = ejeMenor;
            eli2.EjeMenor = ejeMayor;

			Console.WriteLine("Elipse 2\n" + eli2.Imprimir()+"\n");

            dx = 3;
            dy = 4;
            eli2.Mover(3, 4);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevo centro: " + eli2.Centro.Imprimir());

			Console.WriteLine("\nDirecion de memoria eli1: " + eli1 + "\nDireccionn de memoria eli2: " + eli2 + "\n");
        }
        public static void FigSegmentoRecta(int x1, int y1, int x2, int y2)
        {
            SegmentoRecta sr1 = new SegmentoRecta();
            SegmentoRecta sr2 = new SegmentoRecta();

            Console.WriteLine("Constructores: \n" + sr1.Imprimir() + "\n" + sr2.Imprimir() + "\n");

            sr1.X1 = x1;
            sr1.Y1 = y1;
            sr1.X2 = x2;
            sr1.Y2 = y2;

			Console.WriteLine("Segmento 1\n" + sr1.Imprimir()+"\n");

            int dx, dy;
            dx = 3;
            dy = 10;
            sr1.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevos puntos:\nPunto 1: " + sr1.P1.Imprimir()+ "\nPunto 2: " + sr1.P2.Imprimir() + "\n");

            sr2.X1 = x2;
            sr2.Y1 = y2;
            sr2.X2 = x1;
            sr2.Y2 = y1;

			Console.WriteLine("Segmento 2\n" + sr2.Imprimir()+"\n");

            dx = 5;
            dy = 7;
            sr2.Mover(5, 7);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevos puntos:\nPunto 1: " + sr2.P1.Imprimir() + "\nPunto 2: "+ sr2.P2.Imprimir());
			Console.WriteLine("\nDirecion de memoria sr1: " + sr1 + "\nDireccionn de memoria sr2: " + sr2 + "\n");

        }
        public static void FigTriangulo(int x1, int y1, int x2, int y2, int x3, int y3)
        {
            Triangulo tr1 = new Triangulo(3,4,3,0);
            Triangulo tr2 = new Triangulo(3,4,5,6,3,7);
            Triangulo tr3;
            Punto a = new Punto();
            Punto b = new Punto(6,7);
            tr3 = new Triangulo(a, b, new Punto(8, 9));

			Console.WriteLine(tr3.Imprimir());
            tr3.X1 = 3;
            //Console.WriteLine("Constructores: \n" + tr1.Imprimir() + "\n" + tr2.Imprimir() + "\n");

            Console.WriteLine("Triangulo 1:\n" + tr1.Imprimir());
            Console.WriteLine("Area: " + tr1.Area+" Perimetro: "+tr1.Perimetro+"\n");

            tr1.X1 = x1;
            tr1.Y1 = y1;

            tr1.X2 = x2;
            tr1.Y2 = y2;

            tr1.X3 = x3;
            tr1.Y3 = y3;

			

            int dx, dy;
            dx = 5;
            dy = 6;
            tr1.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevos puntos:\nPunto 1: " + tr1.P1.Imprimir() + "\nPunto 2: " + tr1.P2.Imprimir() + "\nPunto 3: (" + tr1.P3.Imprimir()+ "\n");
            
            tr2.X1 = x2;
            tr2.Y1 = y2;

            tr2.X2 = x3;
            tr2.Y2 = y3;

            tr2.X3 = x1;
            tr2.Y3 = y1;

			Console.WriteLine("Triangulo 2: \n" + tr2.Imprimir()+"\n");

            dx = 2;
            dy = 4;
            tr2.Mover(dx, dy);
			Console.WriteLine("Desplazamiento x:" + dx + " y:" + dy + "\nNuevos puntos:\nPunto 1: (" + tr2.X1 + "," + tr2.Y1 + ")\nPunto 2: (" + tr2.X2 + "," + tr2.Y2 + ")\nPunto 3: (" + tr2.X3 + "," + tr2.Y3 + ")");
			Console.WriteLine("\nDirecion de memoria tr1: " + tr1 + "\nDireccionn de memoria tr2: " + tr2+"\n");

        }
        static void Main(string[] args)
		{
            int x = 1;
            int y = 2;
            int radio = 3;
			Console.WriteLine("------------|Circunferencia|---------------");
            FigCircunferencia(x, y, radio);

			Console.WriteLine("----------------|Cuadrado|------------------");
			int lado = 12;
			FigCuadrado(x, y, lado);

			Console.WriteLine("---------------|Rectangulo|-------------------");
			int ladoMayor = 8;
			int ladoMenor = 3;
			FigRectangulo(x, y, ladoMayor, ladoMenor);

			Console.WriteLine("-----------------|Elipse|---------------------");
			FigElipse(x, y, ladoMayor, ladoMenor);

			Console.WriteLine("--------------|Segmento de recta|-------------");
			int x2 = 5;
			int y2 = 6;
			FigSegmentoRecta(x, y, x2, y2);

			Console.WriteLine("----------------|Triangulo|-------------------");
			int x3, y3;
			x = 1; y = 1;
			x2 = 3; y2 = 5;
			x3 = 4; y3 = 2;
			FigTriangulo(x, y, x2, y2, x3, y3);

		}
    }
}
