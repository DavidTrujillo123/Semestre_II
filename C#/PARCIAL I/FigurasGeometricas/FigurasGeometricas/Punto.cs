using System;
using System.Collections.Generic;
using System.Text;

namespace FigurasGeometricas
{
	internal class Punto
	{
		private int x;
		private int y;

		public Punto(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		public Punto()
		{
			this.x = 0;
			this.y = 0;
		}

		public int X
		{
			get { return x; }
			set { x = value; }
		}

		public int Y
		{
			get { return y; }
			set { y = value; }
		}

		public void Mover(int dx, int dy)
		{
			this.x += dx;
			this.y += dy;
		}
		public String Imprimir()
		{
			return "("+this.x+","+this.y+")";
		}
	}
}
