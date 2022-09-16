using System;

namespace NumeroFraccionario
{
	internal class Program
	{
		public static void Simplificar(int num, int den)
		{
			int aux = 2;
			int div = 0;
			int numr, denr;

			while (true)
			{
				if (num % aux == 0 && den % aux == 0)
				{
					div = aux;
					break;
				}
				aux++;
				if (aux == 9) break;
				
			}

			if (div == 0)
			{
				numr = num;
				denr = den;
				Console.WriteLine(numr+"/"+denr);

			}
			else
			{
				while (true)
				{
					numr = num / div;
					denr = den / div;
					if (numr % div != 0 || denr % div != 0)
					{
						break;
					}
					num = numr;
					den = denr;
				}
				Console.WriteLine(numr + "/" +denr);
			}
			
		}
		static void Main(string[] args)
		{
			Fraccionario f1, f2, f3, f4, f5, fr;
			f1 = new Fraccionario(1, 2);
			f2 = new Fraccionario(3, 4);
			f3 = new Fraccionario(2,8);
			f4 = f3++;
			Console.WriteLine(f4.Imprimir());

			int n = 3;
			int d = 2;
			Mixto m1, m2, m3, m4, m5, m6, m7;
			m1 = new Mixto(n, f1);
			m2 = new Mixto(d, f2);

			m3 = m1.TransformarAMixto(f1);

			Console.WriteLine(m3.Imprimir);
		}
    }
}
