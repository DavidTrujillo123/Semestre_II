using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Herencia
{
	internal class Persona
	{
		protected string nombre;
		protected string cedula;
		protected int edad;

		public Persona(string nombre, string cedula, int edad)
		{
			this.nombre = nombre;
			this.cedula = cedula;
			this.edad = edad;
		}
		public string Imprimir()
		{
			return "Nombre: "+nombre+"\nCedula: "+cedula+"\nEdad: "+edad;
		}

	}
}
