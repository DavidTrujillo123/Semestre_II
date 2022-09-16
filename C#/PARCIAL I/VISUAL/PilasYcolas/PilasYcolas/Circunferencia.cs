using System;
using System.Collections.Generic;
using System.Text;

namespace PilasYcolas
{
	class Circunferencia
	{
        private Punto centro;
		private double radio;

        /// <CONTRUCTOR>
        /// 
        /// </Si el radio es negativo, se colocará el radio = 1>
        /// <param name="x"></param>
        /// <param name="y"></param>
        /// <param name="radio"></param>
        public Circunferencia(double radio, int x, int y)
        {
            this.centro = new Punto(x,y);

            if (radio > 0)
            {
                this.radio = radio;
            }
            else
            {
                this.radio = 1;
            }
        }
        public Circunferencia()
        {
            this.centro = new Punto();
            this.radio = 1;
        }

        public Circunferencia(double radio)
        {
            this.centro = new Punto();
            this.radio = radio;
            if (radio > 0)
            {
                this.radio = radio;
            }
            else
            {
                this.radio = 1;
            }

        }

		//Getters and Setters
		public int X
		{
			get { return this.centro.X; }
			set { this.centro.X = value; }
		}
		public int Y
		{
			get { return Y; }
			set { this.centro.Y = value; }
		}
		public double Radio
		{
			get
			{
				return this.radio;
			}
			set
			{
				if (value > 0) this.radio = value; //value = valor que esta en la expresion despues del igual
			}
		}
        public Punto Centro
        {
            get { return this.centro; }
        }

		public double Area
        {
            get
            {
               return CalcularArea();
            }
        }

        /// <summary>
        /// Método que calcula y retorna el área de la circunferencia
        /// 
        /// <returns></Area de la circunferencia>
        public double CalcularArea()
        {
            double area;
            area = Math.PI * this.radio * this.radio;
            return area;
        }

        /// <summary>
        /// Método que calcula y retorna el perimetro de la circunferencia
        /// 
        /// <returns></Perimetro de la circunferencia>
        public double CalcularPerimetro()
        {
            return 2 * Math.PI * this.radio;
        }
        /// <summary>
        /// 
        /// </Metodo que mueve la circunferencia>
        /// <param name="dx"></Valor del desplazamiento en x>
        /// <param name="dy"></Valor del desplazamiento en y>
        public void Mover(int dx, int dy)
        {
            this.centro.Mover(dx, dy);
        }
        public String Imprimir()
        {
            return "Punto centro: " + this.Centro.Imprimir()+ " Radio: " + this.radio + "\r\n";
        }
    }
}
