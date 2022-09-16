using System;
using System.Collections.Generic;
using System.Text;

namespace Matriz
{
	internal class Matriz
	{
		private int[][] datos;
		private Matriz result;
		private Random r;

		public Matriz(int fila, int columna)
		{
			datos = new int[fila][];
			for (int i = 0; i < datos.Length; i++)
			{
				datos[i] = new int[columna];
			}

			r = new Random();
		}
		public Matriz(int num):this(num,num)
		{
			r = new Random();
		}

		public int Filas
		{ 
			get { return datos.Length; }
			set {
				int[][] aux = new int[value][];
				datos = aux;
			}
		}

		public int Columnas
		{
			get { return datos[0].Length;}
			set
			{
				int[][] aux = new int[datos.Length][];
				for (int i = 0; i < aux.Length; i++)
				{
					aux[i] = new int[value];
				}
			}
		}
		public Matriz LlenarDatos(Matriz m, int inicio, int fin)
		{
			
			int aux;
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			int rnd;
			for (int i = 0; i < m.datos.Length; i++)
			{
				for (int j = 0; j < m.datos[0].Length; j++)
				{
					rnd = this.r.Next(inicio, fin+1);
					m.datos[i][j] = rnd;
				}
			}
			return m;
		}
		private Matriz PonerDatos(Matriz r, int fil, int col)
		{
			if (r == null) r = new Matriz(fil, col);
			else
			{
				r.Filas = fil;
				r.Columnas = col;
			}
			return r;
		}
		public Matriz Sumar(int[][] A)
		{
			result = PonerDatos(result, A.Length, A[0].Length);
			for (int i = 0; i < datos.Length; i++)
			{
				for (int j = 0; j < datos[0].Length; j++)
				{
					result.datos[i][j] = this.datos[i][j] + A[i][j]  ;
				}
			}

			return result;
		}
		public Matriz Sumar(Matriz m1)
		{
			return Sumar(m1.datos);
		}
		public static Matriz operator +(Matriz m1 , Matriz m2) 
		{
			return m1.Sumar(m2);
		}
		public static Matriz operator +(Matriz m, int[][] A)
		{
			return m.Sumar(A);
		}
		public static Matriz operator ++(Matriz m)
		{
			return m + m;
		}
		public Matriz Restar(int[][] A)
		{
			result = PonerDatos(result, A.Length, A[0].Length);
			for (int i = 0; i < datos.Length; i++)
			{
				for (int j = 0; j < datos[0].Length; j++)
				{
					result.datos[i][j] = this.datos[i][j] - A[i][j] ;
				}
			}

			return result;
		}
		public Matriz Restar(Matriz m)
		{
			return Restar(m.datos);
		}
		public static Matriz operator -(Matriz m1, Matriz m2)
		{
			return m1.Restar(m2);
		}
		public static Matriz operator -(Matriz m1, int[][] A)
		{
			return m1.Sumar(A);
		}
		public Matriz Multiplicar(int n)
		{
			result = PonerDatos(result, datos.Length, datos[0].Length);

			for (int i = 0; i < datos.Length; i++)
			{
				for (int j = 0; j < datos[0].Length; j++)
				{
					result.datos[i][j] = datos[i][j] * n; 
				}
			}
			return result ;
		}
		public Matriz Multiplicar(int[][] A)
		{
			int a;
			int suma;
			a = 0;
			suma = 0;
			Matriz C;
			C = new Matriz(this.datos.Length, A[0].Length);
			for (int i = 0; i < C.datos.Length; i++)
			{
				for (int j = 0; j < C.datos[0].Length; j++)
				{
					while (a < C.datos.Length)
					{
						suma = datos[i][a]*A[a][j] + suma;
						a++;
					}
					a = 0;
					C.datos[i][j] = suma;
			    suma = 0;
				}
			}
			return C;
		}
		public Matriz Multiplicar(Matriz m)
		{
			return Multiplicar(m.datos);
		}
		public Matriz Transpuesta(Matriz m)
		{
			if (m == null) m = m.PonerDatos(m, this.Filas, this.Columnas);
			Matriz result = new Matriz(m.Columnas, m.Filas);

			for (int i = 0; i < m.Columnas; i++)
			{
				for (int j = 0; j < m.Filas; j++)
				{
					result.datos[i][j] = m.datos[j][i];
				}
			}

			return result;
		}
		public string Imprimir()
		{
			string c = "";
			for (int i = 0; i < datos.Length; i++)
			{
				for (int j = 0; j < datos[0].Length; j++)
				{
					c += "  "+ datos[i][j] ;
				}
				c += "\n";
			}

			return c;
		}

	}
}
