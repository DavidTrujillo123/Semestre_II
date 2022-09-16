using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EVA_POO_TrujilloDavid
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Persona[] p = new Persona[3];

			Futbolista f1 = new Futbolista(1001, "ELVA SURITA", 22, 22.33, "PORTERO");
			Entrenador e1 = new Entrenador(111, "JUAN PEREZ", 23, "IMBABURA");
			Masajista m1 = new Masajista(123, "JULIO PANINI", 25, "ENFERMERO", 33);
			
			p[0] = f1; p[1] = e1; p[2] = m1;

			foreach (Persona item in p)
			{
				Console.WriteLine(item);
			}
		}
	}
}
