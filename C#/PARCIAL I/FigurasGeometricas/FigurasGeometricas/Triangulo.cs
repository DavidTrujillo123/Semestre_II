using System;
using System.Collections.Generic;
using System.Text;

namespace FigurasGeometricas
{
    class Triangulo
    {
        private Punto p1;
        private Punto p2;
        private Punto p3;

        public Triangulo(int x2, int y2, int x3, int y3)
        {
            this.p1 = new Punto();
            this.p2 = new Punto(x2, y2);
            this.p3 = new Punto(x3, y3);
        }
        public Triangulo(Punto p1, Punto p2, Punto p3)
        {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
        public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3)
        {
            this.p1 = new Punto(x1, y1);
            this.p2 = new Punto(x2, y2);
            this.p3 = new Punto(x3, y3);
        }

        //Gettes and Setters
        public Punto P1
        {
            get { return this.p1; }
        }
        public Punto P2
        {
            get { return this.p2; }
        }
        public Punto P3
        {
            get { return this.p3; }
        }
        public int X1
        { get { return this.P1.X; } 
            set { this.P1.X = value; } 
        }
        public int Y1
        { get { return this.P1.Y; } 
            set { this.P1.Y = value; } 
        }
        public int X2
        { get { return this.P2.X; } 
            set { this.P1.X = value; } 
        }
        public int Y2
        { get { return this.P2.Y; } 
            set { this.P2.Y = value; } 
        }
        public int X3
        { get { return this.P3.X; } 
            set { this.P3.Y = value; } 
        }
        public int Y3
        { get { return this.P3.Y; } 
            set { this.P3.Y = value; } 
        }
        public double Area
        {
            get
            {
               return CalcularArea();
            }
        }
        public double Perimetro
        {
            get
            {
                return CalcularPerimetro();
            }
        }
        private double Distancia2Puntos(int x1, int y1, int x2, int y2)
        {
            return Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2));
        }
        private double Distancia2Puntos(Punto p1, Punto p2)
        {
            return Math.Sqrt(Math.Pow(p2.X - p1.X, 2) + Math.Pow(p2.Y - p1.Y, 2));
        }
        /// <summary>
        /// 
        /// </Método que calcula el perimetro del triangulo con tres puntos>
        /// <returns></Perimetro del triangulo>
        public double CalcularPerimetro()
        {
            double a;
            double b;
            double c;

            a = Distancia2Puntos(P1, P2);
            b = Distancia2Puntos(P2, P3);
            c = Distancia2Puntos(P3, P1);

            return a + b + c;
        }
        /// <summary>
        /// 
        /// </Método que calcula el area del triangulo con tres puntos en el plano>
        /// <returns></Area del triangulo>
        public double CalcularArea()
        {
            double a;
            double b;
            double c;
            double s;

            a = Distancia2Puntos(P1, P2);
            b = Distancia2Puntos(P2, P3);
            c = Distancia2Puntos(P3, P1);

            s = CalcularPerimetro() / 2;

            return Math.Sqrt(s * (s - a) * (s - b) * (s - c));
        }
        public void Mover(int dx, int dy)
        {
            this.P1.Mover(dx, dy);
            this.P2.Mover(dx, dy);
            this.P3.Mover(dx, dy);
        }
        public String Imprimir()
        {
            return "Punto 1: " + this.P1.Imprimir()+ "\nPunto 2: " 
                + this.P2.Imprimir() + "\nPunto 3: " + this.P3.Imprimir();
        }
    }
}
