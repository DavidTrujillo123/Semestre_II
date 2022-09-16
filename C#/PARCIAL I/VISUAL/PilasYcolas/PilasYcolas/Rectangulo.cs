using System;
using System.Collections.Generic;
using System.Text;

namespace PilasYcolas
{
	class Rectangulo
	{
        private Punto vertice;
		private int ladoMayor;
		private int ladoMenor;

        /// <Constructor>
        /// 
        /// </Si el lado mayor o lado menor es negativo se le asigna 1>
        /// <param name="x"></param>
        /// <param name="y"></param>
        /// <param name="ladoMayor"></param>
        /// <param name="ladoMenor"></param>
        public Rectangulo(int ladoMayor, int ladoMenor, int x, int y)
        {
            this.vertice = new Punto(x,y);
            this.ladoMayor = ladoMayor;
            this.ladoMenor = ladoMenor;

            if (ladoMayor < 0) this.ladoMayor = 1;
            else
            {
                this.ladoMayor = ladoMayor;
            }
            if (ladoMayor < 0) this.ladoMenor = 1;
            else
            {
                this.ladoMayor = ladoMayor;
            }
        }

        public Rectangulo()
        {
            this.vertice = new Punto();
            this.ladoMayor = 2;
            this.ladoMenor = 1;

        }

        public Rectangulo(int ladoMayor, int ladoMenor)
        {
            this.vertice = new Punto();
            this.ladoMayor = ladoMayor;
            this.ladoMenor = ladoMenor;
        }

        //Gettes and Setters
        public Punto Verice
        {
            get { return this.vertice; }
        }
        public int X
        {
            get { return this.vertice.X; }
            set { this.vertice.X = value; }
        }
        public int Y
        {
            get { return this.vertice.Y; }
            set { this.vertice.Y = value; }
        }
        public int LadoMayor
        {
            get { return this.ladoMayor; }
            set { this.ladoMayor = value; }
        }
        public int LadoMenor
        {
            get { return this.ladoMenor; }
            set { 
                if (value > 0) this.ladoMenor = value; 
            }
        }

        /// <summary>
        /// 
        /// </Metodo que calcula el area del rectangulo>
        /// <returns></Area del rectangulo>
        public double CalcularArea()
        {
            return this.ladoMayor * this.ladoMenor;
        }

        /// <summary>
        /// Método que calcula el area de un rectangulo
        /// </summary>
        /// <returns></Perimetro del rectangulo>
        public double CalcularPerimetro()
        {
            return 2 * this.ladoMayor + 2 * this.ladoMenor;
        }

        /// <summary>
        /// 
        /// </Método que mueve la esquina inferior izquierda del rectangulo>
        /// <param name="dx"></Valor del desplazamiento en x>
        /// <param name="dy"></Valor del desplazamiento en y>
        public void Mover(int dx, int dy)
        {
            vertice.Mover(dx, dy);
        }

        public String Imprimir()
        {
            return "Punto esquina inferior izquierda: " 
                + this.Verice.Imprimir() + " Lado Mayor: " 
                + this.ladoMayor + " Lado menor: " + this.ladoMenor + "\r\n";
        }

    }
}
