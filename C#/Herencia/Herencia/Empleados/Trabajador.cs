using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Herencia
{
	internal class Trabajador: Persona
	{
		protected double sueldo;
		public Trabajador(string nombre, string cedula, int edad, double sueldo) : base(nombre, cedula, edad)
		{
			this.sueldo = sueldo; 
 		}
		public new string Imprimir()
		{
			return base.Imprimir()+"\nSueldo: "+sueldo;
		}
	}
}
