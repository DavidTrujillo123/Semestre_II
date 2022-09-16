using System;
using System.Collections.Generic;
using System.Text;

namespace FigurasGeometricas
{
	class Elipse
	{
        private Punto centro;
		private int ejeMayor;
		private int ejeMenor;

        public Elipse(int x, int y, int ejeMayor, int ejeMenor)
        {
            centro = new Punto(x,y);
            this.ejeMayor = ejeMayor;
            this.ejeMenor = ejeMenor;

            if (ejeMayor < 0) this.ejeMayor = 3;
            else this.ejeMayor = ejeMayor;
            if (ejeMenor < 0) this.ejeMenor = 2;
            else this.ejeMenor = ejeMenor;
        }

        public Elipse()
        {
            centro = new Punto();
            this.ejeMayor = 3;
            this.ejeMenor = 2;
        }

        public Elipse(int ejeMayor, int ejeMenor)
        {
            centro = new Punto();
            this.ejeMayor = ejeMayor;
            this.ejeMenor = ejeMenor;
            if (ejeMayor < 0) this.ejeMayor = 3;
            else this.ejeMayor = ejeMayor;
            if (ejeMenor < 0) this.ejeMenor = 2;
            else this.ejeMenor = ejeMenor;
        }
        //Getters and Setters
        public Punto Centro
        {
            get { return centro; }
        }
        public int X
        {
            get { return this.centro.X; }
            set { this.centro.X = value; }
        }
        public int Y
        {
            get { return this.centro.Y; }
            set { this.centro.Y = value; }
        }
        public int EjeMayor
        {
            get { return this.ejeMayor; }
            set { 
                if(value > 0) this.ejeMayor = value; 
            }
        }
        public int EjeMenor
        {
            get { return this.ejeMenor; }
            set { 
                if(value > 0) this.ejeMenor = value; 
            }
        }
        /// <summary>
        /// 
        /// </Método que calcula el area de la elipse>
        /// <returns></Area de la elipse>
        public double CalcularArea()
        {
            double a = this.ejeMayor / 2;
            double b = this.ejeMenor / 2;
            return Math.PI * a * b;
        }
        /// <summary>
        /// 
        /// </Método que calcula el perimetro de la elipse>
        /// <returns></Perimetro de la elipse>
        public double CalcularPerimetro()
        {
            return Math.PI * (this.ejeMayor + this.ejeMenor);
        }

        public void Mover(int dx, int dy)
        {
            this.centro.Mover(dx, dy);
        }

        public String Imprimir()
        {
            return "Punto centro: " + this.Centro.Imprimir() + "\nEje Mayor: " + this.ejeMayor + "\nEje Menor: " + this.ejeMenor + "\nArea: " + CalcularArea() + "\nPerimetro: " + CalcularPerimetro();
        }
    }
}
