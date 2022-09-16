using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CuadradoMagico
{
	internal class Program
	{
		public static int[][] CuadradoMagico(int n)//tamanio
		{
			int a;
			int b;
			int tamanio;
			int longitud;
			int medio;
			int[][] matriz;

			tamanio = n + 1;

			matriz = new int[tamanio][];

			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[tamanio];
			}

			longitud = matriz.Length - 1;
			medio = longitud / 2;

			matriz[0][longitud] = -1;//fila 0 columna final
			b = medio;
			a = 1;

			int cont;
			cont = 1;
			while (cont <= longitud * longitud)
			{
				//la primera fila pasa al ultimo
				if (a == 0)
				{
					a = longitud;
				}
				//ultima columna pasa al inicio
				if (b == longitud)
				{
					b = 0;
				}

				matriz[a][b] = cont;

				a--;
				b++;

				//Compruba si esta lleno en esa posicion
				if (matriz[a][b] != 0)
				{
					a += 2;
					b--;
				}

				cont++;
			}

			return matriz;
		}
		static void Main(string[] args)
		{
			Console.WriteLine();
			int[][] A = new int[3][];
			int[][] B;
			for (int i = 0; i < A.Length; i++)
			{
				A[i] = new int[3];
			}
			B = CuadradoMagico(3);

			for (int i = 1; i < B.Length; i++)
			{
				for (int j = 0; j < B.Length-1; j++)
				{
					Console.Write(B[i][j] + " ");
				}
				Console.WriteLine();
			}
			Application.EnableVisualStyles();
			Application.SetCompatibleTextRenderingDefault(false);
			Application.Run(new Form1());

			
		}
	}
}
