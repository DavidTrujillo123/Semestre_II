using System;
using System.Collections.Generic;
using System.Text;

namespace practicaEvaVectores2
{
	internal class Punto
	{
		private int x, y,z;

		public Punto(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public Punto()
		{
			this.x = 0;
			this.y=0;
			this.z = 0;
		}
		public Punto Sumar(int x, int y, int z)
		{
			x += this.X;
			y += this.Y;
			z += this.Z;

			return new Punto(x,y,z);
		}
		public int X
		{
			get { return this.x; }
			set { this.x = value; }
		}
		public int Y
		{
			get { return this.y; }
			set { this.y = value; }
		}
		public int Z
		{
			get { return this.z; }
			set { this.z = value; }
		}
		public String Imprimir()
		{
			return "("+ x +"," + y + ","+z+")";
		}
	}
}
