using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal abstract class Animal : SerVivo
	{
		protected Animal(string nombre, int edad) : base(nombre, edad)
		{
		}
	}
}
