using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Herencia
{
	internal class Secretaria: Trabajador
	{
		public Secretaria(string nombre, string cedula, int edad, double sueldo) : base(nombre, cedula, edad, sueldo)
		{ }
		public void Escribir()
		{
			Console.WriteLine("Escribiendo...");
		}
		public void Ayudar()
		{
			Console.WriteLine("Ayudando...");
		}
		
	}
}
