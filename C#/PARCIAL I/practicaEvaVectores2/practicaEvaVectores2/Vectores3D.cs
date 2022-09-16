using System;
using System.Collections.Generic;
using System.Text;

namespace practicaEvaVectores2
{
	internal class Vectores3D
	{
		private Punto p1;
		private Punto p2;

		public Vectores3D(Punto p1, Punto p2)
		{
			this.p1 = p1;
			this.p2 = p2;
		}
		public Vectores3D(int x1, int y1, int z1, int x2, int y2, int z2)
		{
			p1 = new Punto(x1, y1, z1);
			p2 = new Punto(x2, y2, z2);
		}
		public Punto P1
		{
			get { return p1; }
			set { p1 = value; }
		}
		public Punto P2
		{
			get { return p2; }
			set { p2 = value; }
		}
		public bool Comparar(Punto p1, Punto p2)
		{
			if(p1.X == this.p1.X)
				if(p1.Y == this.p1.Y)
					if(p1.Z == this.p1.Z)
						if(p2.X == this.p2.X)
							if(p2.Y == this.p2.Y)
								if(p2.Z == this.p2.Z)
									return true;
			return false;
		}
		public bool Comparar(Vectores3D v)
		{
			return Comparar(v.P1, v.P2);
		}
		public Vectores3D Sumar(Punto p1, Punto p2, Vectores3D v)
		{
			p1 = this.p1.Sumar(p1.X, p1.Y, p1.Z);
			p2 = this.p2.Sumar(p2.X, p2.Y, p2.Z);
			
			if (v == null) v = new Vectores3D(p1,p2);
			else
			{
				v.P1.X = p1.X;
				v.P1.Y = p1.Y;
				v.P1.Z = p1.Z;
				v.P2.X = p2.X;
				v.P2.Y = p2.Y;
				v.P2.Z = p2.Z;
			}
			return v;
		}
		public Vectores3D Sumar(Vectores3D v)
		{
			return Sumar(v.P1, v.P2,v);
		}
		public double CalcularNorma()
		{
			double x = this.P2.X - this.P1.X;
			double y = this.P2.Y - this.P1.Y;
			double z = this.P2.Z - this.P1.Z;

			return Math.Sqrt((x * x) + (y * y) + (z * z));
		}
		public String Imprimir()
		{
			return "P1: "+this.P1.Imprimir() + " P2:" + this.P2.Imprimir();
		}
	}
}
