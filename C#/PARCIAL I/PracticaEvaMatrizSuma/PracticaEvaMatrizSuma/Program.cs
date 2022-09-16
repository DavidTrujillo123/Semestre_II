using System;

namespace PracticaEvaMatrizSuma
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Matriz m = new Matriz(2, 3);
			m.Imprimir();
			Console.WriteLine();
			m.LlenarMatriz(1,10);
			m.Imprimir();
			Console.WriteLine("Fila");
			m.SumaFila().Imprimir();
			Console.WriteLine("\ncol");
			m.SumaColumna().Imprimir();
		}
	}
}
