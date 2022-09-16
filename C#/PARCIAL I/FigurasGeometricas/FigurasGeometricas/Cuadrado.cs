using System;
using System.Collections.Generic;
using System.Text;

namespace FigurasGeometricas
{
	class Cuadrado
	{
        private Punto vertice;
        private double lado;

        /// <CONTRUCTOR >
        /// 
        /// </Si su lado es negativo se colocará 1>
        /// <param name="x"></coordenada eje x>
        /// <param name="y"></cooredenada eje y>
        /// <param name="lado"></lado del cuadrado>       
        public Cuadrado(double lado, int x, int y)
        {
            this.vertice = new Punto(x,y);
            this.lado = lado;

            if (lado > 0) this.lado = lado;
            else this.lado = 1;
        }

        public Cuadrado()
        {
            this.vertice = new Punto();
            this.lado = 1;
        }

        public Cuadrado(double lado)
        {
            this.vertice = new Punto();
            this.lado = lado;
            if (lado > 0) this.lado = lado;
            else this.lado = 1;
        }
        //Getters and Setters
        public int X
        {
            get { return this.Vertice.X; }
            set { this.Vertice.X = value; }
        }
        public int Y
        {
            get { return this.Vertice.Y; }
            set { this.Vertice.Y = value; }
        }
        public double Lado
        {
            get { return this.lado; }
            set { 
                if (value > 0) this.lado = value; 
            }
        }
        public Punto Vertice
        {
            get{ return this.vertice; }
        }
        /// <summary>
        /// 
        /// </Método que calcula el area de un cuadrado>
        /// <returns></Area de un cuadrado>
        public double CalcularArea()
        {
            return this.lado * this.lado;
        }

        /// <summary>
        /// 
        /// </Método que calcula el perimetro de un cuadrado>
        /// <returns></Perimetro de un cuadrado>
        public double CalcularPerimetro()
        {
            return 4 * this.lado;
        }

        /// <summary>
        /// 
        /// </Método que mueve el cuadrado>
        /// <param name="dx"></Valor del desplazamiento en x>
        /// <param name="dy"></Valor del desplazamiento en y>
        public void Mover(int dx, int dy)
        {
            this.Vertice.Mover(dx, dy);
        }

        public String Imprimir()
        {
            return "Punto esquina inferior izquierda: " + this.Vertice.Imprimir() + "\nLado: " + this.lado;
        }
    }
}
