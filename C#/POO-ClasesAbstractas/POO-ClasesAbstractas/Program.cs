using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Carnivoro c1 = new Carnivoro("Simba", 10);
			Herbivoro h1 = new Herbivoro("Alex",3);
			Planta p1 = new Planta("Girasol", 23);

			Celular1 c = new Celular1();
			Console.WriteLine(c.DescargarArchivo());
			Console.WriteLine(c.SubirArchivo("PORXO DE ENANOS ALBINOS"));
		}
	}
}
