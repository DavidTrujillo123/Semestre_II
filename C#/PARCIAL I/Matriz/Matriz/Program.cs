using System;

namespace Matriz
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");

			Matriz m1,m2, m3,m4;
			m1 = new Matriz(3,4);
			m2 = new Matriz(4,3);

			m1 = m1.LlenarDatos(m1,1, 10);
			m2 = m2.LlenarDatos(m2,1, 10);

			m3 = m1.Multiplicar(m2);
			Console.WriteLine(m1.Imprimir());
			
			m4 = m1.Transpuesta(m1);
			Console.WriteLine(m4.Imprimir());
		}
	}
}
