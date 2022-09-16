using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace practica_evaVectores
{
	internal class Vector3D
	{
		private int x1, y1, z1;
		private int x2, y2, z2;

		public Vector3D(int x2,int y2,int z2)
		{
			this.x1 = 0;
			this.y1 = 0;
			this.z1 = 0;

			this.x2 = x2;
			this.y2 = y2;
			this.z2 = z2;
		}
		public Vector3D(int x1, int y1, int z1,int x2, int y2, int z2)
		{
			this.x1 = x1;
			this.y1 = y1;
			this.z1 = z1;

			this.x2 = x2;
			this.y2 = y2;
			this.z2 = z2;
		}
		public int X1
		{
			get { return x1; }
			set { x1 = value; }
		}
		public int Y1
		{
			get { return y1; }
			set { y1 = value; }
		}
		public int Z1
		{
			get { return z1; }
			set { z1 = value; }
		}
		public int X2
		{
			get { return x2; }
			set { x2 = value; }
		}
		public int Y2
		{
			get { return y2; }
			set { y2 = value; }
		}
		public int Z2
		{
			get { return z2; }
			set { z2 = value; }
		}
		public bool Comparar(int x1, int y1, int z1, int x2, int y2, int z2)
		{
			if(this.x1 == x1)
				if(this.y1 == y1)
					if(this.z1 ==z1)
						if(this.x2 == x2)
							if(this.y2 == y2)
								if(this.z2==z2)
									return true;

			return false;
		}
		public bool Comparar(Vector3D v)
		{
			return Comparar(v.X1, v.Y1, v.Z1, v.X2, v.Y2, v.Z2);
		}
		public Vector3D Sumar(int x1, int y1, int z1, int x2, int y2, int z2, Vector3D res)
		{
			int rx1, ry1, rz1, rx2, ry2, rz2;
			rx1 = this.x1 + x1;
			ry1 = this.y1 + y1;
			rz1 = this.z1 + z1;
			rx2 = this.x2 + x2;
			ry2 = this.y2 + y2;
			rz2 = this.z2 + z2;

			if (res == null) new Vector3D(rx1, ry1, rz1, rx2, ry2, rz2);
			else {
				res.X1 = rx1;
				res.Y1 = ry1;
				res.Z1 = rz1;
				res.X2 = rx2;
				res.Y2 = ry2;
				res.Z2 = rz2;
			}
			return res;
		}
		public Vector3D Sumar(Vector3D v)
		{
			return Sumar(v.X1, v.Y1, v.Z1, v.X2, v.Y2, v.Z2,v);
		}
		public double CalcularNorma()
		{
			double x = Math.Pow(this.X2 - this.X1,2);
			double y = Math.Pow(this.Y2 - this.Y1,2);
			double z = Math.Pow(this.Z2 - this.Z1,2);
			double res = Math.Sqrt(x + y + z);
			return res;
		}
		public String Imprimir()
		{
			return "("+this.X1 + "," + this.Y1 + "," + this.Z1 + ") (" + this.X2 + "," + this.Y2 + "," + this.Z2+")";
		}

	}
}
