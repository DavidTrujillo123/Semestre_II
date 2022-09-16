using System;
using System.Collections.Generic;
using System.Text;

namespace E04_POO_TrujilloDavid
{
	internal class Matriz
	{
		private int[][] matrix;
		public Matriz(int fil, int col)
		{
			matrix = new int[fil][];
			for (int i = 0; i < fil; i++)
			{
				matrix[i] = new int[col];
			}
		}
		public int[][] Matrix
		{
			get { return matrix; }
			set { matrix = value; }
		}
		public void LlenarMatriz()
		{
			int cont = 1;

			for (int i = Matrix.Length - 1; i >= 0; i--)
			{
				for (int j = Matrix[0].Length - 1; j >= 0; j--)
				{
					this.Matrix[i][j] = cont++;
				}
			}
		}
		public void LlenarMatriz1()
		{
			int cont = 1;

			for (int i = Matrix.Length - 1; i >= 0; i--)
			{
				for (int j = Matrix[0].Length - 1; j >= 0; j--)
				{
					this.Matrix[j][i] = cont++;
				}
			}
		}
		public bool Simetrica()
		{
			for (int i = 0; i < Matrix.Length; i++)
			{
				for (int j = 0; j < Matrix[0].Length; j++)
				{
					if (Matrix[i][j] != Matrix[j][i]) return false;
				}

			}
			return true;
		}
		public Matriz Transpuesta()
		{
			Matriz a = new Matriz(this.Matrix.Length, this.Matrix[0].Length);

			for (int i = 0; i < Matrix.Length; i++)
			{
				for (int j = 0; j < Matrix[0].Length; j++)
				{
					a.Matrix[i][j] = Matrix[j][i];
				}

			}
			return a;
		}
		public Matriz Sumar(Matriz m)
		{
			Matriz res = new Matriz(Matrix.Length, Matrix[0].Length);
			int num;
			for (int i = 0; i < Matrix.Length; i++)
			{
				for (int j = 0; j < Matrix[0].Length; j++)
				{
					num = Matrix[i][j] + m.Matrix[i][j];
					res.Matrix[i][j] = num;
				}
			}
			return res;
		}
		public static Matriz operator +(Matriz n,Matriz m){
			Matriz res = new Matriz(m.Matrix.Length, m.Matrix.Length);
			int num;
			for (int i = 0; i < n.Matrix.Length; i++)
			{
				for (int j = 0; j < n.Matrix[0].Length; j++)
				{
					num = n.Matrix[i][j] + m.Matrix[i][j];
					res.Matrix[i][j] = num;
				}
			}
			return res;
		}
		public static Matriz operator -(Matriz n, Matriz m)
		{
			Matriz res = new Matriz(m.Matrix.Length, m.Matrix.Length);
			int num;
			for (int i = 0; i < n.Matrix.Length; i++)
			{
				for (int j = 0; j < n.Matrix[0].Length; j++)
				{
					num = n.Matrix[i][j] - m.Matrix[i][j];
					res.Matrix[i][j] = num;
				}
			}
			return res;
		}
		public static Matriz operator *(Matriz n, Matriz m) {
			Matriz res = new Matriz(m.Matrix.Length, n.Matrix.Length);
			int num=0;
			int cont=0;
			for (int i = 0; i < n.Matrix.Length; i++)
			{
				for (int j = 0; j < n.Matrix[0].Length; j++)
				{
					num = m.Matrix[i][j] + n.Matrix[j][i];
				}
				res.Matrix[i][cont] = num;
			}
			return res;
		}
		public String Imprimir()
		{
			string c= "";
			for (int i = 0; i < Matrix.Length; i++)
			{
				for (int j = 0; j < Matrix[0].Length; j++)
				{
					c+="  "+Matrix[i][j];
				}
				c += "\n";
			}
			return c;
		}
	}
}
