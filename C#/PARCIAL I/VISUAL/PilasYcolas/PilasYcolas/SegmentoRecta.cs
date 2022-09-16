using System;
using System.Collections.Generic;
using System.Text;

namespace PilasYcolas
{
	class SegmentoRecta
	{
        private Punto p1;
        private Punto p2;

        /// <CONSTRUCTOR>
        /// 
        /// </>
        /// <param name="x1"></param>
        /// <param name="y1"></param>
        /// <param name="x2"></param>
        /// <param name="y2"></param>
        public SegmentoRecta(int x1, int y1, int x2, int y2)
        {
            p1 = new Punto(x1, y1);
            p2 = new Punto(x2, y2);
        }
        public SegmentoRecta()
        {
            p1 = new Punto();
            p2 = new Punto(1,1);
        }

        //Gettes and Setters
        public Punto P1
        {
            get { return p1; }
        }
        public Punto P2
        {
            get { return p2; }
        }
        public int X1
            { get { return this.P1.X; } set { this.P1.X = value; } }
        public int Y1 { get { return this.P1.Y; } set { this.P1.Y = value; } }
        public int X2
            { get { return this.P2.X; } set { this.P2.Y = value; } }
        public int Y2
            { get { return this.P2.Y; } set { this.P2.Y = value; } }

        /// <summary>
        /// 
        /// </Método que calcula la longitud de una recta con dos puntos en el plano>
        /// <returns></Longitud de un segmento de recta>
        public double CalcularLongitud()
        {
            double a = Math.Pow((this.X2 - this.X1), 2);
            double b = Math.Pow((this.Y2 - this.Y1), 2);
            return Math.Sqrt(a + b);
        }

        /// <summary>
        /// 
        /// 
        /// </Método que modifica los puntos del segmento de recta>
        /// <param name="dx"></Valor de dezplamiento en x>
        /// <param name="dy"></Valor de deszplamiento en y>
        public void Mover(int dx, int dy)
        {
            P1.Mover(dx, dy);
            P2.Mover(dx, dy);
        }
        public String Imprimir()
        {
            return "Punto 1: " + P1.Imprimir()+ " Punto 2: " + P2.Imprimir() + " Longitud: " + CalcularLongitud();
        }

    }
}
