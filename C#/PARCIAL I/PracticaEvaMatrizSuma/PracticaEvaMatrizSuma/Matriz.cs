using System;
using System.Collections.Generic;
using System.Text;

namespace PracticaEvaMatrizSuma
{
	internal class Matriz
	{
		private int[][] matriz;

		public Matriz(int fil,int col)
		{
			this.matriz = new int[fil][];
			for (int i = 0; i < fil; i++)
			{
				matriz[i] = new int[col];
			}
		}
		public void LlenarMatriz(int inicio, int fin)
		{
			int aux;
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			Random r = new Random();
			for (int i = 0; i < matriz.Length; i++)
			{
				for (int j = 0; j < matriz[0].Length; j++)
				{
					matriz[i][j] = r.Next(inicio,fin+1);
				}
			}
		}
		public Vector SumaFila()
		{
			Vector vec = new Vector(matriz.Length);
			int suma = 0;

			for (int i = 0; i < matriz.Length; i++)
			{
				for (int j = 0; j < matriz[0].Length; j++)
				{
					suma += matriz[i][j];
				}
				vec.Vec[i] = suma;
				suma = 0;
			}
			return vec;
		}
		public Vector SumaColumna()
		{
			Vector vec1 = new Vector(matriz[0].Length);
			int suma = 0;

			for (int i = 0; i < matriz[0].Length; i++)
			{
				for (int j = 0; j < matriz.Length; j++)
				{
					suma += matriz[j][i];
				}
				vec1.Vec[i] = suma;
				suma = 0;
			}
			return vec1;
		}
		public void Imprimir()
		{
			for (int i = 0; i < matriz.Length; i++)
			{
				for (int j = 0; j < matriz[0].Length; j++)
				{
					Console.Write("{0,5:0}", matriz[i][j]);
				}
				Console.WriteLine();
			}
		}
	}
}
