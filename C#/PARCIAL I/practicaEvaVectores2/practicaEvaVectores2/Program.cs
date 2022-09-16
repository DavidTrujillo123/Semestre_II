using System;

namespace practicaEvaVectores2
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Vectores3D v1, v2, v3;
			v1 = new Vectores3D(0,0,0,1,2,3);
			v2 = new Vectores3D(2, 10, 0, 1, 2, 3);

			Console.WriteLine(v1.Comparar(v2));

			v3 = v1.Sumar(v2);
			Console.WriteLine(v3.Imprimir());

			Console.WriteLine(v1.CalcularNorma());

		}
	}
}
