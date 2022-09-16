using System;

namespace POO_E01_TrujilloDavid
{
	internal class Program
	{
		static void Main(string[] args)
		{
			
			double grados = 45;
			
			SenCos ob1 = new SenCos(grados);

			Console.WriteLine(ob1.Sen());
			Console.WriteLine(ob1.Cos());
			Console.WriteLine(ob1.Transformar());
		}
	}
}
