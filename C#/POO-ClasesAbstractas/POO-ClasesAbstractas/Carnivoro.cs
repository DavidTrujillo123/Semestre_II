using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal class Carnivoro : Animal
	{
		public Carnivoro(string nombre, int edad) : base(nombre, edad)
		{
		}

		protected override string Alimentarse()
		{
			return "Me alimento de carne";
		}
	}
}
