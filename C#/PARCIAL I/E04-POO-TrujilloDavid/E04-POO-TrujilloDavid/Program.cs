using System;

namespace E04_POO_TrujilloDavid
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Matriz m = new Matriz(3,3);
			m.LlenarMatriz1();
			
			Console.WriteLine(m.Imprimir());

			Matriz trans = m.Transpuesta();
			Console.WriteLine(trans.Imprimir());

			Matriz n = new Matriz(3,3);
			int num;
			for (int i = 0; i < n.Matrix.Length; i++)
			{
				for (int j = 0; j < n.Matrix[0].Length; j++)
				{
					Console.Write("("+i+","+j+")");
					num = int.Parse(Console.ReadLine());
					n.Matrix[i][j] = num;
				}
			}
			Console.WriteLine(n.Imprimir());
			Console.WriteLine(n.Simetrica());

			Matriz suma, resta, mult;
			suma = m + n;
			Console.WriteLine(suma.Imprimir());

			resta = m - n;
			Console.WriteLine(resta.Imprimir());

			mult = m * n;
			Console.WriteLine(mult.Imprimir());
		}
	}
}
